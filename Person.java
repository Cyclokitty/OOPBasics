package com.cyclokitty;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String initialName) {
        this(initialName, 0);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 0;
        this.height = 0;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double bodyMassIndex() {
        double heightDivideByHundred = this.height / 100.0;
        return this.weight / (heightDivideByHundred * heightDivideByHundred);
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years.");
    }

    public void becomeOlder() {
        this.age++;
    }

    public void becomeOlder(int years) {
        this.age = this.age + years;
    }

    public boolean isAdult() {
        return this.age >= 18;
    }

    public String toString() {
        return this.name + ": \n" +  "\t age: " + this.age + "\n"
                        + "\t body mass index: " + String.format("%.2f", this.bodyMassIndex());
    }
}
