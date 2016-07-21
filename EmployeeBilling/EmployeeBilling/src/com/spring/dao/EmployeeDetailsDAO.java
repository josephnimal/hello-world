package com.spring.dao;

import javax.sql.DataSource;

public interface EmployeeDetailsDAO {
	public void setDataSource(DataSource ds);
	public EmployeeDetails getEmployeeDetails(int empid);
	public void update(String userid, String empName, int empId, String billingRole, String infosysRole, int leaveCount0, int leaveCount1, int leaveCount2, int leaveCount3, int leaveCount4, String DU, String city, boolean leaveCodeAlloc);
}
