package com.bjike.goddess.feedback.service;

import com.bjike.goddess.common.api.dto.Restrict;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.jpa.service.ServiceImpl;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.common.utils.date.DateUtil;
import com.bjike.goddess.contacts.api.InternalContactsAPI;
import com.bjike.goddess.feedback.bo.ProblemAcceptBO;
import com.bjike.goddess.feedback.bo.ProblemFeedbackBO;
import com.bjike.goddess.feedback.dto.ProblemCodeRuleDTO;
import com.bjike.goddess.feedback.dto.ProblemFeedbackDTO;
import com.bjike.goddess.feedback.entity.ProblemAccept;
import com.bjike.goddess.feedback.entity.ProblemCodeRule;
import com.bjike.goddess.feedback.entity.ProblemFeedback;
import com.bjike.goddess.feedback.to.ProblemFeedbackTO;
import com.bjike.goddess.message.api.MessageAPI;
import com.bjike.goddess.message.enums.MsgType;
import com.bjike.goddess.message.enums.RangeType;
import com.bjike.goddess.message.enums.SendType;
import com.bjike.goddess.message.to.MessageTO;
import com.bjike.goddess.organize.api.PositionDetailUserAPI;
import com.bjike.goddess.organize.bo.PositionDetailBO;
import com.bjike.goddess.user.api.UserAPI;
import com.bjike.goddess.user.bo.UserBO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 问题反馈模块业务实现
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-08-01 10:38 ]
 * @Description: [ 问题反馈模块业务实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@CacheConfig(cacheNames = "feedbackSerCache")
@Service
public class ProblemFeedbackSerImpl extends ServiceImpl<ProblemFeedback, ProblemFeedbackDTO> implements ProblemFeedbackSer {
    @Autowired
    private UserAPI userAPI;
    @Autowired
    private ProblemAcceptSer problemAcceptSer;
    @Autowired
    private PositionDetailUserAPI positionDetailUserAPI;
    @Autowired
    private ProblemCodeRuleSer problemCodeRuleSer;
    @Autowired
    private InternalContactsAPI internalContactsAPI;
    @Autowired
    private MessageAPI messageAPI;

    @Override
    public Long count(ProblemFeedbackDTO dto) throws SerException {
        Long count = super.count(dto);
        return count;
    }

    @Override
    public ProblemFeedbackBO getOne(String id) throws SerException {
        ProblemFeedback problemFeedback = super.findById(id);
        return BeanTransform.copyProperties(problemFeedback, ProblemFeedbackBO.class);
    }

    @Override
    public List<ProblemFeedbackBO> list(ProblemFeedbackDTO dto) throws SerException {
        List<ProblemFeedback> problemFeedbacks = super.findByCis(dto);
        List<ProblemFeedbackBO> problemFeedbackBOS = BeanTransform.copyProperties(problemFeedbacks, ProblemFeedbackBO.class);

        return problemFeedbackBOS;
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public ProblemFeedbackBO insert(ProblemFeedbackTO to) throws SerException {
        ProblemFeedback problemFeedback = BeanTransform.copyProperties(to, ProblemFeedback.class, true);
        UserBO userBO = userAPI.currentUser();
        problemFeedback.setInputUser(userBO.getUsername());
        problemFeedback.setGetTime(LocalDateTime.now());
        problemFeedback.setNotification(false);
        problemFeedback.setCreateTime(LocalDateTime.now());
        LocalDateTime a = problemFeedback.getGetTime();
        String ss = DateUtil.dateToString(a.toLocalDate());
        String s = DateUtil.dateToString(a.toLocalDate()).replaceAll("-", "");
        ProblemFeedbackDTO problemFeedbackDTO = new ProblemFeedbackDTO();
        LocalDate now = DateUtil.parseDate(ss);
        problemFeedbackDTO.getConditions().add(Restrict.between("getTime", new LocalDate[]{now, now}));
        long b = super.count(problemFeedbackDTO);
        long num = b + 1;
        String s1 = s + "-" + String.valueOf(num);
        String name = to.getProblemExhibitor();
        List<PositionDetailBO> positionDetailBOS = positionDetailUserAPI.getPositionDetail(name);
        for (PositionDetailBO positionDetailBO : positionDetailBOS) {
            problemFeedback.setArea(positionDetailBO.getArea());
//            positionDetailAPI.findStatus();
            String departmentName = positionDetailBO.getDepartmentName();
            String moduleName = positionDetailBO.getModuleName();
            problemFeedback.setProjectGroup(departmentName);
            if (departmentName != null) {
                ProblemCodeRuleDTO problemCodeRuleDTO = new ProblemCodeRuleDTO();
                problemCodeRuleDTO.getConditions().add(Restrict.or("projectGroup", departmentName));
                problemCodeRuleDTO.getConditions().add(Restrict.or("module", moduleName));
                ProblemCodeRule problemCodeRule = problemCodeRuleSer.findOne(problemCodeRuleDTO);
                if (problemCodeRule != null) {
                    problemFeedback.setProblemNum(problemCodeRule.getProblemCodeRule() + "Q" + s1);

                }
            }

            super.save(problemFeedback);
            String passName = problemFeedback.getProblemExhibitor();
            LocalDateTime getTime = problemFeedback.getGetTime();//获取时间(问题提出时间)
            String area = problemFeedback.getArea();//所属地区
            String projectGroup = problemFeedback.getProjectGroup(); //所属项目组/部门
            String problemExhibitor = problemFeedback.getProblemExhibitor();//问题提出人
            String problemDescription = problemFeedback.getProblemDescription(); //问题描述
            LocalDateTime expectDealTime = problemFeedback.getExpectDealTime();//期望处理时间
            StringBuffer content = new StringBuffer();
            //设置发送内容
            content.append("各位同事:");
            content.append("本人是" + area + " " + projectGroup + " " + problemExhibitor + ",在" + getTime + "发现" + problemDescription + "请在" + expectDealTime + "前跟进处理,谢谢!");
            MessageTO messageTO = new MessageTO();
            messageTO.setContent(content.toString());
            messageTO.setTitle("问题反馈");
            messageTO.setMsgType(MsgType.SYS);
            messageTO.setSendType(SendType.EMAIL);
            messageTO.setRangeType(RangeType.SPECIFIED);
            messageTO.setReceivers(new String[]{"xiazhili_aj@163.com"});

//        String email = internalContactsAPI.getEmail(passName);
//
//
//        messageTO.setReceivers(new String[]{email});
            messageAPI.send(messageTO);
        }
        return BeanTransform.copyProperties(problemFeedback, ProblemFeedbackBO.class);
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public ProblemFeedbackBO edit(ProblemFeedbackTO to) throws SerException {
        if (StringUtils.isNotBlank(to.getId())) {
            ProblemFeedback problemFeedback = super.findById(to.getId());
            problemFeedback.setModifyTime(LocalDateTime.now());
            problemFeedback.setNotification(true);
            problemFeedback.setNotificationWay("邮件");
            problemFeedback.setNotificationTime(LocalDateTime.now());
            super.update(problemFeedback);

            String passName = problemFeedback.getProblemExhibitor();
            String getTime = String.valueOf(problemFeedback.getGetTime());//获取时间(问题提出时间)
            String area = problemFeedback.getArea();//所属地区
            String projectGroup = problemFeedback.getProjectGroup(); //所属项目组/部门
            String problemExhibitor = problemFeedback.getProblemExhibitor();//问题提出人
            String problemDescription = problemFeedback.getProblemDescription(); //问题描述
            String ideaTime = String.valueOf(to.getIdeaTime()); //意见收集完成时间
            StringBuffer content = new StringBuffer();
            //设置发送内容
            content.append("各项目组/部门：");
            content.append("福利模块在" + getTime + "收到" + area + " " + projectGroup + " " + problemExhibitor + "反馈的问题，" +
                    " 问题描述如下：" + problemDescription + "。请各模块就此问题，依据各自的工作权责，提出处理意见或防止再次发生的建议，" +
                    " 并请各模块在" + ideaTime + "前反馈，前回复至综合资源部。特此说明：如果各部门/模块无法在规定时间内提出建议和预计解决时间，" +
                    " 默认为已承担问题处理延后的责任。特此函告，请答复！");
            content.append("综合资源部福利模块" + LocalDate.now());
            MessageTO messageTO = new MessageTO();
            messageTO.setContent(content.toString());
            messageTO.setTitle("协助");
            messageTO.setMsgType(MsgType.SYS);
            messageTO.setSendType(SendType.EMAIL);
            messageTO.setRangeType(RangeType.SPECIFIED);

            String email = internalContactsAPI.getEmail(passName);


            messageTO.setReceivers(new String[]{email});
            messageAPI.send(messageTO);

            return BeanTransform.copyProperties(problemFeedback, ProblemFeedbackBO.class);
        } else {
            throw new SerException("id不能为空");
        }

    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public ProblemAcceptBO problemAccept(ProblemFeedbackTO to) throws SerException {
        if (StringUtils.isNotBlank(to.getId())) {
            ProblemFeedback problemFeedback = super.findById(to.getId());
            ProblemAccept problemAccept = new ProblemAccept();
            BeanTransform.copyProperties(problemFeedback, problemAccept, true);
            problemAccept.setAcceptTime(to.getAcceptTime());
            problemAccept.setIdeaTime(to.getIdeaTime());
            UserBO userBO = userAPI.currentUser();
            String acceptPerson = userBO.getUsername();
            problemAccept.setAcceptPerson(acceptPerson);
            String name = acceptPerson;
            List<PositionDetailBO> positionDetailBOS = positionDetailUserAPI.getPositionDetail(name);
            for (PositionDetailBO positionDetailBO : positionDetailBOS) {
                problemAccept.setAcceptDepartment(positionDetailBO.getDepartmentName());
                problemAccept.setAcceptModule(positionDetailBO.getModuleName());
            }
            problemAcceptSer.update(problemAccept);
            String passName = problemFeedback.getProblemExhibitor();
            String getTime = String.valueOf(problemFeedback.getGetTime());//获取时间(问题提出时间)
            String problemExhibitor = problemFeedback.getProblemExhibitor();//问题提出人
            String problemDescription = problemFeedback.getProblemDescription(); //问题描述
            String ideaTime = String.valueOf(to.getIdeaTime()); //意见收集完成时间
            String acceptTime = String.valueOf(to.getAcceptTime());//问题跟进处理计划完成时间不能为空
            StringBuffer content = new StringBuffer();
            //设置发送内容
            content.append(problemExhibitor+":");
            content.append(   "你好！关于"+getTime+"发现"+problemDescription+"，已收悉。 " +
                    " 经与各项目组/部门商讨，现函付如下： " +
                    " 你的问题我们会在"+ideaTime+"内收集完各项目组各部门意见，计划于"+acceptTime+"反馈处理结果，" +
                    " 如跟你的期望时间有出入，福利模块负责人跟你协商，请悉知！");
            MessageTO messageTO = new MessageTO();
            messageTO.setContent(content.toString());
            messageTO.setTitle("问题受理后的回复");
            messageTO.setMsgType(MsgType.SYS);
            messageTO.setSendType(SendType.EMAIL);
            messageTO.setRangeType(RangeType.SPECIFIED);

            String email = internalContactsAPI.getEmail(passName);


            messageTO.setReceivers(new String[]{email});
            messageAPI.send(messageTO);

            return BeanTransform.copyProperties(problemAccept, ProblemAcceptBO.class);
        } else {
            throw new SerException("id不能为空");
        }

    }

}