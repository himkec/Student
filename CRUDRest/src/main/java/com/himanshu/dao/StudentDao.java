package com.himanshu.dao;

import java.util.List;

import com.himanshu.model.Student;

public interface StudentDao {
	
	public void add(Student student);
	public void edit(Student student);
	public void delete(int StudentId);
	public Student getStudent(int StudentId);
	public List getAllStudent();

}
