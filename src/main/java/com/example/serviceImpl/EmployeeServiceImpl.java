package com.example.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Employee;
import com.example.repo.EmployeeRepository;
import com.example.service.IEmployee;

@Service
public class EmployeeServiceImpl implements IEmployee {

	@Autowired
	private EmployeeRepository repo;

	@Override
	@Transactional
	public Integer saveEmployee(Employee e) {
		return repo.save(e).getEmpNo();
	}

	@Override
	@Transactional
	public void updateEmployee(Employee e) {
		repo.save(e);
	}

	@Override
	@Transactional()
	public void deleteEmployee(Integer id) {
		repo.deleteById(id);

	}

	@Override
	@Transactional(readOnly = true)
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Employee> getOneEmployee(Integer id) {
		return repo.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public boolean isEmployeeIdExist(Integer id) {
		return repo.existsById(id);
	}

}
