package com.book.repository;

import com.book.domain.Order;

public interface OrderRepository {

	Long saveOrder(Order order);
	
}
