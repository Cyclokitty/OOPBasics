package com.cyclokitty;


// following functionality:
// * a counter has an object variable that remembers the value of the counter. The value is within
// the range 0.. upperBound
// * in the beginning the value is 0.
// * the upper bound of the value is defined by the constructor parameter.
// * the method next increments the value of the counter. If the calue would be more than the
// upperLimit, it wraps around and becomes zero.
// * the method toString returns a string representation of the counter value.


public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.value = value;
        this.upperLimit = upperLimit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value > 0 || value < this.upperLimit) {
            this.value = value;
        }
    }

    public void next() {
        if (this.value >= this.upperLimit) {
            this.value = 0;
        } else {
            this.value++;
        }
    }

    public String toString() {
        String num = "" + this.value;
        if (num.length() == 2 ) {
            return num;
        } else {
            return "0" + num;
        }
    }
}
