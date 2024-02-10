package com.abp.junit.test;

import static org.junit.jupiter.api.Assertions.*;

import static org.testng.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.abp.bean.Users;
import com.abp.service.LoginService;
import com.abp.service.UserService;

@SpringBootTest
class LoginTest {
	
	@Autowired
	LoginService loginServiceObj;
	UserService userServiceObj;
	
	String insertTest;	
	String firstResult;
		
	@Test
	void testPerformUserLogin() throws Exception{
		Users userObj = new Users();
		userObj.setUserEmail("sneha@gmail.com");
		userObj.setUserPassword("sneha123");				
		insertTest = "User Success";
		firstResult = loginServiceObj.login(userObj);
		assertEquals(insertTest, firstResult);	
	}
	@Test
	void testPerformUserLoginFail() throws Exception{
		Users userObj = new Users();
		userObj.setUserEmail("sneha@gmail.com");
		userObj.setUserPassword("sneha");				
		insertTest = "Login Fail";
		firstResult = loginServiceObj.login(userObj);
		assertEquals(insertTest, firstResult);	
	}
	@Test
	void testPerformAdminLogin() throws Exception{
		Users userObj = new Users();
		userObj.setUserEmail("admin@gmail.com");
		userObj.setUserPassword("admin123");
				
		insertTest = "Admin Success";
		firstResult = loginServiceObj.login(userObj);
		assertEquals(insertTest, firstResult);	
	}
	@Test
	void testPerformAdminLoginFail() throws Exception{
		Users userObj = new Users();
		userObj.setUserEmail("admin@gmail.com");
		userObj.setUserPassword("admin");				
		insertTest = "Login Fail";
		firstResult = loginServiceObj.login(userObj);
		assertEquals(insertTest, firstResult);	
	}
}
