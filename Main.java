package com.cyclokitty;

import com.sun.org.apache.xpath.internal.operations.Mult;

import java.util.ArrayList;
import java.util.Scanner;

public class Main  {

    public static void main(String[] args) throws Exception {
        Person matti = new Person("Matti");
        Person john = new Person("John");

        matti.setHeight(180);
        matti.setWeight(86);

        john.setHeight(175);
        john.setWeight(64);

        matti.setAge(21);

        System.out.println(matti.getName() + ", body mass index: " + String.format("%.2f", matti.bodyMassIndex()) );
        System.out.println(john.getName() + ", body mass index: " + String.format("%.2f", john.bodyMassIndex()) );

        System.out.println(matti);

        System.out.println("**********");

        Product banana = new Product("Banana", 1.1, 13);
        banana.printProduct();

        System.out.println("**********");

        Multiplier  threeMultiplier = new Multiplier(3);
        Multiplier fourMultiplier = new Multiplier(4);

        System.out.println(threeMultiplier.multiply(2));
        System.out.println(fourMultiplier.multiply(2));

        System.out.println(threeMultiplier.multiply(4));
        System.out.println(fourMultiplier.multiply(1));

        System.out.println("**********");

        Decreaser countDown = new Decreaser(10);
        countDown.printValue();
        countDown.decrease();
        countDown.printValue();
        countDown.decrease();
        countDown.printValue();
        countDown.decrease();
        countDown.printValue();
        countDown.decrease();
        countDown.printValue();
        countDown.decrease();
        countDown.printValue();
        countDown.reset();
        countDown.printValue();
        countDown.setInitialValue();
        countDown.printValue();

        System.out.println("**********");

        Menu cafe = new Menu("Laura's Cafe");

        cafe.addMeal("Burgers and fries");
        cafe.addMeal("Sauerkraut");
        cafe.addMeal("Fish 'n' Chips");
        cafe.printMeals();

        cafe.clearMenu();

        System.out.println("-----------");
        cafe.printMeals();

        System.out.println("-----------");
        cafe.addMeal("Meatloaf and mashed potatoes");
        cafe.addMeal("Fish n Chips");
        cafe.addMeal("Soup and grilled cheese");
        cafe.addMeal("Fish n Chips");

        cafe.printMeals();

        System.out.println("**********");

        LyyraCard pekka = new LyyraCard("Pekka", 20);
        LyyraCard brian = new LyyraCard("Brian", 30);
        pekka.payGourmet();
        brian.payEconomical();
        System.out.println(pekka);
        System.out.println(brian);
        pekka.loadMoney(20);
        brian.payGourmet();
        System.out.println(pekka);
        System.out.println(brian);
        pekka.payEconomical();
        pekka.payEconomical();
        brian.loadMoney(50);
        System.out.println(pekka);
        System.out.println(brian);

        System.out.println("**********");

        NumberStatistics stats = new NumberStatistics();


        stats.addNumber(3);
        stats.addNumber(5);
        stats.addNumber(1);
        stats.addNumber(2);
        System.out.println("Amount: " + stats.amountOfNumbers());
        System.out.println("Sum: " + stats.sum());
        System.out.println("Average: " + stats.average());

        Scanner scan = new Scanner(System.in);
        NumberStatistics askStats = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();

        System.out.print("Type numbers: \n");
        int input = scan.nextInt();
        while (input > 0) {
            askStats.addNumber(input);
            if (input % 2 == 0) {
                even.addNumber(input);
            } else {
                odd.addNumber(input);
            }
            input = scan.nextInt();
        }
        System.out.println("Sum: " + askStats.sum());
        System.out.println("Even sum: " + even.sum());
        System.out.println("Odd sum: " + odd.sum());


        // This is our clock!

        Scanner reader = new Scanner(System.in);

        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.print("seconds: ");
        int s = reader.nextInt();
        System.out.print("minutes: ");
        int m = reader.nextInt();
        System.out.print("hours: ");
        int h = reader.nextInt();

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);


        int i = 0;
        while (true) {
            System.out.println(hours + ":" + minutes + ":" + seconds);
            Thread.sleep(1000);
            seconds.next();
            if (seconds.getValue() == 0) {
                minutes.next();
                if (minutes.getValue() == 0) {
                    hours.next();
                }
            }
            i++;
        }
    }

}
