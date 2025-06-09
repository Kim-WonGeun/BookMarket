package com.book.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.book.domain.Book;
import com.book.exception.BookIdException;
import com.book.service.BookService;

public class BookIdValidator implements ConstraintValidator<BookId, String> {

	@Autowired
	private BookService bookService;
	
	public void initalize(BookId constraintAnnotation) {	// @BookId 정보 초기화 메서드
	}

	// 유효성 검사 메서드
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		Book book;
		
		try {
			book = bookService.getBookById(value);
		} catch (BookIdException e) {
			return true;
		}
		
		if(book != null) {
			return false;
		}
		
		return true;
	}
	
}
