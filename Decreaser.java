package com.cyclokitty;

public class Decreaser {
    private int value;
    private int initialValue;

    public Decreaser(int valueAtStart) {
        this.value = valueAtStart;
        this.initialValue = valueAtStart;
    }

    public void printValue() {
        System.out.println("The value is: " + this.value);
    }

    public void decrease() {
        if (this.value <= 0) {
            this.value = 0;
        } else {
            this.value--;
        }
    }

    public void reset() {
        this.value = 0;
    }

    public void setInitialValue() {
        this.value = this.initialValue;
    }
}
