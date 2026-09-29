package com.mouli.assignments.FoodDelivery;

public class Main {

    public static void main(String[] args) {

        FoodItem p1 = new Pizza(300, 50);
        FoodItem b1 = new Burger(180, 20);
        FoodItem br1 = new Biryani(250, 5);
        FoodItem pa1 = new Pasta(220, 40);

        p1.printBill();
        b1.printBill();
        br1.printBill();
        pa1.printBill();
    }
}