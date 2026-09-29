package com.mouli.assignments.FoodDelivery;

class Burger extends FoodItem {

    private double packingCharge;

    public Burger(double basePrice, double packingCharge) {
        super("Burger", basePrice);
        this.packingCharge = packingCharge;
    }

    @Override
    public double calculatePrice() {
        return basePrice + packingCharge;
    }
}
