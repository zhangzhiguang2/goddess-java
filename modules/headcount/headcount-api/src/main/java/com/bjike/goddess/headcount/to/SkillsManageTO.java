package com.bjike.goddess.headcount.to;

import com.bjike.goddess.common.api.to.BaseTO;
/**
* 技能管理等级配置
* @Author:			[ yewenbo ]
* @Date:			[  2017-03-15T14:44:02.637 ]
* @Description:	[ 技能管理等级配置 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
public class SkillsManageTO extends BaseTO { 

/**
* 分类
*/
 private String  category; 

/**
* 部门
*/
 private String  department; 

/**
* 项目分类
*/
 private String  itemCategory; 

/**
* 决策层人数
*/
 private Integer  DecisNum; 

/**
* 决策层技能等级
*/
 private String  DecisSkill; 

/**
* 决策层管理等级
*/
 private String  DecisManage; 

/**
* 管理层(技术管理)人数
*/
 private Integer  technoNum; 

/**
* 管理层(技术管理)技能等级
*/
 private String  technoSkill; 

/**
* 管理层(技术管理)管理等级
*/
 private Double  technoManage; 

/**
* 管理层(行政管理)人数
*/
 private Integer  adminNum; 

/**
* 管理层(行政管理)技能等级
*/
 private String  adminSKill; 

/**
* 管理层(行政管理)管理等级Integer
*/
 private String  adminManage; 

/**
* 执行层技能等级String
*/
 private String  performSkill; 



 public String getCategory () { 
 return category;
 } 
 public void setCategory (String category ) { 
 this.category = category ; 
 } 
 public String getDepartment () { 
 return department;
 } 
 public void setDepartment (String department ) { 
 this.department = department ; 
 } 
 public String getItemCategory () { 
 return itemCategory;
 } 
 public void setItemCategory (String itemCategory ) { 
 this.itemCategory = itemCategory ; 
 } 
 public Integer getDecisNum () { 
 return DecisNum;
 } 
 public void setDecisNum (Integer DecisNum ) { 
 this.DecisNum = DecisNum ; 
 } 
 public String getDecisSkill () { 
 return DecisSkill;
 } 
 public void setDecisSkill (String DecisSkill ) { 
 this.DecisSkill = DecisSkill ; 
 } 
 public String getDecisManage () { 
 return DecisManage;
 } 
 public void setDecisManage (String DecisManage ) { 
 this.DecisManage = DecisManage ; 
 } 
 public Integer getTechnoNum () { 
 return technoNum;
 } 
 public void setTechnoNum (Integer technoNum ) { 
 this.technoNum = technoNum ; 
 } 
 public String getTechnoSkill () { 
 return technoSkill;
 } 
 public void setTechnoSkill (String technoSkill ) { 
 this.technoSkill = technoSkill ; 
 } 
 public Double getTechnoManage () { 
 return technoManage;
 } 
 public void setTechnoManage (Double technoManage ) { 
 this.technoManage = technoManage ; 
 } 
 public Integer getAdminNum () { 
 return adminNum;
 } 
 public void setAdminNum (Integer adminNum ) { 
 this.adminNum = adminNum ; 
 } 
 public String getAdminSKill () { 
 return adminSKill;
 } 
 public void setAdminSKill (String adminSKill ) { 
 this.adminSKill = adminSKill ; 
 } 
 public String getAdminManage () { 
 return adminManage;
 } 
 public void setAdminManage (String adminManage ) { 
 this.adminManage = adminManage ; 
 } 
 public String getPerformSkill () { 
 return performSkill;
 } 
 public void setPerformSkill (String performSkill ) { 
 this.performSkill = performSkill ; 
 } 
 }