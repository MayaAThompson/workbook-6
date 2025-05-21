package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {

    ArrayList<T> items;
    int maxSize;

    public FixedList(int maxSize) {
        items = new ArrayList<>();
        this.maxSize = maxSize;
    }

    public void add(T item) {
        if ((items.size() < maxSize)) {
            items.add(item);
        }
        else {
            throw new IndexOutOfBoundsException("add attempt exceeds maximum list size.");
        }
    }

    public ArrayList<T> getItems() {
        return items;
    }
}
