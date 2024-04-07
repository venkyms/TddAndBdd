package com.vs.tdd;

import com.vs.operations.Addition;
import com.vs.operations.Subtraction;

public class Calculator {
    Addition addition;
    Subtraction subtraction;
    public Calculator() {
        this.addition = new Addition();
        this.subtraction = new Subtraction();
    }

    public int calculate(String operation, String number1, String number2) {
        return switch (operation) {
            case "add" -> addition.addNumbers(number1, number2);
            case "subtract" -> subtraction.subtractNumbers(number1, number2);
            default -> 0;
        };
    }
}
