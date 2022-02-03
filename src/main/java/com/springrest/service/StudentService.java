package com.springrest.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.Repository.StudentRepository;
import com.springrest.entity.Student;

@Service
public class StudentService {
	@Autowired
	private StudentRepository repo;
	
	public Student saveStudent(Student s) {
		return repo.save(s);
		}
	
	public List<Student> getAllStudent() {
		return (List<Student>) repo.findAll();
	}
	
	public Optional<Student> getStudentById(Integer id) {
		return repo.findById(id);
	}
	
	public Student updateStudent(Student student, Integer id) {
		
		Optional<Student> studentDb = this.repo.findById(id);
		
			Student studentUpdate = studentDb.get();
			studentUpdate.setId(studentUpdate.getId());
			studentUpdate.setName(student.getName());
			studentUpdate.setMarks(student.getMarks());
			repo.save(student);
			return studentUpdate;
		
		
		
	}

	
	public void deleteStudent(Integer id) {
		repo.deleteById(id); 
	}

	public List<Student> sort() {
		List<Student> l=(List<Student>) repo.findAll();
		Collections.sort(l,new ComparatorSort());
		return l;
	}

}


