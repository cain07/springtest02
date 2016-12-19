package com.cain.b_bi;

public class BookServiceImpl implements BookService {
	
	private BookDao bookDao;
	
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	public void addBooks() {
		// TODO Auto-generated method stub
		this.bookDao.addBook();
	}

}
