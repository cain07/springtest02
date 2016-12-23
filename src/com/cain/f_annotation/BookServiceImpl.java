package com.cain.f_annotation;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("bookServiceId")
public class BookServiceImpl implements BookService {
	

	public void addBooks() {
		// TODO Auto-generated method stub
		System.out.println("annotation add book");
	}

}
