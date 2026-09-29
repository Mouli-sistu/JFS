package com.mouli.assignments.FoodDelivery;

class Biryani extends FoodItem {

    private double gst;

    public Biryani(double basePrice, double gst) {
        super("Biryani", basePrice);
        this.gst = gst;
    }

    @Override
    public double calculatePrice() {
        return basePrice + (basePrice * gst / 100);
    }
}
