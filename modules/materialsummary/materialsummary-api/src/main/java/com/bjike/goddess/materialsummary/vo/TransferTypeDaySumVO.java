package com.bjike.goddess.materialsummary.vo;

import com.bjike.goddess.common.api.type.Status;
import com.bjike.goddess.materialinstock.type.MaterialState;

/**
 * 调动类型日汇总表现层对象
 *
 * @Author: [ sunfengtao ]
 * @Date: [ 2017-05-22 11:40 ]
 * @Description: [ 调动类型日汇总表现层对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class TransferTypeDaySumVO {

    /**
     * id
     */
    private String id;
    /**
     * 汇总日期
     */
    private String sumDate;

    /**
     * 物资类型
     */
    private MaterialState materialState;

    /**
     * 地区
     */
    private String area;

    /**
     * 部门(项目组)
     */
    private String projectGroup;

    /**
     * 原存储地区总数量
     */
    private Integer oriStorageAreaTotalQty;

    /**
     * 调入地区总数量
     */
    private Integer transferredAreaTotalQty;

    /**
     * 状态
     */
    private Status status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSumDate() {
        return sumDate;
    }

    public void setSumDate(String sumDate) {
        this.sumDate = sumDate;
    }

    public MaterialState getMaterialState() {
        return materialState;
    }

    public void setMaterialState(MaterialState materialState) {
        this.materialState = materialState;
    }

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

    public Integer getOriStorageAreaTotalQty() {
        return oriStorageAreaTotalQty;
    }

    public void setOriStorageAreaTotalQty(Integer oriStorageAreaTotalQty) {
        this.oriStorageAreaTotalQty = oriStorageAreaTotalQty;
    }

    public Integer getTransferredAreaTotalQty() {
        return transferredAreaTotalQty;
    }

    public void setTransferredAreaTotalQty(Integer transferredAreaTotalQty) {
        this.transferredAreaTotalQty = transferredAreaTotalQty;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}