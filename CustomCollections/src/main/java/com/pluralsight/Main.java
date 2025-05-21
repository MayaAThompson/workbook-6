package com.pluralsight;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        FixedList<Integer> numbers = new FixedList<>(3);
        try {
            numbers.add(10);
            numbers.add(3);
            numbers.add(92);
            numbers.add(43);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: ");
            e.printStackTrace();
        }
        System.out.println("Numbers size: " + numbers.getItems().size());

        FixedList<LocalDate> dates = new FixedList<>(2);
        try {
           dates.add(LocalDate.now());
           dates.add(LocalDate.now());
           dates.add(LocalDate.now());
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: ");
            e.printStackTrace();
        }
        System.out.println("Dates size: " + dates.getItems().size());
    }
}
