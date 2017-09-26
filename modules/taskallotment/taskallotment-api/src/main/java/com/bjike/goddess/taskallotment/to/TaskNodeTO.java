package com.bjike.goddess.taskallotment.to;

import com.bjike.goddess.common.api.entity.ADD;
import com.bjike.goddess.common.api.to.BaseTO;
import com.bjike.goddess.taskallotment.enums.FinishStatus;
import com.bjike.goddess.taskallotment.enums.TaskStatus;
import com.bjike.goddess.taskallotment.enums.TaskType;
import com.bjike.goddess.taskallotment.enums.TimeType;
import org.hibernate.validator.constraints.NotBlank;

import java.util.List;

/**
 * 任务节点
 *
 * @Author: [ chenjunhao ]
 * @Date: [ 2017-09-14 02:10 ]
 * @Description: [ 任务节点 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class TaskNodeTO extends BaseTO {
    /**
     * 地区
     */
    private String area;
    /**
     * 项目组/部门
     */
    private String depart;
    /**
     * 项目名称
     */
    private String project;
    /**
     * 项目表id
     */
    @NotBlank(groups = {ADD.class}, message = "项目表id不能为空")
    private String tableId;
    /**
     * 任务名称
     */
    private String taskName;

    /**
     * 负责人
     */
    private String charge;

    /**
     * 执行人
     */
    private String execute;

    /**
     * 计划执行时间
     */
    private String planTime;

    /**
     * 任务类型
     */
    private TaskType taskType;

    /**
     * 任务内容
     */
    private String content;

    /**
     * 计划任务量
     */
    private Double planNum;
    /**
     * 完成任务量
     */
    private Double actualNum;

    /**
     * 所需时长
     */
    private Double needTime;

    /**
     * 所需时长时间类型
     */
    private TimeType needType;

    /**
     * 任务开始时间
     */
    private String startTime;
    /**
     * 任务结束时间
     */
    private String endTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 任务是否拆分
     */
    private Boolean split;

    /**
     * 拆分为（天）
     */
    private Double day;
    /**
     * 执行时长
     */
    private Double executeTime;

    /**
     * 执行时长时间类型
     */
    private TimeType executeType;
    /**
     * 开始执行时间
     */
    private String startExecute;
    /**
     * 结束执行时间
     */
    private String endExecute;
    /**
     * 实际时长
     */
    private Double actualTime;
    /**
     * 实际时长时间类型
     */
    private TimeType actualType;
    /**
     * 未完成时长
     */
    private Double undoneTime;
    /**
     * 未完成时长时间类型
     */
    private TimeType undoneType;
    /**
     * 完成时间
     */
    private String finishTime;
    /**
     * 执行人地区
     */
    private String executeArea;

    /**
     * 执行人部门
     */
    private String executeDepart;
    /**
     * 完成状态
     */
    private FinishStatus finishStatus;
    /**
     * 确认状态
     */
    private Boolean confirm;
    /**
     * 是否发生费用报销
     */
    private Boolean reimbursement;

    /**
     * 注意事项
     */
    private String notice;
    /**
     * 是否有附件
     */
    private Boolean attachment;
    /**
     * 是否出现问题
     */
    private Boolean question;

    /**
     * 是否上报
     */
    private Boolean report;
    /**
     * 是否延期完成
     */
    private Boolean delay;
    /**
     * 延期时长
     */
    private Double delayTime;
    /**
     * 延期时长时间类型
     */
    private TimeType delayType;
    /**
     * 上报原因
     */
    private String reportReason;
    /**
     * 商量结果
     */
    private String result;
    /**
     * 不通过理由
     */
    private String notPassReason;
    /**
     * 任务工作总结
     */
    private String summary;
    /**
     * 任务状态
     */
    private TaskStatus taskStatus;
    /**
     * 问题集合
     */
    private List<QuestionTO> questions;
    /**
     * 自定义字段集合
     */
    private List<CustomTitleTO> customTitles;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getNotPassReason() {
        return notPassReason;
    }

    public void setNotPassReason(String notPassReason) {
        this.notPassReason = notPassReason;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public String getExecute() {
        return execute;
    }

    public void setExecute(String execute) {
        this.execute = execute;
    }

    public String getPlanTime() {
        return planTime;
    }

    public void setPlanTime(String planTime) {
        this.planTime = planTime;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Double getPlanNum() {
        return planNum;
    }

    public void setPlanNum(Double planNum) {
        this.planNum = planNum;
    }

    public Double getActualNum() {
        return actualNum;
    }

    public void setActualNum(Double actualNum) {
        this.actualNum = actualNum;
    }

    public Double getNeedTime() {
        return needTime;
    }

    public void setNeedTime(Double needTime) {
        this.needTime = needTime;
    }

    public TimeType getNeedType() {
        return needType;
    }

    public void setNeedType(TimeType needType) {
        this.needType = needType;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Boolean getSplit() {
        return split;
    }

    public void setSplit(Boolean split) {
        this.split = split;
    }

    public Double getDay() {
        return day;
    }

    public void setDay(Double day) {
        this.day = day;
    }

    public Double getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(Double executeTime) {
        this.executeTime = executeTime;
    }

    public TimeType getExecuteType() {
        return executeType;
    }

    public void setExecuteType(TimeType executeType) {
        this.executeType = executeType;
    }

    public String getStartExecute() {
        return startExecute;
    }

    public void setStartExecute(String startExecute) {
        this.startExecute = startExecute;
    }

    public String getEndExecute() {
        return endExecute;
    }

    public void setEndExecute(String endExecute) {
        this.endExecute = endExecute;
    }

    public Double getActualTime() {
        return actualTime;
    }

    public void setActualTime(Double actualTime) {
        this.actualTime = actualTime;
    }

    public TimeType getActualType() {
        return actualType;
    }

    public void setActualType(TimeType actualType) {
        this.actualType = actualType;
    }

    public Double getUndoneTime() {
        return undoneTime;
    }

    public void setUndoneTime(Double undoneTime) {
        this.undoneTime = undoneTime;
    }

    public TimeType getUndoneType() {
        return undoneType;
    }

    public void setUndoneType(TimeType undoneType) {
        this.undoneType = undoneType;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public String getExecuteArea() {
        return executeArea;
    }

    public void setExecuteArea(String executeArea) {
        this.executeArea = executeArea;
    }

    public String getExecuteDepart() {
        return executeDepart;
    }

    public void setExecuteDepart(String executeDepart) {
        this.executeDepart = executeDepart;
    }

    public FinishStatus getFinishStatus() {
        return finishStatus;
    }

    public void setFinishStatus(FinishStatus finishStatus) {
        this.finishStatus = finishStatus;
    }

    public Boolean getConfirm() {
        return confirm;
    }

    public void setConfirm(Boolean confirm) {
        this.confirm = confirm;
    }

    public Boolean getReimbursement() {
        return reimbursement;
    }

    public void setReimbursement(Boolean reimbursement) {
        this.reimbursement = reimbursement;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public Boolean getAttachment() {
        return attachment;
    }

    public void setAttachment(Boolean attachment) {
        this.attachment = attachment;
    }

    public Boolean getQuestion() {
        return question;
    }

    public void setQuestion(Boolean question) {
        this.question = question;
    }

    public Boolean getReport() {
        return report;
    }

    public void setReport(Boolean report) {
        this.report = report;
    }

    public Boolean getDelay() {
        return delay;
    }

    public void setDelay(Boolean delay) {
        this.delay = delay;
    }

    public Double getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(Double delayTime) {
        this.delayTime = delayTime;
    }

    public TimeType getDelayType() {
        return delayType;
    }

    public void setDelayType(TimeType delayType) {
        this.delayType = delayType;
    }

    public String getReportReason() {
        return reportReason;
    }

    public void setReportReason(String reportReason) {
        this.reportReason = reportReason;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public List<QuestionTO> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuestionTO> questions) {
        this.questions = questions;
    }

    public List<CustomTitleTO> getCustomTitles() {
        return customTitles;
    }

    public void setCustomTitles(List<CustomTitleTO> customTitles) {
        this.customTitles = customTitles;
    }
}