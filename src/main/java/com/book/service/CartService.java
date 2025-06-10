package com.book.service;

import com.book.domain.Cart;

public interface CartService {

	Cart create(Cart cart);
	Cart read(String cartId);
	
}
