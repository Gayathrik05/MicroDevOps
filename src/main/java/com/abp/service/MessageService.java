package com.abp.service;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.abp.bean.Employee;
import com.abp.bean.Message;
import com.abp.bean.Users;



public interface MessageService {

	@PostMapping("/empMesInsert")
	public String performInsert(@RequestBody Message msgObj);

	@PutMapping("/empMesUpdate")
	public String performUpdate(@RequestBody Employee empObj);


	@DeleteMapping("/empMesDelete")
	public String performDelete(@RequestBody int employeeId);

	@GetMapping("/empMesViewAll")
	public ArrayList<Users> performViewAll();

	@GetMapping("/empMesSearch/{userName}")
	public Employee performFind(@PathVariable("userName") String employeeName);

	

}