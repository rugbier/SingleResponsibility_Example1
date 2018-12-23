package com.example.singleresponsability.gui;

import com.example.singleresponsability.model.Employe;

public class EmployeConsolePrinter {

    public void print(Employe employe){
        System.out.println("Age=" + employe.getAge() + ", Salary=" + employe.getSalary());
    }
}
