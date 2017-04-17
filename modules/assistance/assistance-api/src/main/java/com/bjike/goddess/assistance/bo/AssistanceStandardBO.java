package com.bjike.goddess.assistance.bo;

import com.bjike.goddess.common.api.bo.BaseBO;

import javax.persistence.Column;

/**
 * 补助标准业务传输对象
 *
 * @Author: [ tanghaixiang ]
 * @Date: [ 2017-04-13 09:29 ]
 * @Description: [ 补助标准业务传输对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class AssistanceStandardBO extends BaseBO {

    /**
     * 补助类型名称
     */
    private String name;

    /**
     * 标准
     */
    private String standardForm;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 修改时间
     */
    private String modifyTime;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStandardForm() {
        return standardForm;
    }

    public void setStandardForm(String standardForm) {
        this.standardForm = standardForm;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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