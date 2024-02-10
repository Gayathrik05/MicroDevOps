package com.abp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abp.bean.Users;
import com.abp.repository.UserRepo;


@Service
public class RegisterService {
	
	@Autowired
	UserRepo repo;
	
	/* java
	 * public boolean Register(Users user) { user.setUserType("Employee");
	 * repo.save(user); return true; }
	 */
    
//junit
    public String Register(Users user) {
//    	user.setUserType("Employee");
		repo.save(user);
		return "Inserted";
	}


}
