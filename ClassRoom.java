package com.cyclokitty;

public class ClassRoom {
    String name;
    String studentNumber;

    public ClassRoom(String name, String studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String toString() {
        return this.name + " (" + this.studentNumber + ")";
    }
}
