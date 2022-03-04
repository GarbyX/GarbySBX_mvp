package com.garby.garbysx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.garby.garbysx.common.Constants;
import com.garby.garbysx.model.Book;
import com.garby.garbysx.model.IssuedBook;
import com.garby.garbysx.repository.IssuedBookRepository;

@Service
public class IssuedBookService {

	@Autowired
	private IssuedBookRepository issuedBookRepository;
	
	public List<IssuedBook> getAll() {
		return issuedBookRepository.findAll();
	}
	
	public IssuedBook get(Long id) {
		return issuedBookRepository.findById(id).get();
	}
//
//	public Long getCountByBook(Book book) {
//		return issuedBookRepository.countByBookAndReturned(book, Constants.BOOK_NOT_RETURNED);
//	}
	
	public IssuedBook save(IssuedBook issuedBook) {
		return issuedBookRepository.save(issuedBook);
	}
	
	public IssuedBook addNew(IssuedBook issuedBook) {
//		issuedBook.setReturned( Constants.BOOK_NOT_RETURNED );
		return issuedBookRepository.save(issuedBook);
	}

}
