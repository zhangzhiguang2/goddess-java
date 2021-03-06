package com.bjike.goddess.projectprocing.api;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.projectprocing.bo.ProjectCarryAuditBO;
import com.bjike.goddess.projectprocing.dto.ProjectCarryAuditDTO;
import com.bjike.goddess.projectprocing.to.ProjectCarryAuditTO;

import java.util.List;

/**
 * 项目实施审核(针对没派工单情况)业务接口
 *
 * @Author: [ tanghaixiang ]
 * @Date: [ 2017-03-31 06:41 ]
 * @Description: [ 项目实施审核(针对没派工单情况)业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface ProjectCarryAuditAPI {

    /**
     * 项目实施审核列表总条数
     *
     */
    default Long countProjectCarryAudit(ProjectCarryAuditDTO projectCarryAuditDTO) throws SerException {
        return null;
    }
    /**
     * 根据id获取项目实施审核列表
     * @return class ProjectCarryAuditBO
     */
    default ProjectCarryAuditBO getOneById(String id) throws SerException {return null;}



    /**
     * 项目实施审核列表
     * @return class ProjectCarryAuditBO
     */
    default List<ProjectCarryAuditBO> listProjectCarryAudit(ProjectCarryAuditDTO projectCarryAuditDTO) throws SerException {return null;}
    /**
     *  添加
     * @param projectCarryAuditTO 项目实施审核信息
     * @return class ProjectCarryAuditBO
     */
    default ProjectCarryAuditBO addProjectCarryAudit(ProjectCarryAuditTO projectCarryAuditTO) throws SerException { return null;}

    /**
     *  编辑
     * @param projectCarryAuditTO 项目实施审核信息
     * @return class ProjectCarryAuditBO
     */
    default ProjectCarryAuditBO editProjectCarryAudit(ProjectCarryAuditTO projectCarryAuditTO) throws SerException { return null;}

    /**
     * 删除
     * @param id id
     */
    default void deleteProjectCarryAudit(String id ) throws SerException {return;};

    /**
     * 搜索查询
     * @return class ProjectCarryAuditBO
     */
    default List<ProjectCarryAuditBO> searchListProjectCarryAudit(ProjectCarryAuditDTO projectCarryAuditDTO) throws SerException {return null;}

}