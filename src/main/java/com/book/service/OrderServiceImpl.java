package com.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.domain.Book;
import com.book.domain.Order;
import com.book.repository.BookRepository;
import com.book.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CartService cartService;
	
	@Override
	public void confirmOrder(String bookId, long quantity) {
		
		Book bookById = bookRepository.getBookById(bookId);
		
		if(bookById.getUnitsInStock() < quantity) {
			throw new IllegalArgumentException("품절입니다. 사용가능한 제고수 : " + bookById.getUnitsInStock());
		}
		
		bookById.setUnitsInStock(bookById.getUnitsInStock() - quantity);
	}

	@Override
	public Long saveOrder(Order order) {
		
		Long orderId = orderRepository.saveOrder(order);
		cartService.delete(order.getCart().getCartId());
		
		return orderId;
	}

}
