package com.rudiger.store.exceptions;

public class CartNotFoundException extends  RuntimeException{
    public CartNotFoundException(){
        super("Cart not found");
    }
}
