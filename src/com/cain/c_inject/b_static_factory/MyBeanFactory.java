package com.cain.c_inject.b_static_factory;

public class MyBeanFactory {

	/**
	 * 创建实例
	 * @return
	 */
	public static BookService createStaticService(){
		return new BookServiceImpl();
	}
	
	
	/**
	 * 创建实例
	 * @return
	 */
	public BookService createService(){
		return new BookServiceImpl();
	}
}
