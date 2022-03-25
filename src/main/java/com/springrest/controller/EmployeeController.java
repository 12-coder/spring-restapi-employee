package com.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.entity.Employee;
import com.springrest.exception.EmployeeAlreadyExistsException;
import com.springrest.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping("/")
	public String ok() {
		return "OK";
	}

	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee employee) throws EmployeeAlreadyExistsException {
		return service.saveEmployee(employee);
	}

	@GetMapping("/fetch")
	public List<Employee> getAllEmployees() {
		return service.getAllEmployees();

	}

	@PutMapping("/update/{salary}")
	public Employee updateEmployee(@RequestBody Employee employee, @PathVariable Double salary) {
		return service.updateEmployee(employee, salary);
	}

}
