package com.cyclokitty;

public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        this.sum += number;
        this.amountOfNumbers++;
    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }

    public int sum() {
        return this.sum;
    }


    public double average() {
        System.out.println("the sum: " + this.sum + " this amount of nums: " + this.amountOfNumbers);
        return (double) this.sum / this.amountOfNumbers;
    }
}
