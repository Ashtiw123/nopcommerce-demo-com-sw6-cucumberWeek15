package com.demo.nopcommerce.sw6.cucumber.pages;

import com.demo.nopcommerce.sw6.cucumber.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NokiaLumaRegisterPage extends Utilities {
    private static final Logger log = LogManager.getLogger(NokiaLumaRegisterPage.class.getName());

    public NokiaLumaRegisterPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;

    public String verifyRegisterText() {
        log.info("Verify Register Text " + registerText.toString());
        return getTextFromElement(registerText);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement clickGenderButton;

    public void clickOnAppropriateGenderButton() {
        log.info("Click on Appropriate Gender Button " + clickGenderButton.toString());
        clickOnElement(clickGenderButton);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstNameOption;

    public void firstNameOption(String firstName) {
        log.info("First Name Option " + firstNameOption.toString());
        sendTextToElement(firstNameOption, firstName);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastNameOption;

    public void lastNameOption(String lastName) {
        log.info("Last Name option " + lastNameOption.toString());
        sendTextToElement(lastNameOption, lastName);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dateOption;

    public void dateOfBirth(String date) {
        log.info("Date Of Birth " + dateOption.toString());
        selectByVisibleTextFromDropDown(dateOption, date);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement monthOption;

    public void dateOfBirthMonth(String month) {
        log.info("Date Of Birth Month " + monthOption.toString());
        selectByVisibleTextFromDropDown(monthOption, month);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement yearOption;

    public void dateOfBirthYear(String year) {
        log.info("Date Of Birth Year " + yearOption.toString());
        selectByVisibleTextFromDropDown(yearOption, year);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement emailOption;

    public void enterEmailOption(String email) {
        log.info("Enter Email Option " + emailOption.toString());
        sendTextToElement(emailOption, email);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement passwordOption;

    public void enterPasswordOption(String password) {
        log.info("Enter Password Option " + passwordOption.toString());
        sendTextToElement(passwordOption, password);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement confirmPasswordOption;

    public void confirmPasswordOption(String password) {
        log.info("Confirm Password Option " + confirmPasswordOption.toString());
        sendTextToElement(confirmPasswordOption, password);
    }

    @CacheLookup
    @FindBy(id = "register-button")
    WebElement clickRegisterButton;

    public void clickOnRegisterTabButton() {
        log.info("Click On register Tab Button " + clickRegisterButton.toString());
        clickOnElement(clickRegisterButton);
    }

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationCompletedText;

    public String verifyYourRegistrationCompletedText() {
        log.info("Verify Your Registration Completed Text  " + registrationCompletedText.toString());
        return getTextFromElement(registrationCompletedText);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement clickOnContinueButton;

    public void clickOnContinueButton() {
        log.info("Click On Continue Button " + clickOnContinueButton.toString());
        clickOnElement(clickOnContinueButton);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement shoppingCartText;

    public String verifyShoppingCartText() {
        log.info("Verify Shopping Cart Text " + shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }

    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement clickOnTermsAndServiceBox;

    public void clickOnTermsAndServiceBox() {
        log.info("Terms Of Service " + clickOnTermsAndServiceBox.toString());
        clickOnElement(clickOnTermsAndServiceBox);
    }

    @CacheLookup
    @FindBy(id = "checkout")
    WebElement clickOnCheckOutTab;

    public void clickOnCheckOutTab() {
        log.info("Click On Check Out Tab " + clickOnCheckOutTab.toString());
        clickOnElement(clickOnCheckOutTab);
    }


}
