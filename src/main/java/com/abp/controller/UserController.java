package com.abp.controller;

import java.util.ArrayList;



import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.abp.bean.Users;
import com.abp.repository.UserRepo;



@RestController
@CrossOrigin("http://localhost:4200/")
public class UserController {

	@Autowired	
	UserRepo repo;
	
/*
	@PutMapping("/userUpdate")
	public void performUpdate(@RequestBody Users userObj) {
		repo.save(userObj);
	}

	@DeleteMapping("/userDelete")
	public void performDelete(@RequestBody Users userObj) {
		repo.delete(userObj);
	}


	@GetMapping("/userViewAll")
	public ArrayList<Users> userViewAll() {
		Iterator<Users> it = repo.findAll().iterator();
		ArrayList<Users> list = new ArrayList<Users>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	*/
	
	@PutMapping("/userUpdate")
	public void performUpdate(@RequestBody Users userObj) {
		repo.save(userObj);
	}

	@DeleteMapping("/userDelete")
	public void performDelete(@RequestBody Users userObj) {
		repo.delete(userObj);
	}


	@GetMapping("/userViewAll")
	public ArrayList<Users> userViewAll() {
		Iterator<Users> it = repo.findAll().iterator();
		ArrayList<Users> list = new ArrayList<Users>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	}
	