package com.cyclokitty;


import java.util.ArrayList;
import java.util.Scanner;

public class Main  {

    public static void main(String[] args) throws Exception {
        ClassRoom student1 = new ClassRoom("Laura Veee", "123456");
        System.out.println(student1);

        Scanner info = new Scanner(System.in);
        ArrayList<ClassRoom> javaClass = new ArrayList<>();
        String studentName = "";
        String studentNum = "";

        while (true) {
            System.out.print("Add new student's name: ");
            studentName = info.nextLine();
            if (studentName.isEmpty()) {
                break;
            }
            System.out.print("Add new student's number: ");
            studentNum = info.nextLine();
            javaClass.add(new ClassRoom(studentName, studentNum));
        }

        for (ClassRoom students : javaClass) {
            System.out.println(students);
        }


        System.out.println("**********");

        Apartment studioManhatten = new Apartment(1, 16, 5500);
        Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
        Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500);

        System.out.println(studioManhatten.larger(twoRoomsBrooklyn));
        System.out.println(fourAndKitchenBronx.larger(twoRoomsBrooklyn));

        System.out.println(studioManhatten.priceDifference(twoRoomsBrooklyn));
        System.out.println(fourAndKitchenBronx.priceDifference(twoRoomsBrooklyn));

        System.out.println(studioManhatten.moreExpensiveThan(twoRoomsBrooklyn));
        System.out.println(fourAndKitchenBronx.moreExpensiveThan(twoRoomsBrooklyn));

        System.out.println("**********");

        MyDate first = new MyDate(25, 12, 2016);
        MyDate second = new MyDate(4, 7, 1776);
        MyDate third = new MyDate(5, 9, 1981);
        MyDate fourth = new MyDate(25, 12, 1982);

        System.out.println(first + " earlier than " + second +  " " + first.earlier(second));
        System.out.println(third + " earlier than " + fourth +  " " + third.earlier(fourth));

        MyDate p1 = new MyDate(14, 2, 2011);
        MyDate p2 = new MyDate(21, 2, 2011);
        MyDate p3 = new MyDate(1, 3, 2011);
        MyDate p4 = new MyDate(31, 12, 2010);

        System.out.println( p1 + " earlier than " + p2 + ": " + p1.earlier(p2));
        System.out.println( p2 + " earlier than " + p1 + ": " + p2.earlier(p1));

        System.out.println( p2 + " earlier than " + p3 + ": " + p2.earlier(p3));
        System.out.println( p3 + " earlier than " + p2 + ": " + p3.earlier(p2));

        System.out.println( p4 + " earlier than " + p1 + ": " + p4.earlier(p1));
        System.out.println( p1 + " earlier than " + p4 + ": " + p1.earlier(p4));

        System.out.println("**********");

        CashRegister unicafeExactum = new CashRegister();
        double theChange = unicafeExactum.payEconomical(10);
        System.out.println("The change is: " + theChange);
        theChange = unicafeExactum.payGourmet(5);
        System.out.println("The change is: " + theChange);
        theChange = unicafeExactum.payEconomical(1);
        System.out.println("The change is: " + theChange);
        theChange = unicafeExactum.payEconomical(2.5);
        System.out.println("The change is: " + theChange);
        System.out.println("Today's sales: " + unicafeExactum);

        System.out.println("**********");

        CashRegister theCafe = new CashRegister();
        LyyraCard cardOfLaura = new LyyraCard(7);
        System.out.println("Today's sales: " + theCafe);
        double changeBack = theCafe.payEconomical(10);
        System.out.println("the change is " + changeBack);
        boolean mealBought = theCafe.payGourmet(cardOfLaura);
        System.out.println("payment made: " + mealBought);
        mealBought = theCafe.payGourmet(cardOfLaura);
        System.out.println("payment made: " + mealBought);
        mealBought = theCafe.payEconomical(cardOfLaura);
        System.out.println("payment made: " + mealBought);
        System.out.println("Balance on card: " + cardOfLaura.balance());
        System.out.println("Today's sales: " + theCafe);
        theCafe.loadMoneyToCard(cardOfLaura, 100);
        System.out.println("Balance on card: " + cardOfLaura.balance());
        System.out.println("Today's sales: " + theCafe);

