package com.pluralsight;

public class CreditCard implements Valuable{

    String name;
    String accountNumber;
    double balance;

    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void pay(double amount) {
        this.balance += amount;
    }

    public void charge(double amount) {
        this.balance -= amount;
    }

    @Override
    public double getValue() {
        return this.balance;
    }
}
