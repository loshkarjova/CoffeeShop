package com;

public enum ToppingType {
    CHOCOLATE(5), CARAMEL(5), COCONUT(5), VANILLA(5);

    private final int price;

    ToppingType(int price){
    this.price = price;
}

    public int getPrice(){
        return this.price;
    }



}
