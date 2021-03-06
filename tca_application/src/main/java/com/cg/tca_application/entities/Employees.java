package com.cg.tca_application.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Employees {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long empId;
	private String empName;
	private String phoneNumber;
	private String empEmail;
	private long supervisorId;
	
	@OneToMany(mappedBy="employees")
	private List<TimecardDetails> timecard=new ArrayList<>();
	
	/**
	 * Create getters and setter methods
	 * Purpose : getter reads the value of a variable, setter updates the value of a variable 
	 */
	public long getSupervisorId() {
		return supervisorId;
	}
	public void setSupervisorId(long supervisorId) {
		this.supervisorId = supervisorId;
	}
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public List<TimecardDetails> getTimecard() {
		return timecard;
	}
	public void setTimecard(List<TimecardDetails> timecard) {
		this.timecard = timecard;
	}	
	}