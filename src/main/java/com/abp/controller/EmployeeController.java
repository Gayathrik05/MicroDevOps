package com.abp.controller;

import java.util.ArrayList;


import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abp.bean.Employee;
import com.abp.repository.EmployeeRepo;



@RestController
@CrossOrigin("http://localhost:4200/")
public class EmployeeController {

	@Autowired
	EmployeeRepo dao;

	/*
	 	@PostMapping("/empInsert")
	public void empInsert(@RequestBody Employee empObj) {
		dao.save(empObj);
		
	}

	@PutMapping("/empUpdate")
	public String empUpdate(@RequestBody Employee empObj) {
		dao.save(empObj);
		
	}

	@DeleteMapping("/empDelete/{empId}")
	public void empDelete(@PathVariable("empId") long empId) {
		dao.deleteById(empId);
		
	}

	@GetMapping("/empViewAll")
	public ArrayList<Employee> empViewAll() {
		Iterator<Employee> it = dao.findAll().iterator();
		ArrayList<Employee> list = new ArrayList<Employee>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}

	 */
	@PostMapping("/empInsert")
	public String empInsert(@RequestBody Employee empObj) {
		dao.save(empObj);
		return "Inserted";
		
	}

	@PutMapping("/empUpdate")
	public String empUpdate(@RequestBody Employee empObj) {
		dao.save(empObj);
		return "Updated";
		
	}

	@DeleteMapping("/empDelete/{empId}")
	public String empDelete(@PathVariable("empId") long empId) {
		dao.deleteById(empId);
		return "Deleted";
		
	}

	@GetMapping("/empViewAll")
	public ArrayList<Employee> empViewAll() {
		Iterator<Employee> it = dao.findAll().iterator();
		ArrayList<Employee> list = new ArrayList<Employee>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
}