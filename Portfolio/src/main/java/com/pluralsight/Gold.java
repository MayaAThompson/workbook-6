package com.pluralsight;

public class Gold extends FixedAsset{

    private double weight;

    public Gold(double weight) {
        super("gold", 1000);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getValue() {
        return this.marketValue * weight;
    }
}
