package com.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.domain.Cart;
import com.book.repository.CartRepository;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartRepository cartRepository;

	@Override
	public Cart create(Cart cart) {
		// TODO Auto-generated method stub
		return cartRepository.create(cart);
	}

	@Override
	public Cart read(String cartId) {
		// TODO Auto-generated method stub
		return cartRepository.read(cartId);
	}

	@Override
	public void update(String cartId, Cart cart) {
		// TODO Auto-generated method stub
		cartRepository.update(cartId, cart);
	}

	@Override
	public void delete(String cartId) {
		// TODO Auto-generated method stub
		cartRepository.delete(cartId);
		
	}
	
}
