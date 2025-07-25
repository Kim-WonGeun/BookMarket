package com.book.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.book.domain.Order;

@Repository
public class OrderRepositoryImpl implements OrderRepository {

	private Map<Long, Order> listOfOrders;
	private long nextOrderId;
	
	public OrderRepositoryImpl() {
		listOfOrders = new HashMap<Long, Order>();
		nextOrderId = 2000;
	}
	
	@Override
	public Long saveOrder(Order order) {
		
		order.setOrderId(getNextOrderId());
		listOfOrders.put(order.getOrderId(), order);
		
		return order.getOrderId();
	}

	
	private synchronized long getNextOrderId() {
		return nextOrderId++;
	}
}
