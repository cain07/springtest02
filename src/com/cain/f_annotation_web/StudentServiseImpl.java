package com.cain.f_annotation_web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class StudentServiseImpl implements StudentServise {

	
	private StudentDao studentDao;

	@Autowired
	@Qualifier("StudentDaoid")
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}


	@Override
	public void addStudent() {
		// TODO Auto-generated method stub
		studentDao.addstu();
	}

}
