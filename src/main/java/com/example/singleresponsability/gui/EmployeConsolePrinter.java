package com.example.singleresponsability.gui;

import com.example.singleresponsability.model.Employe;

public class EmployeConsolePrinter implements EmployePrinter {

    public void print(Employe employe){
        System.out.println("Age=" + employe.getAge() + ", Salary=" + employe.getSalary());
    }
}
