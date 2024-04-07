package com.vs.operations;

public class Addition {
    public int addNumbers(String number1, String number2) {
        try {
            return Integer.parseInt(number1)+Integer.parseInt(number2);
        }catch (NumberFormatException nfe) {
            System.out.println("ERROR: INVALID INPUT-ONLY NUMBER ACCEPTED");
        }
        return 0;
    }
}
