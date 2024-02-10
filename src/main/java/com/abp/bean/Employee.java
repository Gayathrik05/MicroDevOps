package com.abp.bean;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_user_contact")
public class Employee {
	
	@Id
	@Column(name = "emp_Id")
	private long empId;
	
	@Column(name = "emp_Name")
	private String empName;
	
	@Column(name = "emp_Phone")
	private String empPhone;
	
	@Column(name = "emp_Location")
	private String empLocation;
	
	@Column(name = "emp_Bg")
	private String empBg;
	
	@Column(name = "joining_Date")
	private String joiningDate;
	
	@Column(name = "job_Title")
	private String jobTitle;

	public Employee() {
		super();
	}

	public Employee(long empId, String empName, String empPhone, String empLocation, String empBg, String joiningDate,
			String jobTitle) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empPhone = empPhone;
		this.empLocation = empLocation;
		this.empBg = empBg;
		this.joiningDate = joiningDate;
		this.jobTitle = jobTitle;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}

	public String getEmpLocation() {
		return empLocation;
	}

	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}

	public String getEmpBg() {
		return empBg;
	}

	public void setEmpBg(String empBg) {
		this.empBg = empBg;
	}

	public String getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empPhone=" + empPhone + ", empLocation="
				+ empLocation + ", empBg=" + empBg + ", joiningDate=" + joiningDate + ", jobTitle=" + jobTitle
				+ "]";
	}

}