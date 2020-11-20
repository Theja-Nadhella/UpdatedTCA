package com.cg.tca_application.repository;
import java.util.List;
import com.cg.tca_application.entities.Employees;

public interface IEmployeeRepository {
	public Employees findEmployeeById(long empId);
	public void addEmployee(Employees employee);
	public List<Employees> findEmployeesUnderSupervisor(long supervisorId);
	public void beginTransaction();
	public void commitTransaction();
}
