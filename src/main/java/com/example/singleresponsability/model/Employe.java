package com.example.singleresponsability.model;

public class Employe {

    public int getAge() {
        return 35;
    }

    public int getSalary() {
        return 20000;
    }

    @Override public String toString() {
        return "Age=" + getAge() + ", Salary=" + getSalary();
    }

    public void print() {
        System.out.println(toString());
    }
}
