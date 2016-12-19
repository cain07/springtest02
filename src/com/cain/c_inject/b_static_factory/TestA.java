package com.cain.c_inject.b_static_factory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestA {

	@Test
	public void demo01(){
		//从spring容器获得
		String xmlPath = "com/cain/b_bi/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		BookService bookService = (BookService) applicationContext.getBean("bookServiceId");
		bookService.addBooks();
	}

	/**
	 * 静态工厂
	 */
	@Test
	public void demo02(){
		//从spring容器获得
		String xmlPath = "com/cain/c_inject/b_static_factory/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		BookService bookService = (BookService) applicationContext.getBean("bookServiceFactory");
		bookService.addBooks();
	}
	
	/**
	 * 实例工厂
	 */
	@Test
	public void demo03(){
		//从spring容器获得
		String xmlPath = "com/cain/c_inject/b_static_factory/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		BookService bookService = (BookService) applicationContext.getBean("bookServiceid");
		bookService.addBooks();
	}
	
	
}
