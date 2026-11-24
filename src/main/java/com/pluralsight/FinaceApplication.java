package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.Jewelery;
import com.pluralsight.finance.Protfolio;

import java.math.BigDecimal;

public class FinaceApplication {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(123, "Pam", new BigDecimal("12500"));
        BankAccount account2 = new BankAccount(456, "Gary", new BigDecimal("1500"));
        //create protfolio abject
        Protfolio protfolio = new Protfolio("My protfolio", "Mohamed");
        //add protfolio
        protfolio.add(account1);
        protfolio.add(account2);


        // Try to deposit money into both accounts
        account1.deposit(100);
        account2.deposit(100);

        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
        System.out.println("Account1: " + account1.getBalance());
        System.out.println("Account2: " + account2.getBalance());
        //display the portfolio information
        System.out.println("Total Portfolio is Value " + protfolio.getValue());
        System.out.println("Most Valuable Assets :" + protfolio.getMostValuable());
        System.out.println("Least Valuable Assets :" + protfolio.getLeastValuable());
    }

}