package com.cain.c_inject.b_static_factory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestA {

	@Test
	public void demo01(){
		//��spring�������
		String xmlPath = "com/cain/b_bi/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		BookService bookService = (BookService) applicationContext.getBean("bookServiceId");
		bookService.addBooks();
	}

	/**
	 * ��̬����
	 */
	@Test
	public void demo02(){
		//��spring�������
		String xmlPath = "com/cain/c_inject/b_static_factory/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		BookService bookService = (BookService) applicationContext.getBean("bookServiceFactory");
		bookService.addBooks();
	}
	
	/**
	 * ʵ������
	 */
	@Test
	public void demo03(){
		//��spring�������
		String xmlPath = "com/cain/c_inject/b_static_factory/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		BookService bookService = (BookService) applicationContext.getBean("bookServiceid");
		bookService.addBooks();
	}
	
	
}
