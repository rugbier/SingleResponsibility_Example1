package com.example.singleresponsability;

import com.example.singleresponsability.gui.EmployeConsolePrinter;
import com.example.singleresponsability.model.Employe;

public class SingleResponsabilityApplication {
    public static void main(String [] args) {
        Employe employe = new Employe();
        EmployeConsolePrinter printer = new EmployeConsolePrinter();
        printer.print(employe);
    }
}
