package com.pluralsight;

public interface Valuable extends Comparable<Valuable> {

    double getValue();

    @Override
    default int compareTo(Valuable o) {
        return Double.compare(this.getValue(), o.getValue());
    }
}
