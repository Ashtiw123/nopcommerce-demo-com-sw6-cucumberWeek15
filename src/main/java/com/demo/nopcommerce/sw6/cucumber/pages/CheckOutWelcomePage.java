package com.demo.nopcommerce.sw6.cucumber.pages;

import com.demo.nopcommerce.sw6.cucumber.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutWelcomePage extends Utilities {
    private static final Logger log = LogManager.getLogger(CheckOutWelcomePage.class.getName());

    public CheckOutWelcomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeTitle;

    public String getTextFromWelcomeSignInTitle() {
        log.info("getTextFromWelcomeSignInTitle " + welcomeTitle.toString());
        return getTextFromElement(welcomeTitle);
    }
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Checkout as Guest')]")
    WebElement checkOutAsGuestButton;

    public void clickCheckoutAsGuestButton() {
     log.info("clickCheckoutAsGuestButton " + checkOutAsGuestButton.toString());
        clickOnElement(checkOutAsGuestButton);
    }





}
