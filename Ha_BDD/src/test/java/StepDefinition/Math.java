package StepDefinition;

import io.cucumber.java8.En;
import junit.framework.Assert;


public class Math implements En {
    float result;

    public Math() {

        Given("Make a calculation for two numbers", () -> {
            System.out.println("Calculation for two numbers");
        });


        When("user calculates {word} of {int} and {int}", (String action, Integer a, Integer b) -> {

            MathCalculation mathCalculation = new MathCalculation(a,b);

            switch(action) {
                case "sum":
                    result = mathCalculation.sum();
                    break;
                case "substract":
                    result=mathCalculation.subtract();
                    break;
                case "multiply":
                    result=mathCalculation.multiply();
                    break;
                case "divide":
                    result=mathCalculation.divide();
                    break;

            }
        });
        Then("we have the result should be {float}", (Float expectedResult) -> {
            Assert.assertEquals(result,expectedResult);
        });


    }
}
