package com.abp.junit.test;

import static org.junit.jupiter.api.Assertions.*;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.abp.bean.Employee;
import com.abp.controller.EmployeeController;


@SpringBootTest
class EmployeeTest {

	@Autowired
	EmployeeController employeeControllerObj;

	String insertTest;
	String updateTest;
	String deleteTest;
	String viewAllTest;

	String firstResult;
	String secondResult;

	List<Employee> list = new ArrayList<Employee>();
	List<Employee> list1 = new ArrayList<Employee>();

	Employee emp1;
	Employee emp2;

	@Test
		void testPerformInsert() throws Exception{
			Employee empObj = new Employee();
			empObj.setEmpId(11958);
			empObj.setEmpName("Naveen");
			empObj.setEmpPhone("2345678901");
			empObj.setEmpLocation("Vellore");
			empObj.setEmpBg("B Positive");
			empObj.setJoiningDate("01.01.2021");
			empObj.setJobTitle("Trainee");
			
			insertTest = "Inserted";
			firstResult = employeeControllerObj.empInsert(empObj);
			assertEquals(insertTest, firstResult);
	}
	@Test
	void testPerformUpdate() throws Exception {
		Employee empObj = new Employee();
		empObj.setEmpId(11958);
		empObj.setEmpName("Naveen");
		empObj.setEmpPhone("8940493644");
		empObj.setEmpLocation("Rajapalayam");
		empObj.setEmpBg("O Positive");
		empObj.setJoiningDate("01.01.2024");
		empObj.setJobTitle("Trainee");

		insertTest = "Updated";
		firstResult = employeeControllerObj.empUpdate(empObj);
		assertEquals(insertTest, firstResult);
	}

	@Test
	void testPerformViewAll() {
		list = employeeControllerObj.empViewAll();
		emp1 = new Employee(20001, "Devi", "2222222222", "Trichy", "O Negative", "13.12.2023", "HR");
		emp2 = new Employee(20002, "Math", "3333333333", "Srivi", "A Negative", "05.12.2023", "Admin");
		list.add(emp1);
		list.add(emp2);
		list.equals(list);
	}

	@Test
	void testPerformDelete() {
		deleteTest = "Deleted";
		firstResult = employeeControllerObj.empDelete(20002);
		assertEquals(deleteTest, firstResult);
	}
}
