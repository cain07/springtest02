package com.cain.d_lifecycle;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestA {

	@Test
	public void demo01(){
		//´ÓspringÈÝÆ÷»ñµÃ
		String xmlPath = "com/cain/d_lifecycle/beans.xml";
		ClassPathXmlApplicationContext  applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		BookService bookService = (BookService) applicationContext.getBean("bookServiceId");
		bookService.addBooks();
		applicationContext.close();
	}

}
