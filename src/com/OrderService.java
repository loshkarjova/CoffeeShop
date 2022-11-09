package com;

import com.products.IProduct;

public class OrderService {
    public double totalPrice;


    public void add(IProduct coffee) {
        totalPrice += coffee.calculateCost();
    }


    private double applyDiscount() {
        if (totalPrice >= 100 && totalPrice < 200) {
            return totalPrice-= totalPrice * 0.1;
        } else if (totalPrice >= 200 && totalPrice < 300) {
           return totalPrice -= totalPrice * 0.2;
        } else if (totalPrice >= 300) {
            return totalPrice -= totalPrice * 0.3;
        } else return totalPrice;


    }

    public double getFinalCost() {
        applyDiscount();
        double result = totalPrice;
        totalPrice = 0;
        return result;
    }
}
