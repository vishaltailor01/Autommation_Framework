package com.amazon.pages;

import com.amazon.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Vishal Tailor
 */
public class Product extends Utility {

    // logger is class of log4j . log is object created
    private static final Logger log = LogManager.getLogger(Product.class.getName());
    @FindBy(id = "twotabsearchtextbox")
    WebElement productName;
    @FindBy(xpath = "//span[contains(text(),'\"Dell Laptop\"')]")
    WebElement resultPage;
    @FindBy(id = "nav-search-submit-button")
    WebElement searchButton;
    @FindBy(id = "//body/div[@id='a-page']/div[@id='search']/div[1]/div[2]/div[1]/div[3]/span[1]")
    WebElement ram;


    public void enterProductName(String product) {
        log.info("Enter the product :" + productName.toString());
        sendTextToElement(productName, product);

    }

    public void clickOnSearchBtn() {
        log.info("Click on Search Button :" + searchButton);
        mouseHoverToElementAndClick(searchButton);
    }

    public void userIsOnAResultPage(String result) {
        log.info("User is on a result page:" + resultPage.toString());
        String rePage = getTextFromElement(resultPage);
        Assert.assertEquals(rePage, result);
    }
    public void selectTheRam(){
        log.info("User select the Ram size :"+ ram);
        mouseHoverToElementAndClick(ram);
    }
}
