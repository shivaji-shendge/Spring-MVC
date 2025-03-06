package com.ss;

import java.net.http.HttpRequest;
import java.util.*;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ss.Modal.Employee;
import com.ss.service.EmployeeServiceImpl;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class TestController {
@Autowired	
EmployeeServiceImpl empService;

@RequestMapping("/")
public String home() {
	return "index";
}

@RequestMapping(value="/addemp")
public String newEmployeePage() {
	return "addemployee";
}

@RequestMapping(value="/saveemp", method=RequestMethod.POST)
public String saveEmployee(Employee e, Map<String,String> map) {
	boolean b = empService.isAddNewEmployee(e);
	if(b) {
		map.put("msg", "New Employee Added");
	}
	else {
		map.put("msg", "Employee Not added");
	}
	return "addemployee";
}
@RequestMapping("/view")
public String viewAllEmp(Map map) {
	List<Employee> list =empService.getAllEmployees();
	map.put("empList", list);
	return "viewallemp";	
}

/*@RequestMapping("/del")
public String delEmp(HttpServletRequest request) {
	String employeeId=request.getParameter("empid");
	int empId=Integer.parseInt(employeeId);
	return null;
} */

@RequestMapping("/del")
public String delEmp(@RequestParam ("empid") Integer empid, Map map) {
	System.out.println(empid);
	boolean b=empService.isDeleteEmployee(empid);
	if(b) {
		List<Employee> list =empService.getAllEmployees();
		map.put("empList", list);
	}
	return "viewallemp" ;
  }

@RequestMapping(value="/update",method=RequestMethod.GET)
public String updateEmployee(HttpServletRequest request,Map map) {
	int empid=Integer.parseInt(request.getParameter("empid"));
	String empname=request.getParameter("empname");
	String empemail=request.getParameter("empemail");
	String empcontact=request.getParameter("empcontact");
	map.put("id", empid);
	map.put("name", empname);
	map.put("email", empemail);
	map.put("contact", empcontact);
	
	return "updateemployee";	
}

@RequestMapping(value="/updateemp",method=RequestMethod.POST)
public String finalUpdate(HttpServletRequest request,Map map) {
	int empid=Integer.parseInt(request.getParameter("id"));
	String empname=request.getParameter("name");
	String empemail=request.getParameter("email");
	String empcontact=request.getParameter("contact");
	Employee emp=new Employee();
	emp.setId(empid);
	emp.setName(empname);
	emp.setEmail(empemail);
	emp.setContact(empcontact);
	boolean b=empService.isUpdateEmployee(emp);
	List<Employee> list = empService.getAllEmployees();
	map.put("empList", list);
	return "viewallemp";	
}
}
