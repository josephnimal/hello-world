package com.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class LoginDetailsMapper implements RowMapper<LoginDetails> {
   public LoginDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
	  LoginDetails student = new LoginDetails();
      student.setUserId(rs.getString("userid"));
      student.setPwd(rs.getString("pwd"));
      student.setAdmin(rs.getBoolean("admin"));
      return student;
   }
}