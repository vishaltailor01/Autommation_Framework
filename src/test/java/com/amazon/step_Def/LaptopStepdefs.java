package com.amazon.step_Def;

import com.amazon.pages.Laptop;
import com.amazon.pages.Monitor;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Vishal Tailor
 */
public class LaptopStepdefs {

    @Given("^User enter desire \"([^\"]*)\" name name in a search field$")
    public void userEnterDesireNameNameInASearchField(String Product) {
        new Laptop().enterProductName(Product);


    }

    @When("^User click on a SearchButton$")
    public void userClickOnASearchButton() {
        new Laptop().clickOnSearchBtn();

    }

    @Then("^User is on a Result Page verify the text \"([^\"]*)\"$")
    public void userIsOnAResultPageVerifyTheText(String result) {
        new Laptop().userIsOnAResultPage(result);

    }

    @When("^User select RamSize$")
    public void userSelectRamSize() throws InterruptedException {
        new Laptop().selectTheRam();
    }


    @When("^user select the product$")
    public void userSelectTheProduct() throws InterruptedException {
        new Laptop().setSelectProduct();
    }

    @When("^User click on next page$")
    public void userClickOnNextPage() throws InterruptedException {
        new Laptop().setNextBTN();

    }

    @And("^User is on product Page$")
    public void userIsOnProductPage() {
        new Laptop().setProductPage();


    }

    @And("^User verify the price$")
    public void userVerifyThePrice() {
        new Laptop().setVerifyPrice();
    }

    @When("^User click on add to cart$")
    public void userClickOnAddToCart() {
        new Laptop().setAddCartBTN();
    }

    @Then("^User click on cart$")
    public void userClickOnCart() throws InterruptedException {
        new Laptop().setCart();
    }

    @And("^verify product is add on a cart$")
    public void verifyProductIsAddOnACart() {
        new Laptop().setSubtoatal();
    }


    @And("^User add product in basket$")
    public void userAddProductInBasket() {
        new Monitor().addInBasket();

    }

    @When("^User enter \"([^\"]*)\" in a search field$")
    public void userEnterInASearchField(String monitor)  {
        new Monitor().enterProductName(monitor);

    }
}








