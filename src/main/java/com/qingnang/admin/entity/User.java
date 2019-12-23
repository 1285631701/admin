package com.qingnang.admin.entity;

import java.util.Date;

/**
* Copyright: Copyright (c) 2018
* @ClassName: Admin.java
* @Description: 该类的功能描述
* @version: v1.0.0
* @author: feri
* @date: 2018年12月20日 上午10:02:34 
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2018年12月20日       feri           v1.0.0               修改原因
*/
public class User {
	private int userId;
	private String userName;
	private String email;
	private String password;
	private String ecSalt;
	private Date addTime;
	private Date lastLogin;
	private String lastIp;
	private String actionList;
	private String navList;
	private String langType;
	private int agencyId;
	private int suppliersId;
	private String todolist;
	private int roleId;

	private String loginUrl;
	private String roleName;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getLoginUrl() {
		return loginUrl;
	}

	public void setLoginUrl(String loginUrl) {
		this.loginUrl = loginUrl;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEcSalt() {
		return ecSalt;
	}

	public void setEcSalt(String ecSalt) {
		this.ecSalt = ecSalt;
	}

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getLastIp() {
		return lastIp;
	}

	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}

	public String getActionList() {
		return actionList;
	}

	public void setActionList(String actionList) {
		this.actionList = actionList;
	}

	public String getNavList() {
		return navList;
	}

	public void setNavList(String navList) {
		this.navList = navList;
	}

	public String getLangType() {
		return langType;
	}

	public void setLangType(String langType) {
		this.langType = langType;
	}

	public int getAgencyId() {
		return agencyId;
	}

	public void setAgencyId(int agencyId) {
		this.agencyId = agencyId;
	}

	public int getSuppliersId() {
		return suppliersId;
	}

	public void setSuppliersId(int suppliersId) {
		this.suppliersId = suppliersId;
	}

	public String getTodolist() {
		return todolist;
	}

	public void setTodolist(String todolist) {
		this.todolist = todolist;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
}
