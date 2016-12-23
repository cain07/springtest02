package com.cain.d_lifecycle;

public class BookServiceImpl implements BookService {
	

	public void addBooks() {
		// TODO Auto-generated method stub
		System.out.println("d_lifecycle add books");
	}

	
	public void myInit(){
		System.out.println("³õÊ¼»¯");
	}
	
	public void myDestroy(){
		System.out.println("Ïú»Ù");
	}

	
}
