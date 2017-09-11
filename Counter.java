package com.cyclokitty;

public class Counter {
    private int  count;
    boolean check;

    public Counter(int startingValue, boolean check) {
        this.count = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this.count = startingValue;
        this.check = false;
    }

    public Counter(boolean check) {
        this.count = 0;
        this.check = true;
    }

    public Counter() {
        this.count = 0;
        this.check = false;
    }


    public int value() {
        return this.count;
    }

    public void increase() {
        this.count++;
    }

    public void increase(int increaseAmount) {
        this.count += increaseAmount;
    }

    public void decrease() {
        if (this.check) {
            if (this.count <= 0) {
                this.count = 0;
            } else {
                this.count--;
            }
        } else {
            this.count--;
        }
    }

    public void decrease(int deceaseAmount) {
        if (deceaseAmount < 0) {
            this.count += 0;
        } else {
            if (this.check) {
                if (this.count - deceaseAmount <= 0) {
                    this.count = 0;
                } else {
                    this.count -= deceaseAmount;
                }
            } else {
                this.count -= deceaseAmount;
            }
        }

    }
}
