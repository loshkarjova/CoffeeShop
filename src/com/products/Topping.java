package com.products;

import com.ToppingType;

public class Topping extends AbstractProduct{
    private final ToppingType toppingType;

    public Topping(int quantity, ToppingType toppingType) {
        super(quantity, toppingType.getPrice());
        this.toppingType = toppingType;
    }

    @Override
    public double calculateCost() {
        return this.toppingType.getPrice()* getQuantity();
    }
}
