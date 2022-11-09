package com;

public enum DrinkSize {
    S(0),M(5),L(10);

    private final int price;

    DrinkSize(int price){
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }




}
