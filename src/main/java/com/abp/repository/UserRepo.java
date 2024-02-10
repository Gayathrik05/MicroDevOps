package com.abp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abp.bean.Users;


public interface UserRepo extends JpaRepository<Users, Long> {

	Users findByUserEmail(String userEmail);

	Users findByUserPassword(String userPassword);

	

}