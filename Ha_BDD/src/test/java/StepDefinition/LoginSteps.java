package StepDefinition;


import io.cucumber.java8.En;


public class LoginSteps implements En {
    public LoginSteps() {
        Given("User wants to perform Trading", () -> {
            System.out.println("User wants to perform Trading");
        });
        Given("user is on {word} page", (String login) -> {
            System.out.println("user is on " + login);
        });

        And("clicks on Login button", () -> {
                    System.out.println("Click Login button");
                }
        );
        Then("user is navigated to Trading page", () -> {
            System.out.println("User is on Trading page ");
        });
        When("user enters valid {} and {}", (String username, String password) -> {
            System.out.println("username and password");
        });
    }


}


