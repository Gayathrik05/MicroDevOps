package com.abp.repository;

import org.springframework.data.repository.CrudRepository;

import com.abp.bean.Employee;


public interface EmployeeRepo extends CrudRepository<Employee, Long> {
}