package com.vs.tdd.steps;

import com.vs.tdd.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorSteps {
    private Calculator calculator;
    private String firstNumber;
    private String secondNumber;
    private int result;

    @Given("I have entered first number {string} into the calculator")
    public void iHaveEnteredFirstNumberIntoTheCalculator(String number) {
        calculator = new Calculator();
        firstNumber = number;
    }

    @Given("I have entered second number {string} into the calculator")
    public void iHaveEnteredSecondNumberIntoTheCalculator(String number) {
        secondNumber = number;
    }

    @When("I want to calculate {string}")
    public void iPressCalculate(String operation) {
        result = calculator.calculate(operation, firstNumber, secondNumber);
    }

    @Then("the result should be {int}")
    public void theResultShouldBe(int expectedResult) {
        assertEquals(expectedResult, result);
    }
}
