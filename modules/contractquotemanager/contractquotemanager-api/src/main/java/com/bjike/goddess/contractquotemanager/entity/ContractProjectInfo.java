package com.bjike.goddess.contractquotemanager.entity;

import com.bjike.goddess.common.api.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * 合同项目基本信息(临时表存放数据商务模块获取数据)
 *
 * @Author: [ yewenbo ]
 * @Date: [ 2017-03-21 07:18 ]
 * @Description: []
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Entity
@Table(name = "contractquotemanager_contractprojectinfo")
public class ContractProjectInfo extends BaseEntity {

    /**
     * 地区
     */
    @Column(name = "area", nullable = false, columnDefinition = "VARCHAR(255) COMMENT '地区'")
    private String area;

    /**
     * 项目组
     */
    @Column(name = "projectGroup", nullable = false, columnDefinition = "VARCHAR(255) COMMENT '项目组'")
    private String projectGroup;

    /**
     * 项目内部结构
     */
    @Column(name = "projectInner", nullable = false, columnDefinition = "VARCHAR(255) COMMENT '项目内部结构'")
    private String projectInner;

    /**
     * 派工项目名称
     */
    @Column(name = "dispatchProject", nullable = false, columnDefinition = "VARCHAR(255) COMMENT '派工项目名称'")
    private String dispatchProject;

    /**
     * 派工单编号
     */
    @Column(name = "dispatchNum", nullable = false, columnDefinition = "VARCHAR(255) COMMENT '派工单编号'")
    private String dispatchNum;

    /**
     * 派工合同号
     */
    @Column(name = "outProjectNum", nullable = false, columnDefinition = "VARCHAR(255) COMMENT '派工合同号'")
    private String outProjectNum;

    /**
     * 开工时间
     */
    @Column(name = "startProjectTime", nullable = false, columnDefinition = "VARCHAR(255) COMMENT '开工时间'")
    private String startProjectTime;

    /**
     * 完工时间
     */
    @Column(name = "endProjectTime", nullable = false, columnDefinition = "VARCHAR(255) COMMENT '完工时间'")
    private String endProjectTime;

    /**
     * 完工时间(单位：个月)
     */
    @Column(name = "completeTime", nullable = false, columnDefinition = "INT(11) COMMENT '完工时间(单位：个月)'")
    private Integer completeTime;

    /**
     * 合同金额(单位:万元)
     */
    @Column(name = "money", nullable = false, columnDefinition = "DECIMAL(10,2) COMMENT '合同金额(单位:万元)'")
    private Double money;

    /**
     * 派工单位
     */
    @Column(name = "majorCompany", nullable = false, columnDefinition = "VARCHAR(255) COMMENT '派工单位'")
    private String majorCompany;

    /**
     * 合同规模数
     */
    @Column(name = "contractScale", nullable = false, columnDefinition = "VARCHAR(255) COMMENT '合同规模数'")
    private String contractScale;

    /**
     * 回款周期
     */
    @Column(name = "receivableNum", nullable = false, columnDefinition = "DECIMAL(10,2) COMMENT '回款周期'")
    private Double receivableNum;

    /**
     * 重点性
     */
    @Column(name = "emphasis", nullable = false, columnDefinition = "VARCHAR(255) COMMENT '重点性'")
    private String emphasis;

    /**
     * 难易程度
     */
    @Column(name = "difficulty", nullable = false, columnDefinition = "VARCHAR(255) COMMENT '难易程度'")
    private String difficulty;


    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getProjectGroup() {
        return projectGroup;
    }

    public void setProjectGroup(String projectGroup) {
        this.projectGroup = projectGroup;
    }

    public String getProjectInner() {
        return projectInner;
    }

    public void setProjectInner(String projectInner) {
        this.projectInner = projectInner;
    }

    public String getDispatchProject() {
        return dispatchProject;
    }

    public void setDispatchProject(String dispatchProject) {
        this.dispatchProject = dispatchProject;
    }

    public String getDispatchNum() {
        return dispatchNum;
    }

    public void setDispatchNum(String dispatchNum) {
        this.dispatchNum = dispatchNum;
    }

    public String getOutProjectNum() {
        return outProjectNum;
    }

    public void setOutProjectNum(String outProjectNum) {
        this.outProjectNum = outProjectNum;
    }

    public String getStartProjectTime() {
        return startProjectTime;
    }

    public void setStartProjectTime(String startProjectTime) {
        this.startProjectTime = startProjectTime;
    }

    public String getEndProjectTime() {
        return endProjectTime;
    }

    public void setEndProjectTime(String endProjectTime) {
        this.endProjectTime = endProjectTime;
    }

    public Integer getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Integer completeTime) {
        this.completeTime = completeTime;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getMajorCompany() {
        return majorCompany;
    }

    public void setMajorCompany(String majorCompany) {
        this.majorCompany = majorCompany;
    }

    public String getContractScale() {
        return contractScale;
    }

    public void setContractScale(String contractScale) {
        this.contractScale = contractScale;
    }

    public Double getReceivableNum() {
        return receivableNum;
    }

    public void setReceivableNum(Double receivableNum) {
        this.receivableNum = receivableNum;
    }

    public String getEmphasis() {
        return emphasis;
    }

    public void setEmphasis(String emphasis) {
        this.emphasis = emphasis;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
}