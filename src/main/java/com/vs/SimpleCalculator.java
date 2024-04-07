package com.vs;

public class SimpleCalculator {

//    int addNumber(String firstNumber, String secondNumber) {
//        return Integer.parseInt(firstNumber)+Integer.parseInt(secondNumber);
//    }

    public int addNumber(String firstNumber, String secondNumber) {
        try {
            int num1 = Integer.parseInt(firstNumber);
            int num2 = Integer.parseInt(secondNumber);
            return num1 + num2;
        } catch (NumberFormatException e) {
            System.out.println("ERROR: Invalid input: Please provide valid integer numbers.");
//            throw new NumberFormatException("Invalid input: Please provide valid integer numbers.");
        }
        return 0;
    }


//    public static void main(String[] args) {
//        SimpleCalculator simpleCalculator = new SimpleCalculator();
//        int sumOfTwoNumber = simpleCalculator.addNumber(1, 2);
//        System.out.println("Sum ="+sumOfTwoNumber);
//    }
}
