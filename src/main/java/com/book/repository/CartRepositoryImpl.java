package com.book.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.book.domain.Cart;

@Repository
public class CartRepositoryImpl implements CartRepository{

	private Map<String, Cart> listOfCarts;
	
	public CartRepositoryImpl() {
		listOfCarts = new HashMap<String, Cart>();
	}
	
	@Override
	public Cart create(Cart cart) {
		// TODO Auto-generated method stub
		if(listOfCarts.keySet().contains(cart.getCartId())) {
			throw new IllegalArgumentException(String.format("장바구니를 생성할 수 없습니다. 장바구니 id(%)가 존재합니다.", cart.getCartId()));
		}
		
		listOfCarts.put(cart.getCartId(), cart);
		
		return cart;
	}

	@Override
	public Cart read(String cartId) {
		// TODO Auto-generated method stub
		
		return listOfCarts.get(cartId);
	}

}
