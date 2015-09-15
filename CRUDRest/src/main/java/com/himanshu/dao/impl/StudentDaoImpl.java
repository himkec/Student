package com.himanshu.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.himanshu.dao.StudentDao;
import com.himanshu.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private SessionFactory session;
	@Override
	public void add(Student student) {
		session.getCurrentSession().save(student);
	}

	@Override
	public void edit(Student student) {
		session.getCurrentSession().update(student);
	}

	@Override
	public void delete(int StudentId) {
		session.getCurrentSession().delete(getStudent(StudentId));
	}

	@Override
	public Student getStudent(int StudentId) {
		
		return (Student)session.getCurrentSession().get(Student.class, StudentId);
	}

	@Override
	public List getAllStudent() {
		
		return session.getCurrentSession().createQuery("from Student").list();
	}

}
