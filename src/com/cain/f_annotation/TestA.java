package com.cain.f_annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestA {

	@Test
	public void demo01(){
		//´ÓspringÈÝÆ÷»ñµÃ
		String xmlPath = "com/cain/f_annotation/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		BookService bookService = (BookService) applicationContext.getBean("bookServiceId");
		bookService.addBooks();
	}

}
