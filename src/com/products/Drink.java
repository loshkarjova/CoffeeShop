package com.products;

import com.DrinkType;
import com.DrinkSize;


public class Drink extends AbstractProduct{
    private final DrinkType drinkType;
    private final DrinkSize drinkSize;

    public Drink( int quantity, DrinkType drinkType, DrinkSize drinkSize) {
        super(quantity, drinkType.getPrice());
        this.drinkType = drinkType;
        this.drinkSize = drinkSize;
    }

    @Override
    public double calculateCost() {
        return getQuantity() * (this.drinkType.getPrice() + this.drinkSize.getPrice());

    }
}
