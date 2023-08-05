package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.PorscheHomePage;
import utilities.Driver;

public class PorscheSteps {
    WebDriver driver = Driver.getDriver();

 //PorscheHomePage porscheHomePage = new PorscheHomePage;


    @Given("User navigates to Porsche application")
    public void user_navigates_to_porsche_application() {

    }


    @When("User stores the price for the selected model")
    public void user_stores_the_price_for_the_selected_model() {

    }
    @When("User selects the model {string}")
    public void user_selects_the_model(String string) {

    }
    @Then("User validates that the Base price is matched with the listed price")
    public void user_validates_that_the_base_price_is_matched_with_the_listed_price() {

    }



}
