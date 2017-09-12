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

    public void loadMoneyToCard(LyyraCard card, double sum) {
        card.loadMoney(sum);
        this.cashInRegister += sum;
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

    public boolean payEconomical(LyyraCard card) {
        double economicalLunch = 2.5;
        if (card.balance() >= economicalLunch) {
            card.payEconomical();
            this.economicalSold++;
            return true;
        } else if (card.balance() < economicalLunch) {
            return false;
        }
        return false;
    }

    public boolean payGourmet(LyyraCard card) {
        double gourmetLunch = 4.0;
        if (card.balance() >= gourmetLunch) {
            card.payGourmet();
            this.gourmetSold++;
            return true;
        } else if (card.balance() < gourmetLunch) {
            return false;
        }
        return false;
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
