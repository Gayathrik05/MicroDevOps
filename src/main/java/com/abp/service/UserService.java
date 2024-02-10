package com.abp.service;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.abp.bean.Users;



public interface UserService {

	@PostMapping("/userInsert")
	public String performInsert(@RequestBody Users userObj);

	@PutMapping("/userUpdate")
	public String performUpdate(@RequestBody Users userObj);

	@DeleteMapping("/userDelete")
	public String performDelete(@RequestBody long userId);

	@GetMapping("/userViewAll")
	public ArrayList<Users> performViewAll();

	@GetMapping("/userSearch/{userName}")
	public Users performFind(@PathVariable("userName") String userName);

}