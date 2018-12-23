package com.example.singleresponsability;

import com.example.singleresponsability.gui.EmployeConsolePrinter;
import com.example.singleresponsability.gui.EmployeJSONPrinter;
import com.example.singleresponsability.model.Employe;

public class SingleResponsabilityApplication {
    public static void main(String [] args) {
        Employe employe = new Employe();
        EmployeConsolePrinter consolePrinter = new EmployeConsolePrinter();
        consolePrinter.print(employe);

        EmployeJSONPrinter jsonPrinter = new EmployeJSONPrinter();
        jsonPrinter.print(employe);
    }
}
