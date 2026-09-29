package com.mouli.assignments.FoodDelivery;

class Pizza extends FoodItem {

    private double toppingCharge;

    public Pizza(double basePrice, double toppingCharge) {
        super("Pizza", basePrice);
        this.toppingCharge = toppingCharge;
    }

    @Override
    public double calculatePrice() {
        return basePrice + toppingCharge;
    }
}
