package com.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	
	@GetMapping("/fetchById")
	public Employee findEmployee(@PathVariable int id) {
		return service.findById(id);
	}
	
	@GetMapping("/sortBySalary")
	public List<Employee> sort(){
		return service.sortEmployees();
	}
	@DeleteMapping("/delete/{id}")
	public List<Employee> deleteEmployees(@PathVariable int id) {
		return service.deleteEmployees(id);

	}

	@PutMapping("/update/{id}/{salary}")
	public Employee updateEmployee(@RequestBody Employee employee,@PathVariable int id, @PathVariable Double salary) {
		return service.updateEmployee(employee,id, salary);
	}

}

