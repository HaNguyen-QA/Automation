package StepDefinition;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"/Users/hanguyen/IdeaProjects/Ha_BDD/src/test/features/performTrading.feature"},
        glue = {"StepDefinition"})




public class TestRunner {
}
