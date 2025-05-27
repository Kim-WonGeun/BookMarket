package com.book.repository;

import java.util.List;
import com.book.domain.Book;

public interface BookRepository {

	List<Book> getAllBookList();
	
}
