@all_activities
Feature: Perform two numbers calculation

  Background:
    Given Make a calculation for two numbers


  Scenario Outline: Math
    When user calculates <action> of <number1> and <number2>
    Then we have the result should be <expectedResult>

    Examples:
      | action    | number1 | number2 | expectedResult |
      | sum       | 4       | 2       | 7              |
      | substract | 6       | 3       | 3              |
      | multiply  | 5       | 2       | 10             |
      | divide    | 15      | 3       | 5              |







