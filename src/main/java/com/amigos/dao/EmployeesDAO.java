package com.amigos.dao;

import java.util.List;

import com.amigos.entities.Employees;

public interface EmployeesDAO {
	
	List<Employees> getAllEmployees();
	
	void addEmployee(Employees employee);
	
	void updateEmployee(Employees employee);
	
	void deleteEmployee(Employees employee);
	
	Employees getEmployeeById(int employeeId);

}
