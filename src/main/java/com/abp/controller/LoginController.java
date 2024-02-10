package com.abp.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abp.bean.Login;
import com.abp.bean.Users;
import com.abp.service.LoginService;

@RestController
@CrossOrigin("http://localhost:4200/")
public class LoginController {
	
	@Autowired
	LoginService service;
	
	@RequestMapping("/login")
	public ResponseEntity<?> performLogin(@RequestBody Users user) {
		String res=service.login(user);
			return ResponseEntity.ok(res);
	}
}
