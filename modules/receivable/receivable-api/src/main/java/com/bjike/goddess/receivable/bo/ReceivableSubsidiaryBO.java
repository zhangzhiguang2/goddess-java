package com.bjike.goddess.receivable.bo;

import com.bjike.goddess.common.api.bo.BaseBO;
import com.bjike.goddess.receivable.enums.AuditStatus;

import javax.persistence.Column;
import java.util.List;
import java.util.Map;

/**
 * 回款明细业务传输对象
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-03-28 04:09 ]
 * @Description: [ 回款明细业务传输对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class ReceivableSubsidiaryBO extends BaseBO {

    /**
     * 地区
     */
    private String area;

    /**
     * 项目内部名称
     */
    private String innerName;

    /**
     * 派工单编号
     */
    private String taskNum;

    /**
     * 派工单价
     */
    private Double taskPrice;

    /**
     * 合同规模数
     */
    private Double pactNum;

    /**
     * 合同规模金额(派工单价*合同规模数)
     */
    private Double pactMoney;

    /**
     * 已派工量
     */
    private Double pactSize;

    /**
     * 中兴派工金额(派工单价*已派工量)
     */
    private Double taskMoney;

    /**
     * 已完工量
     */
    private Double finishNum;

    /**
     * 已完工金额(派工单价*已完工量)
     */
    private Double finishMoney;

    /**
     * 未完工量
     */
    private Double unfinishNum;

    /**
     * 未完工金额(派工单价*未完工量)
     */
    private Double unfinishMoney;

    /**
     * 已交维数量
     */
    private Double paytax;

    /**
     * 未交维数量
     */
    private Double undeal;

    /**
     * 违约金
     */
    private Double penalty;

    /**
     * 实际结算数量
     */
    private Double realCountNum;

    /**
     * 实际数量金额
     */
    private Double realCountMoney;

    /**
     * 完工时间
     */
    private String finishDate;

    /**
     * 验收交维时间
     */
    private String checkDate;

    /**
     * 签字审批时间
     */
    private String auditDate;

    /**
     * 结算审批时间
     */
    private String countDate;

    /**
     * 发票审核时间
     */
    private String billDate;

    /**
     * 预计支付时间
     */
    private String planDate;

    /**
     * 管理费(实际数量金额*承包商比例)
     */
    private Double managementFee;

    /**
     * 到账时间
     */
    private Double accountDate;

    /**
     * 结算进度:A
     */
    private String progressA;

    /**
     * 结算进度:B
     */
    private String progressB;

    /**
     * 结算进度:C
     */
    private String progressC;

    /**
     * 结算进度:D
     */
    private String progressD;

    /**
     * 到账金额(实际数量金额*管理费)
     */
    private Double accountMoney;

    /**
     * 税金(到账金额*6.79%)
     */
    private Double taxes;

    /**
     * 税后金额(到账金额-税金)
     */
    private Double afterTax;

    /**
     * 剩余结算量(已派工量-实际结算数量)
     */
    private Double moreNum;

    /**
     * 剩余结算金额(派工单价*剩余结算量)
     */
    private Double moreMoney;

    /**
     * 承包商
     */
    private String contractor;

    /**
     * 是否已支付
     */
    private Boolean ispay;

    /**
     * 是否框架内
     */
    private Boolean isframe;

    /**
     * 是否有单次合同
     */
    private Boolean ispact;

    /**
     * 是否已走结算流程
     */
    private Boolean isflow;


    private AuditStatus auditStatus;//是否签字审核
    private AuditStatus countStatus;//是否结算审核
    private AuditStatus billStatus;//是否发票审核
    private AuditStatus planStatus;//是否预支付

    private Double minusMoney;//差额
    private Double increase;//增长率
    private Double percentage;//百分比
    private String percentageStr;//百分比%

    /**
     * 备注
     */
    private String remark;
    /**
     * 个数
     */
    private int counts;
    /**
     * 数据库枚举转换
     */
    private int enumConvert;

    /**
     * 地区汇总集合
     */
    private List<Map<String, String>> areaMap;



    public List<Map<String, String>> getAreaMap() {
        return areaMap;
    }

    public void setAreaMap(List<Map<String, String>> areaMap) {
        this.areaMap = areaMap;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getCounts() {
        return counts;
    }

    public void setCounts(int counts) {
        this.counts = counts;
    }

    public int getEnumConvert() {
        return enumConvert;
    }

    public void setEnumConvert(int enumConvert) {
        this.enumConvert = enumConvert;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getInnerName() {
        return innerName;
    }

    public void setInnerName(String innerName) {
        this.innerName = innerName;
    }

    public String getTaskNum() {
        return taskNum;
    }

    public void setTaskNum(String taskNum) {
        this.taskNum = taskNum;
    }

    public Double getTaskPrice() {
        return taskPrice;
    }

    public void setTaskPrice(Double taskPrice) {
        this.taskPrice = taskPrice;
    }

    public Double getPactNum() {
        return pactNum;
    }

    public void setPactNum(Double pactNum) {
        this.pactNum = pactNum;
    }

    public Double getPactMoney() {
        return pactMoney;
    }

    public void setPactMoney(Double pactMoney) {
        this.pactMoney = pactMoney;
    }

    public Double getPactSize() {
        return pactSize;
    }

    public void setPactSize(Double pactSize) {
        this.pactSize = pactSize;
    }

    public Double getTaskMoney() {
        return taskMoney;
    }

    public void setTaskMoney(Double taskMoney) {
        this.taskMoney = taskMoney;
    }

    public Double getFinishNum() {
        return finishNum;
    }

    public void setFinishNum(Double finishNum) {
        this.finishNum = finishNum;
    }

    public Double getFinishMoney() {
        return finishMoney;
    }

    public void setFinishMoney(Double finishMoney) {
        this.finishMoney = finishMoney;
    }

    public Double getUnfinishNum() {
        return unfinishNum;
    }

    public void setUnfinishNum(Double unfinishNum) {
        this.unfinishNum = unfinishNum;
    }

    public Double getUnfinishMoney() {
        return unfinishMoney;
    }

    public void setUnfinishMoney(Double unfinishMoney) {
        this.unfinishMoney = unfinishMoney;
    }

    public Double getPaytax() {
        return paytax;
    }

    public void setPaytax(Double paytax) {
        this.paytax = paytax;
    }

    public Double getUndeal() {
        return undeal;
    }

    public void setUndeal(Double undeal) {
        this.undeal = undeal;
    }

    public Double getPenalty() {
        return penalty;
    }

    public void setPenalty(Double penalty) {
        this.penalty = penalty;
    }

    public Double getRealCountNum() {
        return realCountNum;
    }

    public void setRealCountNum(Double realCountNum) {
        this.realCountNum = realCountNum;
    }

    public Double getRealCountMoney() {
        return realCountMoney;
    }

    public void setRealCountMoney(Double realCountMoney) {
        this.realCountMoney = realCountMoney;
    }

    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }

    public String getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(String checkDate) {
        this.checkDate = checkDate;
    }

    public String getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(String auditDate) {
        this.auditDate = auditDate;
    }

    public String getCountDate() {
        return countDate;
    }

    public void setCountDate(String countDate) {
        this.countDate = countDate;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public String getPlanDate() {
        return planDate;
    }

    public void setPlanDate(String planDate) {
        this.planDate = planDate;
    }

    public Double getManagementFee() {
        return managementFee;
    }

    public void setManagementFee(Double managementFee) {
        this.managementFee = managementFee;
    }

    public Double getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(Double accountDate) {
        this.accountDate = accountDate;
    }

    public String getProgressA() {
        return progressA;
    }

    public void setProgressA(String progressA) {
        this.progressA = progressA;
    }

    public String getProgressB() {
        return progressB;
    }

    public void setProgressB(String progressB) {
        this.progressB = progressB;
    }

    public String getProgressC() {
        return progressC;
    }

    public void setProgressC(String progressC) {
        this.progressC = progressC;
    }

    public String getProgressD() {
        return progressD;
    }

    public void setProgressD(String progressD) {
        this.progressD = progressD;
    }

    public Double getAccountMoney() {
        return accountMoney;
    }

    public void setAccountMoney(Double accountMoney) {
        this.accountMoney = accountMoney;
    }

    public Double getTaxes() {
        return taxes;
    }

    public void setTaxes(Double taxes) {
        this.taxes = taxes;
    }

    public Double getAfterTax() {
        return afterTax;
    }

    public void setAfterTax(Double afterTax) {
        this.afterTax = afterTax;
    }

    public Double getMoreNum() {
        return moreNum;
    }

    public void setMoreNum(Double moreNum) {
        this.moreNum = moreNum;
    }

    public Double getMoreMoney() {
        return moreMoney;
    }

    public void setMoreMoney(Double moreMoney) {
        this.moreMoney = moreMoney;
    }

    public String getContractor() {
        return contractor;
    }

    public void setContractor(String contractor) {
        this.contractor = contractor;
    }

    public Boolean getIspay() {
        return ispay;
    }

    public void setIspay(Boolean ispay) {
        this.ispay = ispay;
    }

    public Boolean getIsframe() {
        return isframe;
    }

    public void setIsframe(Boolean isframe) {
        this.isframe = isframe;
    }

    public Boolean getIspact() {
        return ispact;
    }

    public void setIspact(Boolean ispact) {
        this.ispact = ispact;
    }

    public Boolean getIsflow() {
        return isflow;
    }

    public void setIsflow(Boolean isflow) {
        this.isflow = isflow;
    }

    public AuditStatus getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(AuditStatus auditStatus) {
        this.auditStatus = auditStatus;
    }

    public AuditStatus getCountStatus() {
        return countStatus;
    }

    public void setCountStatus(AuditStatus countStatus) {
        this.countStatus = countStatus;
    }

    public AuditStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(AuditStatus billStatus) {
        this.billStatus = billStatus;
    }

    public AuditStatus getPlanStatus() {
        return planStatus;
    }

    public void setPlanStatus(AuditStatus planStatus) {
        this.planStatus = planStatus;
    }

    public Double getMinusMoney() {
        return minusMoney;
    }

    public void setMinusMoney(Double minusMoney) {
        this.minusMoney = minusMoney;
    }

    public Double getIncrease() {
        return increase;
    }

    public void setIncrease(Double increase) {
        this.increase = increase;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public String getPercentageStr() {
        return percentageStr;
    }

    public void setPercentageStr(String percentageStr) {
        this.percentageStr = percentageStr;
    }

    public ReceivableSubsidiaryBO(String area, Double taskPrice, Double pactSize, Double fee, Double money, Double aDouble, Double managementFee, Double accountMoney, Double taxes, String percentageStr, Double taskMoney) {
        super();
        this.area  = area;
        this.managementFee = managementFee;
        this.accountMoney = accountMoney;
        this.taxes = taxes;
        this.taskMoney = taskMoney;
    }
}