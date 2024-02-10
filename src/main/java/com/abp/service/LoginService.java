package com.abp.service;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.abp.bean.Login;

import com.abp.bean.Users;
import com.abp.repository.UserRepo;

@Service
public class LoginService {
	@Autowired
	UserRepo repo;
	Login login;
	
	/*
	 * public Login login(Users user) { Users
	 * ref=repo.findByUserEmail(user.getUserEmail()); Users
	 * pass=repo.findByUserPassword(user.getUserPassword()); if(ref!=null &&
	 * pass!=null) { String value=ref.getUserPassword(); String
	 * word=pass.getUserPassword(); if (value.equals(word)) {
	 * 
	 * String res=ref.getUserType(); if(res.equals("Employee")) { return new
	 * Login("User Success"); } else { return new Login("Admin Success"); } } else {
	 * return new Login("Login Fail"); } } else { return new Login("Login Fail"); }
	 * 
	 * }
	 */
	
	//junit
	public String login(Users user) {
		Users ref=repo.findByUserEmail(user.getUserEmail());
		Users pass=repo.findByUserPassword(user.getUserPassword());
		if(ref!=null && pass!=null) {
			String value=ref.getUserPassword();
			String word=pass.getUserPassword();
			if (value.equals(word)) {
				
				String res=ref.getUserType();
			if(res.equals("Employee")) {
				return "User Success";
			}
			else {
				return ("Admin Success");
			}
		}
			else {
				return ("Login Fail");
			}
		}  else {
			return ("Login Fail");
		}
	}
}