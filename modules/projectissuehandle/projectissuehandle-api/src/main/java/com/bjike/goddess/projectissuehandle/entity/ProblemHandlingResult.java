package com.bjike.goddess.projectissuehandle.entity;

import com.bjike.goddess.common.api.entity.BaseEntity;
import com.bjike.goddess.projectissuehandle.enums.ProblemProcessingResult;

import javax.persistence.*;
import java.time.LocalDate;


/**
 * 确认问题处理结果
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-03-23 04:30 ]
 * @Description: [ 确认问题处理结果 ]
 * @Version: [ v1.0.0 ]ike
 * @Copy: [ com.bjike ]
 */
@Entity
@Table(name = "projectissuehandle_problemhandlingresult")
public class ProblemHandlingResult extends BaseEntity {
    /**
     * 项目问题编号
     */
    @Column(name = "projectNum", unique = true,columnDefinition = "VARCHAR(255)   COMMENT '项目问题编号'")
    private String projectNum;
    /**
     * 年份
     */
    @Column(name = "year", columnDefinition = "VARCHAR(255)   COMMENT '年份'")
    private String year;
    /**
     * 地区
     */
    @Column(name = "area", columnDefinition = "VARCHAR(255)   COMMENT '地区'")
    private String area;

    /**
     * 合同外部项目名称
     */
    @Column(name = "externalContractProjectName", columnDefinition = "VARCHAR(255)   COMMENT '合同外部项目名称'")
    private String externalContractProjectName;

    /**
     * 内部项目名称
     */
    @Column(name = "internalProjectName", columnDefinition = "VARCHAR(255)   COMMENT '内部项目名称'")
    private String internalProjectName;

    /**
     * 工程类型
     */
    @Column(name = "projectType", columnDefinition = "VARCHAR(255)   COMMENT '工程类型'")
    private String projectType;

    /**
     * 问题受理时间
     */
    @Column(name = "problemAcceptTime", columnDefinition = "DATE   COMMENT '问题受理时间'")
    private LocalDate problemAcceptTime;

    /**
     * 问题具体情况
     */
    @Column(name = "problemSpecificSituation", columnDefinition = "VARCHAR(255)   COMMENT '问题具体情况'")
    private String problemSpecificSituation;

    /**
     * 问题对象
     */
    @Column(name = "problemObject", columnDefinition = "VARCHAR(255)   COMMENT '问题对象'")
    private String problemObject;

    /**
     * 问题责任人员
     */
    @Column(name = "problemResponsible", columnDefinition = "VARCHAR(255)   COMMENT '问题责任人员'")
    private String problemResponsible;

    /**
     * 问题处理人员
     */
    @Column(name = "problemHandler", columnDefinition = "VARCHAR(255)   COMMENT '问题处理人员'")
    private String problemHandler;

    /**
     * 问题相关部门
     */
    @Column(name = "problemRelevantDepartment", columnDefinition = "VARCHAR(255)   COMMENT '问题相关部门'")
    private String problemRelevantDepartment;

    /**
     * 问题发生时间
     */
    @Column(name = "problemOccurrenceTime", columnDefinition = "DATE   COMMENT '问题发生时间'")
    private LocalDate problemOccurrenceTime;

    /**
     * 问题发生地点
     */
    @Column(name = "problemOccurrencePlace", columnDefinition = "VARCHAR(255)   COMMENT '问题发生地点'")
    private String problemOccurrencePlace;

    /**
     * 问题解决时间
     */
    @Column(name = "problemSolveTime", columnDefinition = "DATE   COMMENT '问题解决时间'")
    private LocalDate problemSolveTime;

    /**
     * 问题处理结果
     */
    @Column(name = "problemProcessingResult", columnDefinition = "TINYINT(2)   COMMENT '问题处理结果'")
    private ProblemProcessingResult problemProcessingResult;

    /**
     * 问题总结
     */
    @Column(name = "problemConclusion", columnDefinition = "VARCHAR(255)   COMMENT '问题总结'")
    private String problemConclusion;
    /**
     * 项目执行中的问题受理
     */
//    @OneToOne(fetch = FetchType.EAGER , cascade = {CascadeType.PERSIST} )
//    @JoinColumn(name = "problemAccept_id",nullable = false, columnDefinition = "VARCHAR(36)   COMMENT '项目执行中的问题受理'")
//    private ProblemAccept problemAccept;
    public String getProjectNum() {
        return projectNum;
    }

    public void setProjectNum(String projectNum) {
        this.projectNum = projectNum;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExternalContractProjectName() {
        return externalContractProjectName;
    }

    public void setExternalContractProjectName(String externalContractProjectName) {
        this.externalContractProjectName = externalContractProjectName;
    }

    public String getInternalProjectName() {
        return internalProjectName;
    }

    public void setInternalProjectName(String internalProjectName) {
        this.internalProjectName = internalProjectName;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public LocalDate getProblemAcceptTime() {
        return problemAcceptTime;
    }

    public void setProblemAcceptTime(LocalDate problemAcceptTime) {
        this.problemAcceptTime = problemAcceptTime;
    }

    public String getProblemSpecificSituation() {
        return problemSpecificSituation;
    }

    public void setProblemSpecificSituation(String problemSpecificSituation) {
        this.problemSpecificSituation = problemSpecificSituation;
    }

    public String getProblemObject() {
        return problemObject;
    }

    public void setProblemObject(String problemObject) {
        this.problemObject = problemObject;
    }

    public String getProblemResponsible() {
        return problemResponsible;
    }

    public void setProblemResponsible(String problemResponsible) {
        this.problemResponsible = problemResponsible;
    }

    public String getProblemHandler() {
        return problemHandler;
    }

    public void setProblemHandler(String problemHandler) {
        this.problemHandler = problemHandler;
    }

    public String getProblemRelevantDepartment() {
        return problemRelevantDepartment;
    }

    public void setProblemRelevantDepartment(String problemRelevantDepartment) {
        this.problemRelevantDepartment = problemRelevantDepartment;
    }

    public LocalDate getProblemOccurrenceTime() {
        return problemOccurrenceTime;
    }

    public void setProblemOccurrenceTime(LocalDate problemOccurrenceTime) {
        this.problemOccurrenceTime = problemOccurrenceTime;
    }

    public String getProblemOccurrencePlace() {
        return problemOccurrencePlace;
    }

    public void setProblemOccurrencePlace(String problemOccurrencePlace) {
        this.problemOccurrencePlace = problemOccurrencePlace;
    }

    public LocalDate getProblemSolveTime() {
        return problemSolveTime;
    }

    public void setProblemSolveTime(LocalDate problemSolveTime) {
        this.problemSolveTime = problemSolveTime;
    }

    public ProblemProcessingResult getProblemProcessingResult() {
        return problemProcessingResult;
    }

    public void setProblemProcessingResult(ProblemProcessingResult problemProcessingResult) {
        this.problemProcessingResult = problemProcessingResult;
    }

    public String getProblemConclusion() {
        return problemConclusion;
    }

    public void setProblemConclusion(String problemConclusion) {
        this.problemConclusion = problemConclusion;
    }

//    public ProblemAccept getProblemAccept() {
//        return problemAccept;
//    }
//
//    public void setProblemAccept(ProblemAccept problemAccept) {
//        this.problemAccept = problemAccept;
//    }
}