package com;

import com.products.Bakery;
import com.products.Drink;
import com.products.IProduct;
import com.products.Topping;

public class Main {
    public static void main(String[] args) {

        OrderService orderService = new OrderService();

        IProduct coffee = new Drink(2, DrinkType.LATE, DrinkSize.M);
        IProduct bakery = new Bakery(10, DessertType.CAKE);
        IProduct topping = new Topping(2, ToppingType.COCONUT);
        orderService.add(coffee);
        orderService.add(bakery);
        orderService.add(topping);
        double finalCost = orderService.getFinalCost();
        System.out.println(finalCost);


    }


}
