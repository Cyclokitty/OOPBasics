package com.cyclokitty;

public class LyyraCard {
    private String name;
    private double balance;

    public LyyraCard(String ownerName, double balanceAtStart) {
        this.name = ownerName;
        this.balance = balanceAtStart;
    }

    public String toString() {
        return this.name + ": The card has " + this.balance + " euros.";
    }

    public void payEconomical() {
        if (this.balance - 2.50 >= 0) {
            this.balance -= 2.50;
        } else {
            System.out.println("Sorry you do not have enough money on your card. " +
                    "Balance is: " + this.balance);
        }

    }

    public void payGourmet() {
        if (this.balance - 4.0 >= 0) {
            this.balance -= 4.0;
        } else {
            System.out.println("Sorry you do not have enough money on your card. " +
                    "Balance is: " + this.balance);
        }
    }

    public void loadMoney(double amount) {
        if (this.balance + amount > 150.0 || amount < 0) {
            this.balance = 150.0;
        } else {
            this.balance += amount;
        }
    }


}
