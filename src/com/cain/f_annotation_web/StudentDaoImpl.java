package com.cain.f_annotation_web;

import org.springframework.stereotype.Repository;

@Repository("StudentDaoid")
public class StudentDaoImpl implements StudentDao {

	@Override
	public void addstu() {
		// TODO Auto-generated method stub
		System.out.println("dao sql ");
	}

}
