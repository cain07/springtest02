package com.cain.f_annotation_web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("studentactionid")
public class StudentAction {
	
	@Autowired
	private StudentServise studentServise;

	public void execute() {
		// TODO Auto-generated method stub
		studentServise.addStudent();
	}

}
