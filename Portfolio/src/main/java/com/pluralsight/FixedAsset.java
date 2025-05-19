package com.pluralsight;

public abstract class FixedAsset implements Valuable {

    String name;
    double marketValue;

    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    public double getValue() {
        return this.marketValue;
    }
}
