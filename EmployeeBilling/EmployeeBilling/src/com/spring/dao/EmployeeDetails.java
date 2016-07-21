package com.spring.dao;

public class EmployeeDetails {
	private String userId;
	private int empId;
	private String empName;
	private String billingRole;
	private String infosysRole;
	private int leaveCount0;
	private int leaveCount1;
	private int leaveCount2;
	private int leaveCount3;
	private int leaveCount4;
	private String DU;
	private String city;
	private boolean leaveCodeAlloc;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getBillingRole() {
		return billingRole;
	}
	public void setBillingRole(String billingRole) {
		this.billingRole = billingRole;
	}
	public String getInfosysRole() {
		return infosysRole;
	}
	public void setInfosysRole(String infosysRole) {
		this.infosysRole = infosysRole;
	}
	public int getLeaveCount0() {
		return leaveCount0;
	}
	public void setLeaveCount0(int leaveCount0) {
		this.leaveCount0 = leaveCount0;
	}
	public int getLeaveCount1() {
		return leaveCount1;
	}
	public void setLeaveCount1(int leaveCount1) {
		this.leaveCount1 = leaveCount1;
	}
	public int getLeaveCount2() {
		return leaveCount2;
	}
	public void setLeaveCount2(int leaveCount2) {
		this.leaveCount2 = leaveCount2;
	}
	public int getLeaveCount3() {
		return leaveCount3;
	}
	public void setLeaveCount3(int leaveCount3) {
		this.leaveCount3 = leaveCount3;
	}
	public int getLeaveCount4() {
		return leaveCount4;
	}
	public void setLeaveCount4(int leaveCount4) {
		this.leaveCount4 = leaveCount4;
	}
	public String getDU() {
		return DU;
	}
	public void setDU(String dU) {
		DU = dU;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isLeaveCodeAlloc() {
		return leaveCodeAlloc;
	}
	public void setLeaveCodeAlloc(boolean leaveCodeAlloc) {
		this.leaveCodeAlloc = leaveCodeAlloc;
	}
}
