package com.cain.f_annotation_web;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestA {

	@Test
	public void demo01(){
		//´ÓspringÈÝÆ÷»ñµÃ
		String xmlPath = "com/cain/f_annotation_web/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		StudentAction action = (StudentAction) applicationContext.getBean("studentactionid");
		action.execute();
		
	}

}
