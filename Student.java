package model;

public class Student {
    private int rollNo;
    private String name;
    private double gpa;

    public Student(int rollNo, String name, double gpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.gpa = gpa;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name + ", GPA: " + gpa;
    }
}