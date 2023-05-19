package com.demo.nopcommerce.sw6.cucumber.pages;

import com.demo.nopcommerce.sw6.cucumber.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utilities {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    public String getWelcomeText() {
       log.info("getWelcomeText " + welcomeText.toString());
        return getTextFromElement(welcomeText);

    }
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;
    public void enterEmailId(String email) {
       log.info("enterEmailId " + emailField.toString());
        sendTextToElement(emailField, email);
    }
    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;
    public void enterPassword(String password) {
       log.info("enterPassword " + passwordField.toString());
        sendTextToElement(passwordField, password);
    }
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;
    public void clickOnLoginButton() {
       log.info("clickOnLoginButton " + loginButton.toString());
        clickOnElement(loginButton);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;
    public String getErrorMessage() {
       log.info("getErrorMessage " + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }
}
