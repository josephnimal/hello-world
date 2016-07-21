package com.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeDetailsMapper implements RowMapper<EmployeeDetails> {
	   public EmployeeDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		   EmployeeDetails employee = new EmployeeDetails();
	      employee.setUserId(rs.getString("userid"));
	      employee.setEmpId(rs.getInt("empid"));
	      employee.setEmpName(rs.getString("empname"));
	      employee.setBillingRole(rs.getString("billingrole"));
	      employee.setInfosysRole(rs.getString("infosysrole"));
	      employee.setLeaveCount0(rs.getInt("leavecount0"));
	      employee.setLeaveCount1(rs.getInt("leavecount1"));
	      employee.setLeaveCount2(rs.getInt("leavecount2"));
	      employee.setLeaveCount3(rs.getInt("leavecount3"));
	      employee.setLeaveCount4(rs.getInt("leavecount4"));
	      employee.setDU(rs.getString("du"));
	      employee.setCity(rs.getString("city"));
	      employee.setLeaveCodeAlloc(rs.getBoolean("leavecodealloc"));
	      return employee;
	   }
	}
