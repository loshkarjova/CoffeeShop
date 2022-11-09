package com.products;

import com.DessertType;

public class Bakery extends AbstractProduct{
    private final DessertType dessertType;

    public Bakery(int quantity, DessertType dessertType) {
        super(quantity, dessertType.getPrice());
        this.dessertType = dessertType;
    }

    @Override
    public double calculateCost() {
        return this.dessertType.getPrice() * getQuantity();
    }
}
