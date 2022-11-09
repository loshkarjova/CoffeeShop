package com.products;



public abstract class AbstractProduct implements IProduct {
    private final int quantity;
    private final double price;

    public AbstractProduct( int quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
