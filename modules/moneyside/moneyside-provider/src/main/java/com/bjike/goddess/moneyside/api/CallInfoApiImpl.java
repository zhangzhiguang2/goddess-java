package com.bjike.goddess.moneyside.api;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.moneyside.bo.CallInfoBO;
import com.bjike.goddess.moneyside.dto.CallInfoDTO;
import com.bjike.goddess.moneyside.entity.CallInfo;
import com.bjike.goddess.moneyside.service.CallInfoSer;
import com.bjike.goddess.moneyside.to.CallInfoTO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 招投信息列表业务接口实现
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-06-05 02:13 ]
 * @Description: [ 招投信息列表业务接口实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Service("callInfoApiImpl")
public class CallInfoApiImpl implements CallInfoAPI {
    @Autowired
    private CallInfoSer callInfoSer;

    @Override
    public Long countCallInfo(CallInfoDTO callInfoDTO) throws SerException {
        return callInfoSer.countCallInfo(callInfoDTO);
    }

    @Override
    public CallInfoBO getOne(String id) throws SerException {
        return callInfoSer.getOne(id);
    }

    @Override
    public List<CallInfoBO> findListCallInfo(CallInfoDTO callInfoDTO) throws SerException {
        return callInfoSer.findListCallInfo(callInfoDTO);
    }

    @Override
    public CallInfoBO insertCallInfo(CallInfoTO callInfoTO) throws SerException {
        return callInfoSer.insertCallInfo(callInfoTO);
    }

    @Override
    public CallInfoBO editCallInfo(CallInfoTO callInfoTO) throws SerException {
        return callInfoSer.editCallInfo(callInfoTO);
    }

    @Override
    public void removeCallInfo(String id) throws SerException {
        callInfoSer.removeCallInfo(id);
    }
}