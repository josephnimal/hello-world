package com.spring.dao;

import javax.sql.DataSource;

public interface LoginDetailsDAO {
	public void setDataSource(DataSource ds);
	public LoginDetails getLoginDetails(String userid);
	public void update(String userid, String pwd);
}
