package com.vs.tdd;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Calculator.feature", glue = "com.vs.tdd.steps")
public class TestRunner {
}
