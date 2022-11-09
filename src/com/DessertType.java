package com;

public enum DessertType {
    COOKIE(5), CAKE(6) , PIE(7);

    private final double price;


    DessertType(double price){
        this.price = price;
    }
    public double getPrice(){
        return this.price;
    }
}
