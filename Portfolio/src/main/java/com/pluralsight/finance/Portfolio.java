package com.pluralsight.finance;

import com.pluralsight.Valuable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Portfolio {

    String name;
    String owner;
    List<Valuable> assets;

    public Portfolio(String name, String owner) {
        assets = new ArrayList<>();
        this.name = name;
        this.owner = owner;
    }

    public void add(Valuable asset) {
        assets.add(asset);
    }

    public double getValue() {

        double sum = 0;
        for (Valuable valuable : assets) {
            sum += valuable.getValue();
        }
        return sum;
    }

    public Valuable getMostValuable() {
        return Collections.max(this.assets);
    }

    public Valuable getLeastValuable() {
        return Collections.min(this.assets);
    }
}
