package com.abp.service;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.abp.bean.Employee;
import com.abp.bean.Users;



public interface EmployeeService {

	/*
	 * @PostMapping("/empInsert") public String performInsert(@RequestBody Employee
	 * empObj);
	 * 
	 * @PutMapping("/empUpdate") public String performUpdate(@RequestBody Employee
	 * empObj);
	 * 
	 * 
	 * @DeleteMapping("/empDelete") public String performDelete(@RequestBody long
	 * userId);
	 * 
	 * @GetMapping("/empViewAll") public ArrayList<Users> performViewAll();
	 * 
	 * @GetMapping("/empSearch/{userName}") public Employee
	 * performFind(@PathVariable("userName") String userName);
	 */

	//junit
	@PostMapping("/empInsert")
	public String performInsert(@RequestBody Employee empObj);

	@PutMapping("/empUpdate")
	public String performUpdate(@RequestBody Employee empObj);

	
	@DeleteMapping("/empDelete")
	public String performDelete(@RequestBody long userId);

	@GetMapping("/empViewAll")
	public ArrayList<Users> performViewAll();

	@GetMapping("/empSearch/{userName}")
	public Employee performFind(@PathVariable("userName") String userName);

}