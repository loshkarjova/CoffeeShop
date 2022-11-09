package com;

public enum DrinkType {
    LATE(25),
    CAPPUCCINO(20),
    AMERICANO(15),
    ESPRESSO(11),
    TEA(10);

    private final int price;

    DrinkType(int price) {
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }
}
