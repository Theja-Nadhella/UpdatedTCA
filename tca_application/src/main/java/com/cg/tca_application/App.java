package com.cg.tca_application;
import java.util.*;
import com.cg.tca_application.entities.*;
import com.cg.tca_application.repository.*;
import com.cg.tca_application.services.*;
public class App 
{
    public static void main( String[] args )
    {
        IEmployeeService service=new EmployeeService();
        Employees emp=new Employees();
        emp.setEmpName("Ram");
        emp.setPhoneNumber("987654321");
        emp.setEmpEmail("ram.hanuma@gmail.com");
        emp.setSupervisorId(12L);
        service.addEmployee(emp);
    }
}