        System.out.println("**********");

        Counter myCounter = new Counter();
        System.out.println("My count is now: " + myCounter.value());
        myCounter.increase();
        System.out.println("My count is now: " + myCounter.value());
        myCounter.decrease();
        System.out.println("My count is now: " + myCounter.value());
        myCounter.decrease();
        System.out.println("My count is now: " + myCounter.value());
        myCounter.decrease();
        System.out.println("My count is now: " + myCounter.value());
        myCounter.decrease();
        System.out.println("My count is now: " + myCounter.value());
        myCounter.increase(25);
        System.out.println("My count is now: " + myCounter.value());

        Counter haveNegatives = new Counter(true);
        haveNegatives.increase();
        System.out.println("I hate negative digits: " + haveNegatives.value());
        haveNegatives.decrease();
        System.out.println("I hate negative digits: " + haveNegatives.value());
        haveNegatives.decrease();
        System.out.println("I hate negative digits: " + haveNegatives.value());
        haveNegatives.decrease();
        System.out.println("I hate negative digits: " + haveNegatives.value());
        haveNegatives.decrease(-5);
        System.out.println("I hate negative digits: " + haveNegatives.value());
        haveNegatives.increase(25);
        System.out.println("I hate negative digits: " + haveNegatives.value());
        haveNegatives.decrease(24);
        System.out.println("I hate negative digits: " + haveNegatives.value());
        haveNegatives.decrease(5);
        System.out.println("I hate negative digits: " + haveNegatives.value());

        System.out.println("**********");

        Person matti = new Person("Matti");
        Person john = new Person("John");
        Person lula = new Person("Lula", 24);
        Person esko = new Person("Esko");
        Person joey = new Person("Joey");
        Person amy = new Person("Amy");

        lula.setWeight(75);
        lula.setHeight(157);

        esko.setAge(43);
        esko.setWeight(100);
        esko.setHeight(180);

        joey.setWeight(86);
        joey.setHeight(180);

        amy.setWeight(64);
        amy.setHeight(172);

        if (lula.olderThan(esko)) {
            System.out.println(lula.getName() + " is older than " + esko.getName());
        } else {
            System.out.println(esko.getName() + " is older than " + lula.getName());
        }

        WeightWatchersAssociation kumpalasWeight = new WeightWatchersAssociation(25);

        if (kumpalasWeight.isAcceptedAsMember(joey)) {
            System.out.println(joey.getName() + " is accepted as a member.");
        } else {
            System.out.println(joey.getName() + " is not accepted as a member.");
        }

        if (kumpalasWeight.isAcceptedAsMember(amy)) {
            System.out.println(amy.getName() + " is accepted as a member.");
        } else {
            System.out.println(amy.getName() + " is not accepted as a member.");
        }


        System.out.println(lula);
        System.out.println(esko);

        matti.setHeight(180);
        matti.setWeight(86);

        john.setHeight(175);
        john.setWeight(64);

        matti.setAge(21);

        System.out.println(matti.getName() + ", body mass index: " + String.format("%.2f", matti.bodyMassIndex()) );
        System.out.println(john.getName() + ", body mass index: " + String.format("%.2f", john.bodyMassIndex()) );

        System.out.println(matti);
        esko.becomeOlder(10);
        System.out.println("Esko is " + esko.getAge() + " years old.");

        Reformatory eastHelsinki = new Reformatory();

        Person wanda = new Person("Wanda", 35);
        wanda.setWeight(65);
        System.out.println(wanda.getName() + " weight: " + eastHelsinki.weight(wanda) + " kgs.");

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

        LyyraCard laura = new LyyraCard(10);
        System.out.println("money on card: " + laura.balance());
        boolean succeeded = laura.pay(8);
        System.out.println("money taken: " + succeeded);
        System.out.println("money on card: " + laura.balance());

        succeeded = laura.pay(4);
        System.out.println("money taken: " + succeeded);
        System.out.println("money on card: " + laura.balance());

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
