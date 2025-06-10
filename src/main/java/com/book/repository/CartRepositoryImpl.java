package com.book.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.book.domain.Cart;

@Repository
public class CartRepositoryImpl implements CartRepository{

	private Map<String, Cart> listsOfCarts;
	
	public CartRepositoryImpl() {
		listsOfCarts = new HashMap<String, Cart>();
	}
	
	@Override
	public Cart create(Cart cart) {
		// TODO Auto-generated method stub
		if(listsOfCarts.keySet().contains(cart.getCartId())) {
			throw new IllegalArgumentException(String.format("장바구니를 생성할 수 없습니다. 장바구니 id(%)가 존재합니다.", cart.getCartId()));
		}
		
		listsOfCarts.put(cart.getCartId(), cart);
		
		return cart;
	}

	@Override
	public Cart read(String cartId) {
		// TODO Auto-generated method stub
		
		return listsOfCarts.get(cartId);
	}

	@Override
	public void update(String cartId, Cart cart) {
		// TODO Auto-generated method stub
		if(!listsOfCarts.keySet().contains(cartId)) {
			// 장바구니 ID가 존재하지 않은 경우 에외 처리
			throw new IllegalArgumentException(String.format("장바구니 목록을 갱신할 수 없습니다. 장바구니 id(%)가 존재하지 않습니다.", cartId));
		}
		
		listsOfCarts.put(cartId, cart);
	}

	@Override
	public void delete(String cartId) {
		// TODO Auto-generated method stub
		if(!listsOfCarts.keySet().contains(cartId)) {
			// 장바구니 ID가 존재하지 않으면 예외 처리
			throw new IllegalArgumentException(String.format("장바구니 목록을 삭제할 수 없습니다. 장바구니 id(%)가 존재하지 않습니다.", cartId));
		}
		
		listsOfCarts.remove(cartId);
	}

}
