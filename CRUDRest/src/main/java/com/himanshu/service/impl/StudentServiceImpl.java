package com.himanshu.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.himanshu.dao.StudentDao;
import com.himanshu.model.Student;
import com.himanshu.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentDao studentDao;
	
	@Transactional
	public void add(Student student) {
		studentDao.add(student);
	}

	@Transactional
	public void edit(Student student) {
		studentDao.edit(student);
	}

	@Transactional
	public void delete(int StudentId) {
		studentDao.delete(StudentId);
		
	}

	@Transactional
	public Student getStudent(int StudentId) {
		
		return studentDao.getStudent(StudentId);
	}

	@Transactional
	public List getAllStudent() {
		
		return studentDao.getAllStudent();
	}

}
