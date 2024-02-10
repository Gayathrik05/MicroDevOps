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

import com.abp.bean.Message;

import com.abp.repository.MessageRepo;

@RestController
@CrossOrigin("http://localhost:4200/")
public class MessageController {

	@Autowired
	MessageRepo dao;
/*
	@PostMapping("/empMessageInsert")
	public void empMessageInsert(@RequestBody Message msgObj) {
		dao.save(msgObj);
		
	}

	@PutMapping("/empMessageUpdate")
	public void empMessageUpdate(@RequestBody Message msgObj) {
		dao.save(msgObj);
		
	}

	@DeleteMapping("/empMessageDelete/{employeeId}")
	public void empMessageDelete(@PathVariable("employeeId") int employeeId) {
		dao.deleteById(employeeId);
		
	}

	@GetMapping("/empMessageViewAll")
	public ArrayList<Message> empViewAll() {
		Iterator<Message> it = dao.findAll().iterator();
		ArrayList<Message> list = new ArrayList<Message>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
*/
	//junit
	@PostMapping("/empMessageInsert")
	public String empMessageInsert(@RequestBody Message msgObj) {
		dao.save(msgObj);
		return "Inserted";
		
	}

	@PutMapping("/empMessageUpdate")
	public String empMessageUpdate(@RequestBody Message msgObj) {
		dao.save(msgObj);
		return "Updated";
		
	}

	@DeleteMapping("/empMessageDelete/{employeeId}")
	public String empMessageDelete(@PathVariable("employeeId") int employeeId) {
		dao.deleteById(employeeId);
		return "Deleted";
		
	}

	@GetMapping("/empMessageViewAll")
	public ArrayList<Message> empViewAll() {
		Iterator<Message> it = dao.findAll().iterator();
		ArrayList<Message> list = new ArrayList<Message>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}

	
}