package com.demo.nopcommerce.sw6.cucumber.pages;


import com.demo.nopcommerce.sw6.cucumber.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CheckOutBillingPage extends Utilities {


    private static final Logger log = LogManager.getLogger(CheckOutBillingPage.class.getName());

    public CheckOutBillingPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Checkout')]")
    WebElement check;

    public void checkOutLabel() {
        log.info("CheckOut" + check.toString());
        verifyThatElementIsDisplayed(check);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_FirstName']")
    WebElement firstNameOption;
    public void firstNameOption(String firstName) {
        log.info("First Name Option " + firstNameOption.toString());
        sendTextToElement(firstNameOption, firstName);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_LastName']")
    WebElement lastNameOption;

    public void lastNameOption(String lastName) {
        log.info("Last Name Option " + lastNameOption.toString());
        sendTextToElement(lastNameOption, lastName);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Email']")
    WebElement emailField;

    public void enterEmailId(String email) {
        log.info("Enter Email Id " + emailField.toString());
        sendTextToElement(emailField, email);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement dropDownOption;

    public void selectUKFromDropdownOption(String country) {
        log.info("Select UK From Drop Down Option" + dropDownOption.toString());
        selectByVisibleTextFromDropDown(dropDownOption, country);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement cityField;

    public void enterCity(String city) {
        log.info("Enter City" + cityField.toString());
        sendTextToElement(cityField, city);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
    WebElement addressField;

    public void enterAddressLine1(String address) {
        log.info("Enter Address Line1" + addressField.toString());
        sendTextToElement(addressField, address);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement zipcodeField;

    public void enterZipcode(String zipcode) {
        log.info("Enter ZipCode" + zipcodeField.toString());
        sendTextToElement(zipcodeField, zipcode);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement phoneNumberField;

    public void enterPhoneNumber(String phoneNumber) {
        log.info("Enter Phone Number" + phoneNumberField.toString());
        sendTextToElement(phoneNumberField, phoneNumber);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]")
    WebElement continueButton;

    public void clickOnContinueButton() {
        log.info("Click On Continue Button" + continueButton.toString());
        clickOnElement(continueButton);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_1']")
    WebElement shippingOption;

    public void clickOnTheShoppingOption() {
        log.info("Click On The Shopping Option" + shippingOption.toString());
        clickOnElement(shippingOption);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]")
    WebElement continueButton2;

    public void clickOnSecondContinueButton() {
        log.info("Click On Second Continue Button" + continueButton2.toString());
        clickOnElement(continueButton2);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement paymentOption;

    public void clickOnThePaymentOption() {
        log.info("Click On Second Continue Button" + continueButton2.toString());
        clickOnElement(paymentOption);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]")
    WebElement continueButton3;

    public void clickOnThirdContinueButton() {
        log.info("Click On Third Continue Button" + continueButton3.toString());
        clickOnElement(continueButton3);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement cardOption;
    public void selectCardPaymentOption(){
        log.info("Select Card Option " + cardDropdownOption.toString());
        clickOnElement(cardOption);

    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement cardDropdownOption;

    public void selectMasterCardOptionFromDropdown(String cardType) {
        log.info("Select master Card Option From Drop Down" + cardDropdownOption.toString());
        selectByVisibleTextFromDropDown(cardDropdownOption, cardType);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardholderName']")
    WebElement nameField;

    public void enterCardHolderName(String name) {
        log.info("Enter Card holder Name" + nameField.toString());
        sendTextToElement(nameField, name);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNumberField;

    public void enterCardNumber(String cardNumber) {
        log.info("Enter Card Number" + cardNumberField.toString());
        sendTextToElement(cardNumberField, cardNumber);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement monthExpiryField;

    public void enterExpiryMonth(String month) {
        log.info("Enter Expiry Month" + monthExpiryField.toString());
        sendTextToElement(monthExpiryField, month);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement yearExpiryField;

    public void enterExpiryYear(String year) {
        log.info("Enter Expiry Year" + yearExpiryField.toString());
        sendTextToElement(yearExpiryField, year);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement securityCodeField;

    public void enterSecurityCode(String code) {
        log.info("Enter Security Code" + securityCodeField.toString());
        sendTextToElement(securityCodeField, code);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]")
    WebElement continueButton4;

    public void clickOnFourthContinueButton() {
        log.info("Click on Fourth Continue Button" + continueButton4.toString());
        clickOnElement(continueButton4);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Credit Card')]")
    WebElement paymentMethodText;

    public String getPaymentMethodText() {
        log.info("Get Payment Method Text" + paymentMethodText.toString());
        return getTextFromElement(paymentMethodText);
    }

    @CacheLookup
    @FindBy(xpath = "//li[contains(@class, 'shipping-method')]/span[contains (text(), 'Next Day Air')]")
    WebElement shippingMethodText;

    public String getShippingMethodText() {
        log.info("Get Shipping Method Text" + shippingMethodText.toString());
        return getTextFromElement(shippingMethodText);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(@class, 'value-summary')]/strong[contains (text(), '$2,950.00')]")
    WebElement totalPriceText;

    public String getTotalPriceText() {
        log.info("Get Total Price Text" + totalPriceText.toString());
        return getTextFromElement(totalPriceText);
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement confirmButton;

    public void clickOnConfirmButton() {
        log.info("Click On Confirm Button" + confirmButton.toString());
        clickOnElement(confirmButton);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement thankYouText;

    public String getThankYouText() {
        log.info("Get thank You Text" + thankYouText.toString());
        return getTextFromElement(thankYouText);
    }

    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement successfulOrderText;

    public String getSuccessfulOrderText() {
        log.info("Get Successful Order Text" + successfulOrderText.toString());
        return getTextFromElement(successfulOrderText);
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement lastContinueButton;

    public void clickOnTheLastContinueButton() {
        log.info("Click On the Last Continue Button" + lastContinueButton.toString());
        clickOnElement(lastContinueButton);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welcomeText;

    public String getWelcomeText() {
        log.info("Get Welcome Text" + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }
}