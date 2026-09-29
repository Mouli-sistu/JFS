package com.mouli.assignments.FoodDelivery;

abstract class FoodItem {
    protected String name;
    protected double basePrice;

    public FoodItem(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public abstract double calculatePrice();

    public void printBill() {
        System.out.println("----------------------");
        System.out.println("Food Item : " + name);
        System.out.println("Base Price: ₹" + basePrice);
        System.out.println("Final Bill: ₹" + calculatePrice());
    }
}
