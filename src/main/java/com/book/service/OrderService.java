package com.book.service;

import com.book.domain.Order;

public interface OrderService {

	void confirmOrder(String bookId, long quantity);
	Long saveOrder(Order order);
	
}
