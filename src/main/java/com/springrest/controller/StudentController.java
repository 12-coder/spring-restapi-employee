package com.springrest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.entity.Student;
import com.springrest.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentservice;
	
	
	@PostMapping("/student")
	public Student saveStudent(@RequestBody Student student) {
		return studentservice.saveStudent(student);
		}
	
	@GetMapping("/student")
	public List<Student> getAllStudents() {
		return studentservice.getAllStudent();
		
	}
	@GetMapping("/sort")
	public List<Student> sortStudent(){
		List<Student> l=studentservice.sort();
		return l;
	}
	@GetMapping("/student/{id}")
	public Optional<Student> getStudentById(@PathVariable Integer id) {
		return studentservice.getStudentById(id);
	}
	
	@PutMapping("/student/{id}")
	public Student updateSudent(@RequestBody Student student, @PathVariable Integer id) {
		return studentservice.updateStudent(student, id);
	}
	
	@DeleteMapping("/student/{id}")
	public String deleteStudent(@PathVariable Integer id) {
		studentservice.deleteStudent(id);
		return "Student is deleted ";
	
		
	}



		

}
