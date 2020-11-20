package com.cg.tca_application.repository;

import com.cg.tca_application.entities.Employees;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

public class EmployeeRepository implements IEmployeeRepository {
		private EntityManagerFactory entityManagerFactory;
		private EntityManager entityManager;
		
		public  EmployeeRepository() {
			entityManagerFactory = JPAUtil.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();					
		}

		@Override
		public Employees findEmployeeById(long empId) {
			entityManager.getTransaction().begin();
			Employees entity = entityManager.find(Employees.class,empId);
			entityManager.getTransaction().commit();
			return entity;
		}
		@Override
		public void addEmployee(Employees employee) {
			entityManager.getTransaction().begin();
			entityManager.persist(employee);
			entityManager.getTransaction().commit();
			
		}

		@Override
		public List<Employees> findEmployeesUnderSupervisor(long supervisorId) {
			
			TypedQuery<Employees> query  = entityManager.createQuery(
		          "SELECT * FROM Employees WHERE superisorId=supervisorID", Employees.class);
			List<Employees> resultList = query.getResultList();
			return resultList;
		}
		
		@Override
		public void beginTransaction() {

			entityManager.getTransaction().begin();
			
		}

		@Override
		public void commitTransaction() {
			entityManager.getTransaction().commit();
			
		}
}