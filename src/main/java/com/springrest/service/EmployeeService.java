package com.springrest.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.Repository.EmployeeRepository;
import com.springrest.entity.Employee;
import com.springrest.exception.EmployeeAlreadyExistsException;
import com.springrest.util.ComparatorEmployeeSalary;
import com.springrest.exception.ResourceNotFoundException;
@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repo;
	
	

	public Employee saveEmployee(Employee e) throws EmployeeAlreadyExistsException {
		List<Employee> l = (List<Employee>) repo.findAll();
		for (Employee s : l) {
			if (e.getId() == s.getId()) {
				throw new EmployeeAlreadyExistsException("Employee with the given ID already Exists in the database");
			}

		}
		return repo.save(e);
	}

	public List<Employee> sortEmployees() {
		List<Employee> l = (List<Employee>) repo.findAll();

		Collections.sort(l, new ComparatorEmployeeSalary());
		return l;

	}
	public List<Employee> getAllEmployees() {
		List<Employee> l = (List<Employee>) repo.findAll();
		return l;
		}

	public Employee updateEmployee(Employee d,int id, Double salary) {
		Employee employeeDb = repo.findById(id).
				orElseThrow(() ->   new ResourceNotFoundException("EmployeeId " + id + "not found"));

		 
		employeeDb.setSalary(d.getSalary());
		repo.save(d);
		return d;

	}
		
		

		
		

	public List<Employee> deleteEmployees(int id) {
		repo.deleteById(id);
		List<Employee> l = (List<Employee>) repo.findAll();

		return l;
	}

	public Employee findById(int id) {
		Employee e=  repo.findById(id)
		        .orElseThrow(() ->   new ResourceNotFoundException("EmployeeId " + id + "not found"));
		return e;
	}

}

