package com.mouli.assignments.FoodDelivery;

class Pasta extends FoodItem {

    private double cheeseCharge;

    public Pasta(double basePrice, double cheeseCharge) {
        super("Pasta", basePrice);
        this.cheeseCharge = cheeseCharge;
    }

    @Override
    public double calculatePrice() {
        return basePrice + cheeseCharge;
    }
}
