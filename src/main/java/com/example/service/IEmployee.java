package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.model.Employee;

public interface IEmployee {
	
	Integer saveEmployee(Employee e);
	void updateEmployee(Employee e);
	void deleteEmployee(Integer id);
	List<Employee> getAllEmployees();
	Optional<Employee> getOneEmployee(Integer id);
	boolean isEmployeeIdExist(Integer id);

}
