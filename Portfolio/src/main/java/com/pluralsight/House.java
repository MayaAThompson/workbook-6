package com.pluralsight;

public class House extends FixedAsset{

    int yearBuuilt;
    int squareFeet;
    int bedrooms;

    public House(String name, double marketValue, int yearBuuilt, int squareFeet, int bedrooms) {
        super(name, marketValue);
        this.yearBuuilt = yearBuuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    @Override
    public double getValue() {
        return this.marketValue * squareFeet - (yearBuuilt *.01); //TODO: fix this formula
    }
}
