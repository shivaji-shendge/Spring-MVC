package com.ss.repository;

import java.util.List;

import com.ss.Modal.Employee;

public interface EmploeeRepo {
	public boolean isAddNewEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public boolean isDeleteEmployee(int empid);
	public boolean isUpdateEmployee(Employee employee);
}
