package com.bjike.goddess.interiorrecommend.api;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.interiorrecommend.bo.RecommendRequireBO;
import com.bjike.goddess.interiorrecommend.dto.RecommendRequireDTO;
import com.bjike.goddess.interiorrecommend.to.RecommendRequireTO;

import java.util.List;

/**
 * 推荐要求业务接口
 *
 * @Author: [ Jason ]
 * @Date: [ 2017-04-09 03:29 ]
 * @Description: [ 推荐要求业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface RecommendRequireAPI {

    /**
     * 新增推荐要求
     *
     * @param to 推荐要求
     * @return 推荐要求
     */
    RecommendRequireBO addModel(RecommendRequireTO to) throws SerException;

    /**
     * 编辑推荐要求
     *
     * @param to 推荐要求
     * @return 推荐要求
     */
    RecommendRequireBO editModel(RecommendRequireTO to) throws SerException;

    /**
     * 删除推荐要求
     *
     * @param id 推荐要求id
     */
    void delete(String id) throws SerException;

    /**
     * 分页查询推荐要求
     *
     * @param dto 推荐要求
     * @return 推荐要求结果集
     */
    List<RecommendRequireBO> pageList(RecommendRequireDTO dto) throws SerException;

    /**
     * 查询总记录数
     *
     * @param dto 查询条件
     */
    Long count(RecommendRequireDTO dto) throws SerException;

    /**
     * 根据id查询
     *
     * @param id id
     */
    RecommendRequireBO findById(String id) throws SerException;
}