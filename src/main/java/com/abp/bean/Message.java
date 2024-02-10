package com.abp.bean;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_user_message")
public class Message {

	@Id
	@Column(name = "employeeId")
	private int employeeId;

	@Column(name = "employeeName")
	private String employeeName;

	@Column(name = "employeeEmail")
	private String employeeEmail;

	@Column(name = "employeeMessage")
	private String employeeMessage;

	public Message() {
		super();
	}

	public Message(int employeeId, String employeeName, String employeeEmail, String employeeMessage) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeEmail = employeeEmail;
		this.employeeMessage = employeeMessage;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public String getEmployeeMessage() {
		return employeeMessage;
	}

	public void setEmployeeMessage(String employeeMessage) {
		this.employeeMessage = employeeMessage;
	}

	@Override
	public String toString() {
		return "Message [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeEmail="
				+ employeeEmail + ", employeeMessage=" + employeeMessage + "]";
	}
	
}
