package com.ss.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ss.Modal.Employee;

@Repository("empRepo")
public class EmployeeRepoImpl implements EmploeeRepo{
@Autowired
JdbcTemplate template;

@Override
public boolean isAddNewEmployee(Employee employee) {
	String query="insert into employee values('0',?,?,?)";
	int value=template.update(query, new PreparedStatementSetter() {

		@Override
		public void setValues(PreparedStatement ps) throws SQLException {
			ps.setString(1, employee.getName());
			ps.setString(2, employee.getEmail());
			ps.setString(3, employee.getContact());	
		}
		
	});
	return value>0?true:false;
}

@Override
public List<Employee> getAllEmployees() {
	String query="select * from employee";
	List<Employee> list= template.query(query, new RowMapper<Employee>() {

		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee emp = new Employee();
			emp.setId(rs.getInt(1));
			emp.setName(rs.getString(2));
			emp.setEmail(rs.getString(3));
			emp.setContact(rs.getString(4));
			return emp;
		}
		
	});
	return list;
}

@Override
public boolean isDeleteEmployee(int empid) {
	String query="delete from employee where eid=?";
	int value=template.update(query, new PreparedStatementSetter() {

		@Override
		public void setValues(PreparedStatement ps) throws SQLException {
			ps.setInt(1, empid);
			
		}
		
	});
	return value>0?true:false;
}

@Override
public boolean isUpdateEmployee(Employee employee) {
	int value=template.update("update employee set name=?, email=?, contact=? where eid=?",new Object[]{employee.getName(),employee.getEmail(),employee.getContact(),employee.getId()});
	return value>0?true:false;
}
}
