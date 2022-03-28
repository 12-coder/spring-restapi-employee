package com.springrest.exception;

public class ResourceNotFoundException extends RuntimeException {
	public ResourceNotFoundException() {
		System.out.println("Employee id not found in the database");
	}
	public ResourceNotFoundException(String s) {
		super(s);
	}
}
