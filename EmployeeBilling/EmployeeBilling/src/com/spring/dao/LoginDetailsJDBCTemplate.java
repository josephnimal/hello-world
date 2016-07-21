package com.spring.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class LoginDetailsJDBCTemplate implements LoginDetailsDAO{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	@Override
	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
	    this.jdbcTemplateObject = new JdbcTemplate(ds);
	}

	@Override
	public LoginDetails getLoginDetails(String userid) {
		String SQL = "select * from LoginDetails where userid = ?";
		LoginDetails userDetails = jdbcTemplateObject.queryForObject(SQL,new Object[]{userid}, new LoginDetailsMapper());
	    return userDetails;
	}

	@Override
	public void update(String userid, String pwd) {
		String SQL = "update LoginDetails set pwd = ? where userid = ?";
	    jdbcTemplateObject.update(SQL, pwd, userid);
	    System.out.println("Updated Record with USERID = " + userid );
	    return;
	}

}
