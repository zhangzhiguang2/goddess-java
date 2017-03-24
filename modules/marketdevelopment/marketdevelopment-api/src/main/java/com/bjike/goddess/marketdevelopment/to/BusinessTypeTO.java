package com.bjike.goddess.marketdevelopment.to;

import com.bjike.goddess.common.api.to.BaseTO;
import com.bjike.goddess.common.api.type.Status;

/**
* 业务类型
* @Author:			[ dengjunren ]
* @Date:			[  2017-03-22 07:20 ]
* @Description:	[ 业务类型 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
public class BusinessTypeTO extends BaseTO { 

/**
* 业务类型
*/
 private String  type; 

/**
* 描述
*/
 private String  description; 

/**
* 状态
*/
 private Status status;



 public String getType () { 
 return type;
 } 
 public void setType (String type ) { 
 this.type = type ; 
 } 
 public String getDescription () { 
 return description;
 } 
 public void setDescription (String description ) { 
 this.description = description ; 
 } 
 public Status getStatus () { 
 return status;
 } 
 public void setStatus (Status status ) { 
 this.status = status ; 
 } 
 }