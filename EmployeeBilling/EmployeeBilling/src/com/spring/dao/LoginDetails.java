package com.spring.dao;

public class LoginDetails {
	private String userid;
	private String pwd;
	private boolean admin;
	
	public String getUserid() {
		return userid;
	}

	public String getPwd() {
		return pwd;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setUserId(String userid) {
		this.userid = userid;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

}
