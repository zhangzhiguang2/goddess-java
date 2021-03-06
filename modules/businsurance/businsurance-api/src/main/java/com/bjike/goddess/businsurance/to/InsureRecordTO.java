package com.bjike.goddess.businsurance.to;

import com.bjike.goddess.common.api.to.BaseTO;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 意外险记录
 *
 * @Author: [ tanghaixiang ]
 * @Date: [ 2017-04-22 05:43 ]
 * @Description: [ 意外险记录 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class InsureRecordTO extends BaseTO {

    public interface TestAdd {
    }

    /**
     * 商业险类型
     */
    @NotBlank(groups = {InsureRecordTO.TestAdd.class}, message = "商业险类型不能为空")
    private String busType;

    /**
     * 商业险名称
     */
    @NotBlank(groups = {InsureRecordTO.TestAdd.class}, message = "商业险名称不能为空")
    private String typeName;

    /**
     * 保单生效日
     */
    @NotBlank(groups = {InsureRecordTO.TestAdd.class}, message = "保单生效日不能为空，格式为年月日")
    private String startDate;

    /**
     * 保单期满日
     */
    @NotBlank(groups = {InsureRecordTO.TestAdd.class}, message = "保单期满日不能为空，格式为年月日")
    private String endDate;

    /**
     * 投保人名字
     */
    private String insureName;

    /**
     * 被保险人名字
     */
    private String insureByName;

    /**
     * 险种名称
     */
    private String insureTypeName;

    /**
     * 组合名称
     */
    private String combiName;

    /**
     * 销售机构名称
     */
    private String saleGroupName;

    /**
     * 销售员名称
     */
    private String salerName;

    /**
     * 机构电话
     */
    private String organTel;

    /**
     * 合同存储编号
     */
    private String storageNumber;

    /**
     * 合同存储路径
     */
    private String storagePath;

    /**
     * 合同附件
     */
    private String storageFile;

    /**
     * 是否已续保
     */
    private String renewal;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 修改时间
     */
    private String modifyTime;

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getInsureName() {
        return insureName;
    }

    public void setInsureName(String insureName) {
        this.insureName = insureName;
    }

    public String getInsureByName() {
        return insureByName;
    }

    public void setInsureByName(String insureByName) {
        this.insureByName = insureByName;
    }

    public String getInsureTypeName() {
        return insureTypeName;
    }

    public void setInsureTypeName(String insureTypeName) {
        this.insureTypeName = insureTypeName;
    }

    public String getCombiName() {
        return combiName;
    }

    public void setCombiName(String combiName) {
        this.combiName = combiName;
    }

    public String getSaleGroupName() {
        return saleGroupName;
    }

    public void setSaleGroupName(String saleGroupName) {
        this.saleGroupName = saleGroupName;
    }

    public String getSalerName() {
        return salerName;
    }

    public void setSalerName(String salerName) {
        this.salerName = salerName;
    }

    public String getOrganTel() {
        return organTel;
    }

    public void setOrganTel(String organTel) {
        this.organTel = organTel;
    }

    public String getStorageNumber() {
        return storageNumber;
    }

    public void setStorageNumber(String storageNumber) {
        this.storageNumber = storageNumber;
    }

    public String getStoragePath() {
        return storagePath;
    }

    public void setStoragePath(String storagePath) {
        this.storagePath = storagePath;
    }

    public String getStorageFile() {
        return storageFile;
    }

    public void setStorageFile(String storageFile) {
        this.storageFile = storageFile;
    }

    public String getRenewal() {
        return renewal;
    }

    public void setRenewal(String renewal) {
        this.renewal = renewal;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }
}