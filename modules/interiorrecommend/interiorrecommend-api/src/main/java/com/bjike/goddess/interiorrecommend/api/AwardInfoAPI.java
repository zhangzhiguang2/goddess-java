package com.bjike.goddess.interiorrecommend.api;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.interiorrecommend.bo.AwardInfoBO;
import com.bjike.goddess.interiorrecommend.bo.AwardStandardBO;
import com.bjike.goddess.interiorrecommend.bo.RecommendInfoBO;
import com.bjike.goddess.interiorrecommend.dto.AwardInfoDTO;
import com.bjike.goddess.interiorrecommend.dto.RecommendInfoDTO;
import com.bjike.goddess.interiorrecommend.excel.SonPermissionObject;
import com.bjike.goddess.interiorrecommend.to.AwardInfoTO;
import com.bjike.goddess.interiorrecommend.to.GuidePermissionTO;

import java.util.List;

/**
 * 推荐奖励信息业务接口
 *
 * @Author: [ Jason ]
 * @Date: [ 2017-04-10 04:07 ]
 * @Description: [ 推荐奖励信息业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface AwardInfoAPI {

    /**
     * 下拉导航权限
     */
    default List<SonPermissionObject> sonPermission() throws SerException {
        return null;
    }

    /**
     * 导航权限
     */
    default Boolean guidePermission(GuidePermissionTO guidePermissionTO) throws SerException {
        return null;
    }

    /**
     * 编辑奖励信息
     *
     * @param to 奖励信息
     * @return 奖励信息
     */
    AwardInfoBO editModel(AwardInfoTO to) throws SerException;

    /**
     * 列表
     *
     * @param dto 条件
     * @return
     * @throws SerException
     */
    List<RecommendInfoBO> pageList(RecommendInfoDTO dto) throws SerException;

    /**
     * 根据id来查询推荐奖励信息
     * @param id
     * @throws SerException
     */
    AwardInfoBO findOne(String id) throws SerException;

    /**
     * 查询总记录数
     *
     * @param dto 查询条件
     */
    Long count(AwardInfoDTO dto) throws SerException;

}