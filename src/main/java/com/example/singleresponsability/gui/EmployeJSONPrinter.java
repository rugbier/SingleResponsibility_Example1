package com.example.singleresponsability.gui;

import com.example.singleresponsability.model.Employe;

public class EmployeJSONPrinter implements EmployePrinter {
    public void print(Employe employe){
        System.out.println("{\"age\": " + employe.getAge() + ", \"salary\": " + employe.getSalary() + "}");
    }
}
