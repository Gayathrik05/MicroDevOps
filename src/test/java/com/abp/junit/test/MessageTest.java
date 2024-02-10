package com.abp.junit.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.abp.bean.Message;
import com.abp.controller.MessageController;

@SpringBootTest
class MessageTest {

	@Autowired
	MessageController messageControllerObj;
	
	String insertTest;
	String deleteTest;
	String viewAllTest;
	
	String firstResult;
	
	List<Message> list = new ArrayList<Message>();
	List<Message> list1 = new ArrayList<Message>();
	
	Message msg1;
	Message msg2;
	
	
	@Test
	void testPerformInsert() throws Exception{
		Message msgObj = new Message();	
		msgObj.setEmployeeId(11958);
		msgObj.setEmployeeName("Naveen");
		msgObj.setEmployeeEmail("naveen@gmail.com");
		msgObj.setEmployeeMessage("My details are incorrect");		
		insertTest = "Inserted";
		firstResult = messageControllerObj.empMessageInsert(msgObj);
		assertEquals(insertTest, firstResult);
	}
	
	
	 
	@Test
	void testPerformUpdate() throws Exception{
		Message msgObj = new Message();	
		msgObj.setEmployeeId(11954);
		msgObj.setEmployeeName("Gayathri");
		msgObj.setEmployeeEmail("gayathri@gmail.com");
		msgObj.setEmployeeMessage("My details are correct");		
		insertTest = "Updated";
		firstResult = messageControllerObj.empMessageUpdate(msgObj);
		assertEquals(insertTest, firstResult);
	}
	
	
	@Test
	void testPerformViewAll() 
	{ 
		list =messageControllerObj.empViewAll();
		msg1 = new Message(20001, "Devi","devi@gmail.com","Need to change my details");
		msg2 = new Message(20002, "Math","math@gmail.xom","Need to change my details");
		list.add(msg1);
		list.add(msg2);
		list.equals(list1); 
	}
	
	 @Test	 
	void testPerformDelete() throws Exception
	{ 
		deleteTest = "Deleted"; 
		firstResult =messageControllerObj.empMessageDelete(20002); 
		assertEquals(deleteTest, firstResult); 
	}
	


}
