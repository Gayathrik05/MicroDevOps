package com.abp.junit.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.abp.bean.Users;
import com.abp.controller.RegisterController;
import com.abp.controller.UserController;

@SpringBootTest
class UsersTest {

	@Autowired
	RegisterController registerObj;
	UserController userObj;
	
	String insertTest;
	String updateTest;
	String deleteTest;
	String viewAllTest;
	
	String firstResult;
	String secondResult;

	List<Users> list = new ArrayList<Users>();
	List<Users> list1 = new ArrayList<Users>();
	
	Users emp1;
	Users emp2;
		
	@Test
	void testPerformInsert() throws Exception{
		Users userObj = new Users();
		userObj.setUserId(12);
		userObj.setUserName("Neha");
		userObj.setUserEmail("neha@gmail.com");
		userObj.setUserPassword("neha123");
		userObj.setUserConfirmPassword("neha123");
		userObj.setUserType("Employee");		
		insertTest = "inserted";
		firstResult = registerObj.performRegister(userObj);
		assertEquals(insertTest, firstResult);	
	}
	@Test
	void testPerformInsertFail() throws Exception{
		Users userObj = new Users();
		userObj.setUserId(13);
		userObj.setUserName("Esha");
		userObj.setUserEmail("eseha");
		userObj.setUserPassword("esha123");
		userObj.setUserConfirmPassword("esha123");
		userObj.setUserType("Employee");		
		insertTest = "inserted";
		firstResult = registerObj.performRegister(userObj);
		assertEquals(insertTest, firstResult);	
	}
}
