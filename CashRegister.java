package com.cyclokitty;

public class CashRegister {
    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        this.cashInRegister = 1000;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {
        double economicalLunch = 2.5;
        if (cashGiven >= economicalLunch) {
            this.cashInRegister += economicalLunch;
            this.economicalSold++;
            return cashGiven - economicalLunch;
        } else if (cashGiven < economicalLunch) {
            return cashGiven;
        }
        return -1;
    }

    public double payGourmet(double cashGiven) {
        double gourmetLunch = 4.0;
        if (cashGiven >= gourmetLunch) {
            this.cashInRegister += gourmetLunch;
            this.gourmetSold++;
            return cashGiven - gourmetLunch;
        } else if (cashGiven < gourmetLunch) {
            return cashGiven;
        }
        return -1;
    }

    public String toString() {
        return "money in register: " + this.cashInRegister + "; economical lunches sold: "
                + this.economicalSold + "; gourmet lunches sold: " + this.gourmetSold;
    }


}
