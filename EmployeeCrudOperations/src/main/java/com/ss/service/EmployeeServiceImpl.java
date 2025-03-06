package com.ss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ss.Modal.Employee;
import com.ss.repository.EmploeeRepo;
@Service("empService")
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmploeeRepo empRepo;
	@Override
	public boolean isAddNewEmployee(Employee employee) {
		
		return empRepo.isAddNewEmployee(employee);
	}
	@Override
	public List<Employee> getAllEmployees() {
		
		return empRepo.getAllEmployees();
	}
	@Override
	public boolean isDeleteEmployee(int empid) {
		
		return empRepo.isDeleteEmployee(empid);
	}
	@Override
	public boolean isUpdateEmployee(Employee employee) {
		
		return empRepo.isUpdateEmployee(employee);
	}

}
