package com.vs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SimpleCalculatorTest {

    @Test
    public void testAdditionWithIntegers() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int sum = simpleCalculator.addNumber("1", "2");
        assertEquals(3, sum, "1 + 2 should equal 3");
    }

    @Test
    public void testAdditionWithStrings() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int sum = simpleCalculator.addNumber("3", "4");
        assertEquals(7, sum, "3 + 4 should equal 7");
    }

    @Test
    public void testAdditionWithStringsActual() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int sum = simpleCalculator.addNumber("3s", "4s");
        assertEquals(0, sum, "INVALID INPUT");
    }
}
