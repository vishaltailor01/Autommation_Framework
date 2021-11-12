package com.amazon.step_Def;

import com.amazon.pages.Product;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Vishal Tailor
 */
public class ProductStepdefs {
    @Given("^User enter desire \"([^\"]*)\" name name in a search field$")
    public void userEnterDesireNameNameInASearchField(String Product) {
        new Product().enterProductName(Product);

    }

    @When("^User click on a SearchButton$")
    public void userClickOnASearchButton() {
        new Product().clickOnSearchBtn();

    }




    @When("^User select RamSize$")
    public void userSelectRamSize() {
        new Product().selectTheRam();
    }


    @Then("^User is on a Result Page verify the text <\"([^\"]*)\">$")
    public void userIsOnAResultPageVerifyTheText(String result)  {
        new Product().userIsOnAResultPage(result);

    }
}

