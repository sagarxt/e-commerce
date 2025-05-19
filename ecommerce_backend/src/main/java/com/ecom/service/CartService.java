package com.ecom.service;

import com.ecom.model.Cart;
import com.ecom.model.CartItem;
import com.ecom.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public void createCart(String userId) {
        Cart cart = new Cart();
        cart.setUserId(userId);
        cart.setItems(new ArrayList<CartItem>());
        cartRepository.save(cart);
    }

    public Cart getCart(String userId) {
        return cartRepository.findByUserId(userId);
    }


}
