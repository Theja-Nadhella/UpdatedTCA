package com.cg.tca_application.services;

import com.cg.tca_application.entities.Employees;
import com.cg.tca_application.entities.TimecardDetails;

import java.util.List;

public interface IEmployeeService {
	public Employees viewEmployeeById(long empId);
	public void addEmployee(Employees employee);
	public boolean validateEmployeeById(long empId);
	public List<Employees> viewEmployeesUnderSupervisor(long supervisorId);
	public boolean validateSupervisor(long SupervisorId);
	public List<TimecardDetails> viewTimecardByEmpId(long empId);
}