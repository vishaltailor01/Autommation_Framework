package com.amazon.pages;

import com.amazon.utility.Utility;
import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Vishal Tailor
 */
public class Laptop extends Utility {

    // logger is class of log4j . log is object created
    private static final Logger log = LogManager.getLogger(Laptop.class.getName());

    @FindBy(id = "twotabsearchtextbox")
    WebElement productName;
    By product = By.id("twotabsearchtextbox");
    @FindBy(xpath = "//span[contains(text(),'\"Dell Laptop\"')]")
    WebElement resultPage;
    @FindBy(id = "nav-search-submit-button")
    WebElement searchButton;


    @FindBy(xpath = "//*[@id=\"p_n_feature_twenty-three_browse-bin/7817222011\"]/span/a/span")
    WebElement ram2;
    @FindBy(xpath = "//div[@id='brandsRefinements']/ul/li[1]/span/a/div/label")
    WebElement brand;

    @FindBy(xpath = "//div[@class='glow-toaster-footer']/span[1]/span")
    WebElement location;

    @FindBy(xpath = "//header/div[@id='navbar']" +
            "/div[@id='nav-flyout-anchor']/div[13]/div[2]/div[4]/span[1]/span[1]/input[1]")
    WebElement language;

  //  @FindBy(xpath = "//div[@class='a-section a-spacing-none']/div/h2/a/span[contains(text(),'2020 Newest Dell Inspiron 15 3000 PC Laptop: 15.6')]")
   @FindBy(xpath = "//span[contains(text(),'2020 Newest Dell Inspiron 15 3000 PC Laptop: 15.6\"')]")
    WebElement selectProduct;

    @FindBy(xpath = "//td[@class='a-span12']/span[1]")
    WebElement price;
//    @FindBy(xpath = "//div[@class='a-section a-spacing-none a-padding-base']/div/ul/li[3]")
//    WebElement nextBTN;
    @FindBy(xpath = "//div[@class='a-text-center']/ul/li[3]/a")
    WebElement nextBTN;
    @FindBy(xpath = "//span[@id='price_inside_buybox']")
    WebElement verifyPrice;
    @FindBy(xpath = "//span[@id='productTitle']")
    WebElement productPage;
    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    WebElement addCartBTN;
    @FindBy(xpath = "//span[@id='attach-sidesheet-view-cart-button']/span/input")
    WebElement cart;
    @FindBy(id = "sc-subtotal-amount-buybox")
    WebElement subtoatal;



    public void enterProductName(String product) {

        log.info("Enter the product :" + productName.toString());
        Reporter.addStepLog("user click on location " + location.toString() + "<br>");
        Reporter.addStepLog("user click on search button" + language.toString() + "<br>");
        Reporter.addStepLog("user search product name " + productName.toString() + "<br>");
        ifElementIsDisplayed(language);
        ifElementIsDisplayed(location);
       // ifElementIsDisplayed(language);
       // ifElementIsDisplayed(location);
        sendTextToElement(productName, product);


    }

    public void clickOnSearchBtn() {
        log.info("Click on Search Button :" + searchButton.toString());
        Reporter.addStepLog("user click on search button" + searchButton.toString() + "<br>");
        mouseHoverToElementAndClick(searchButton);
    }

    public void userIsOnAResultPage(String result) {
        log.info("User is on a result page:" + resultPage.toString());
        Reporter.addStepLog("user is on a result page" + resultPage.toString() + "<br>");

        verifyThatTextIsDisplayed(resultPage, result);
    }

    public void selectTheRam() throws InterruptedException {
        log.info("User select the brand :" + brand.toString());
        log.info("User select the ram :" + ram2.toString());
        Reporter.addStepLog("user select the brand" + brand.toString() + "<br>");
        Reporter.addStepLog("User select the ram size " + ram2.toString() + "<br>");
       // Thread.sleep();
        waitUntilVisibilityOfElementLocated(brand, 50);
        mouseHoverToElement(brand);
        waitUntilVisibilityOfElementLocated(ram2, 50);
        mouseHoverToElement(ram2);
       // Thread.sleep(5000);
        mouseHoverToElementAndClick(ram2);

    }

    public void setSelectProduct() throws InterruptedException {
        log.info("User select the product :" + selectProduct.toString());
        Reporter.addStepLog("user click on select the product : " + selectProduct.toString() + "<br>");
        waitUntilVisibilityOfElementLocated(selectProduct, 50);
        mouseHoverToElementAndClick(selectProduct);

    }

    public void setNextBTN() throws InterruptedException {
        log.info("user click on next page button : " + nextBTN.toString());
        Reporter.addStepLog("user click on next page  button" + nextBTN.toString() + "<br>");
     //   Thread.sleep(5000);
        waitUntilVisibilityOfElementLocated(nextBTN, 50);
        mouseHoverToElementAndClick(nextBTN);
    }

    public void setVerifyPrice() {
        log.info("user verify the price :" + verifyPrice.toString());
        Reporter.addStepLog("user verify the price : " + verifyPrice.toString());
        getTextFromElement(verifyPrice);
        verifyThatTextIsDisplayed(verifyPrice, "$373.00");


    }

    public void setProductPage() {
        log.info("User is on product Page" + productPage.toString());
        Reporter.addStepLog("User is on product Page " + productPage.toString() + "<br>");
        verifyThatElementIsDisplayed(productPage);

    }

    public void setAddCartBTN() {
        log.info("User click on add cart btn :" + addCartBTN.toString());
        Reporter.addStepLog("User click on add cart btn :" + addCartBTN.toString() + "<br>");
        mouseHoverToElementAndClick(addCartBTN);
    }

    public void setCart() throws InterruptedException {
        log.info("user clickon cart :" + cart.toString());
        Reporter.addStepLog("user clickon cart :" + cart.toString() + "<br>");
        Thread.sleep(5000);
        mouseHoverToElementAndClick(cart);


    }

    public void setSubtoatal() {
        log.info("User verify product add in a cart :" + subtoatal.toString());
        Reporter.addStepLog("User verify product add in a cart :" + subtoatal.toString() + "<br>");
        verifyThatTextIsDisplayed(subtoatal, "$456.99");
    }

}

