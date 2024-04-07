Feature: Calculator Addition

  Scenario: Add two numbers
    Given I have entered first number "60" into the calculator
    And I have entered second number "20" into the calculator
    When I want to calculate "add"
    Then the result should be 80

  Scenario: Subtract two numbers
    Given I have entered first number "60" into the calculator
    And I have entered second number "20" into the calculator
    When I want to calculate "subtract"
    Then the result should be 40

  Scenario: Subtract two numbers
    Given I have entered first number "60s" into the calculator
    And I have entered second number "20s" into the calculator
    When I want to calculate "subtract"
    Then the result should be 0
