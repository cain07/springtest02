package com.cain.c_inject.b_static_factory;

public class MyBeanFactory {

	/**
	 * ����ʵ��
	 * @return
	 */
	public static BookService createStaticService(){
		return new BookServiceImpl();
	}
	
	
	/**
	 * ����ʵ��
	 * @return
	 */
	public BookService createService(){
		return new BookServiceImpl();
	}
}
