package com.bjike.goddess.staffactivity.action.staffactivity;

import com.bjike.goddess.common.api.entity.ADD;
import com.bjike.goddess.common.api.entity.EDIT;
import com.bjike.goddess.common.api.exception.ActException;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.restful.Result;
import com.bjike.goddess.common.consumer.interceptor.login.LoginAuth;
import com.bjike.goddess.common.consumer.restful.ActResult;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.staffactivity.api.ActivityApplyInforAPI;
import com.bjike.goddess.staffactivity.bo.ActivityApplyInforBO;
import com.bjike.goddess.staffactivity.bo.ActivityStaffListBO;
import com.bjike.goddess.staffactivity.dto.ActivityApplyInforDTO;
import com.bjike.goddess.staffactivity.to.ActivityApplyInforTO;
import com.bjike.goddess.staffactivity.vo.ActivityApplyInforVO;
import com.bjike.goddess.staffactivity.vo.ActivityStaffListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 活动申请信息
 *
 * @Author: [ sunfengtao ]
 * @Date: [ 2017-04-08 05:10 ]
 * @Description: [  ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@RestController
@RequestMapping("activityapplyinfor")
public class ActivityApplyInforAct {

    @Autowired
    private ActivityApplyInforAPI activityApplyInforAPI;

    /**
     * 根据id查询活动申请信息
     *
     * @param id 活动申请信息唯一标识
     * @return class ActivityApplyInforVO
     * @throws ActException
     * @version v1
     */
    @GetMapping("v1/activityapplyinfor/{id}")
    public Result findById(@PathVariable(value = "id") String id, HttpServletRequest request) throws ActException {
        try {
            ActivityApplyInforBO bo = activityApplyInforAPI.findById(id);
            ActivityApplyInforVO vo = BeanTransform.copyProperties(bo, ActivityApplyInforVO.class, request);
            return ActResult.initialize(vo);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 计算总数量
     *
     * @param dto 活动申请信息dto
     * @throws ActException
     * @version v1
     */
    @GetMapping("v1/count")
    public Result count(@Validated ActivityApplyInforDTO dto, BindingResult result) throws ActException {
        try {
            Long count = activityApplyInforAPI.count(dto);
            return ActResult.initialize(count);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }
    
    /**
     * 分页查询活动申请信息
     *
     * @param dto 活动申请信息dto
     * @return class ActivityApplyInforVO
     * @throws ActException
     * @version v1
     */
    @GetMapping("v1/list")
    public Result list(ActivityApplyInforDTO dto, HttpServletRequest request) throws ActException {
        try {
            List<ActivityApplyInforBO> boList = activityApplyInforAPI.list(dto);
            List<ActivityApplyInforVO> voList = BeanTransform.copyProperties(boList, ActivityApplyInforVO.class, request);
            return ActResult.initialize(voList);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 添加活动申请信息
     *
     * @param to 活动申请信息to
     * @return class ActivityApplyInforVO
     * @throws ActException
     * @version v1
     */
    @LoginAuth
    @PostMapping("v1/add")
    public Result add(@Validated({ADD.class}) ActivityApplyInforTO to, HttpServletRequest request) throws ActException {
        try {
            ActivityApplyInforBO bo = activityApplyInforAPI.save(to);
            ActivityApplyInforVO vo = BeanTransform.copyProperties(bo, ActivityApplyInforVO.class, request);
            return ActResult.initialize(vo);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 根据id删除活动申请信息
     *
     * @param id 活动申请信息唯一标识
     * @throws ActException
     * @version v1
     */
    @LoginAuth
    @DeleteMapping("v1/delete/{id}")
    public Result delete(@PathVariable(value = "id") String id) throws ActException {
        try {
            activityApplyInforAPI.remove(id);
            return new ActResult("delete success!");
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 编辑活动申请信息
     *
     * @param to 活动申请信息to
     * @throws ActException
     * @version v1
     */
    @LoginAuth
    @PutMapping("v1/edit")
    public Result edit(@Validated({EDIT.class}) ActivityApplyInforTO to) throws ActException {
        try {
            activityApplyInforAPI.update(to);
            return new ActResult("edit success!");
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 参与该活动
     *
     * @param id 活动申请信息唯一标识
     * @param area 地区
     * @throws ActException
     * @version v1
     */
    @LoginAuth
    @PutMapping("v1/joinActivity/{id}")
    public Result joinActivity(@PathVariable(value = "id") String id, @RequestParam(value = "area") String area) throws ActException {
        try {
            activityApplyInforAPI.joinActivity(id, area);
            return new ActResult("joinActivity success!");
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 退出该活动
     *
     * @param id 活动申请信息唯一标识
     * @param abandonReason 放弃原因
     * @throws ActException
     * @version v1
     */
    @LoginAuth
    @PutMapping("v1/exitActivity/{id}")
    public Result exitActivity(@PathVariable(value = "id") String id, @RequestParam(value = "abandonReason") String abandonReason) throws ActException {
        try {
            activityApplyInforAPI.exitActivity(id, abandonReason);
            return new ActResult("exitActivity success!");
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 查看活动人员名单
     *
     * @param id 活动申请信息唯一标识
     * @return class ActivityStaffListVO
     * @throws ActException
     * @version v1
     */
    @GetMapping("v1/checkStaffList/{id}")
    public Result checkStaffList(@PathVariable(value = "id") String id, HttpServletRequest request) throws ActException {
        try {
            List<ActivityStaffListBO> boList = activityApplyInforAPI.checkStaffList(id);
            List<ActivityStaffListVO> voList = BeanTransform.copyProperties(boList, ActivityStaffListVO.class, request);
            return ActResult.initialize(voList);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

}