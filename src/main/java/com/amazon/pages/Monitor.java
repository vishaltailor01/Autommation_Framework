package com.amazon.pages;

import com.amazon.utility.Utility;
import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Vishal Tailor
 */
public class Monitor extends Utility {
    // logger is class of log4j . log is object created
    private static final Logger log = LogManager.getLogger(Laptop.class.getName());
    @FindBy(id = "twotabsearchtextbox")
    WebElement productName;
    @FindBy(id = "nav-search-submit-button")
    WebElement searchButton;
    @FindBy(xpath ="//a[@class='a-link-normal a-text-normal']")
    WebElement monitor;
    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    WebElement addCartBTN;


    public void enterProductName(String enterProductName){
        log.info("user want to search the monitor"+ productName.toString());
        sendTextToElement(productName,enterProductName);
        mouseHoverToElementAndClick(searchButton);
    }
    public void addInBasket(){
        log.info("user add product in basket : ");
        Reporter.addStepLog("User add product in basket ");
        mouseHoverToElement(monitor);
        mouseHoverToElementAndClick(monitor);
        mouseHoverToElementAndClick(addCartBTN);
    }
}
