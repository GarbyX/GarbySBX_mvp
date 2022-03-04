package com.garby.garbysx.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.garby.garbysx.common.Constants;
import com.garby.garbysx.model.Book;
import com.garby.garbysx.model.Category;
import com.garby.garbysx.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private IssuedBookService issuedBookService;
	
	public Long getTotalCount() {
		return bookRepository.count();
	}
	
//	public Long getTotalIssuedBooks() {
//		return bookRepository.countByStatus(Constants.BOOK_STATUS_ISSUED);
//	}
	
	public List<Book> getAll() {
		return bookRepository.findAll();
	}
	
	public Book get(Long id) {
		return bookRepository.findById(id).get();
	}
	
	public Book getByTag(String tag) {
		return bookRepository.findByTag(tag);
	}
	
	public List<Book> get(List<Long> ids) {
		return bookRepository.findAllById(ids);
	}
	
	public List<Book> getByCategory(Category category) {
		return bookRepository.findByCategory(category);
	}
	
	public List<Book> getAvailabletByCategory(Category category) {

		return null;
	}
	
	public void addNew(Book book) {
		book.setCreateDate(new Date());
//
	}

	public boolean hasUsage(Book book) {
		return true;
	}

	public void delete(Long id) {
		;
	}

//	public Book save(Book book) {
//		return bookRepository.save(book);
//	}
//
//	public void delete(Book book) {
//		bookRepository.delete(book);
//	}
//
//	public void delete(Long id) {
//		bookRepository.deleteById(id);
//	}
//
//	public boolean hasUsage(Book book) {
//		return issuedBookService.getCountByBook(book)>0;
//	}
}
