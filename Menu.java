package com.cyclokitty;

import java.util.ArrayList;

public class Menu {
    private ArrayList<String> meals;
    private String name;

    public Menu(String name) {
        this.meals = new ArrayList<String>();
        this.name = name;
    }

    public void addMeal(String meal) {
        if (!meals.contains(meal)) {
            this.meals.add(meal);
        }
    }

    public void printMeals() {
        if (this.meals.isEmpty()) {
            System.out.println("Add meals to create a menu.");
        } else {
            System.out.println("Welcome to " + this.name);
            System.out.println("Today's Menu:");
            for (String meal : this.meals) {
                System.out.println(meal);
            }
        }
    }

    public void clearMenu() {
        this.meals.clear();
    }
}
