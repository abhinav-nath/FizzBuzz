import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = {"FizzBuzzStepDefs"},
        plugin = {"pretty", "html:build/test-report.html"})
public class FizzBuzzStepDefs {

    private FizzBuzz fizzBuzz;
    private String result;

    @Given("Create a FizzBuzz game")
    public void createAFizzBuzzGame() {
        fizzBuzz = new FizzBuzz();
    }

    @When("I play with number {int}")
    public void iPlayWithNumber(int num) {
        result = fizzBuzz.play(num);
    }

    @Then("The result is {string}")
    public void theResultIs(String expected) {
        assertEquals(result, expected);
    }

}
