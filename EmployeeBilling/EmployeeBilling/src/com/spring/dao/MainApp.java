package com.spring.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		LoginDetailsJDBCTemplate loginDetailsJDBCTemplate = 
	      (LoginDetailsJDBCTemplate)context.getBean("loginDetailsJDBCTemplate");
		
		System.out.println(loginDetailsJDBCTemplate.getLoginDetails("josephnimal").getPwd());
		loginDetailsJDBCTemplate.update("shrutiverma", "123456");
		System.out.println(loginDetailsJDBCTemplate.getLoginDetails("shrutiverma").getPwd());
	}

}
