package com.vs.operations;

import com.vs.tdd.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {
    @Test
    public void testAdditionWithIntegers() {
        Addition addition = new Addition();
        int sum = addition.addNumbers("1", "2");
        assertEquals(3, sum, "1 + 2 should equal 3");
    }

    @Test
    public void testAdditionWithStringsActual() {
        Addition addition = new Addition();
        int sum = addition.addNumbers("3s", "4s");
        assertEquals(0, sum, "INVALID INPUT");
    }
}