package com.book.repository;

import com.book.domain.Cart;

public interface CartRepository {

	Cart create(Cart cart);
	Cart read(String cartId);
	void update(String cartId, Cart cart);
}
