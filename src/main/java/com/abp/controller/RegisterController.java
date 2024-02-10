package com.abp.controller;


	import org.springframework.beans.factory.annotation.Autowired;

	import org.springframework.web.bind.annotation.CrossOrigin;
	
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;

import com.abp.bean.Users;
import com.abp.service.RegisterService;
	
	
	@RestController
	@CrossOrigin("http://localhost:4200/")
	public class RegisterController {
		
		@Autowired
		RegisterService service;
		
		@PostMapping("/registerInsert")
		public String performRegister(@RequestBody Users user) {
			
			service.Register(user);
			return "inserted";
		}
		
		
		
		
	}
