package com.pluralsight.finance;

import com.pluralsight.BankAccount;
import com.pluralsight.Valuable;

public class FinanceApplication {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Gary", "123", 12500);
        Valuable account2 = new BankAccount("Gary","456" , 1500);
// try to deposit money into both accounts
        account1.deposit(100);
        ((BankAccount)account2).deposit(100);

        Portfolio portfolio1 = new Portfolio("myPortfolio", "Maya Thompson");
        portfolio1.add(account1);
        portfolio1.add(account2);

        Valuable least = portfolio1.getLeastValuable();

        System.out.println(least);

    }
}
