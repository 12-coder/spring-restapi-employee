package com.springrest.Repository;

import org.springframework.data.repository.CrudRepository;

import com.springrest.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

}
