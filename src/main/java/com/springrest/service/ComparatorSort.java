package com.springrest.service;

import java.util.Comparator;

import com.springrest.entity.Student;

public class ComparatorSort implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
