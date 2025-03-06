package com.ss.service;

import java.util.List;

import com.ss.Modal.Employee;

public interface EmployeeService {
	
public boolean isAddNewEmployee(Employee employee);
public List<Employee> getAllEmployees();
public boolean isDeleteEmployee(int empid);
public boolean isUpdateEmployee(Employee employee);

}
