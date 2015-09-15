package com.himanshu.service;

import java.util.List;

import com.himanshu.model.Student;

public interface StudentService {
	
	public void add(Student student);
	public void edit(Student student);
	public void delete(int StudentId);
	public Student getStudent(int StudentId);
	public List getAllStudent();

}
