package com.demo.nopcommerce.sw6.cucumber.pages;

import com.demo.nopcommerce.sw6.cucumber.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NokiaLumaBillingPage extends Utilities {
    private static final Logger log = LogManager.getLogger(NokiaLumaBillingPage.class.getName());

    public NokiaLumaBillingPage() {
        PageFactory.initElements(driver, this);
    }




    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstNameOption;

    public void firstNameOption(String firstName) {
        log.info("firstNameOption " + firstNameOption.toString());
        sendTextToElement(firstNameOption, firstName);
    }

    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastNameOption;

    public void lastNameOption(String lastName) {
        log.info("lastNameOption " + lastNameOption.toString());
        sendTextToElement(lastNameOption, lastName);
    }

    @CacheLookup
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement countryByDropDownOption;

    public void selectUKFromDropdownOption(String country) {
        log.info("selectUKFromDropdownOption " + countryByDropDownOption.toString());
        selectByVisibleTextFromDropDown(countryByDropDownOption, country);
    }

    @CacheLookup
    @FindBy(id = "BillingNewAddress_StateProvinceId")
    WebElement provinceOption;

    public void inputProvince(String Province) {
        log.info("inputProvince " + provinceOption.toString());
        sendTextToElement(provinceOption, Province);
    }

    @CacheLookup
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement provinceFromDropDownOption;

    public void selectOtherProvinceFromDropdownOption(String province) {
        log.info("selectOtherProvinceFromDropdownOption " + provinceFromDropDownOption.toString());
        selectByVisibleTextFromDropDown(provinceFromDropDownOption, province);
    }

    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement cityOption;

    public void enterCity(String city) {
        log.info("enterCity " + cityOption.toString());
        sendTextToElement(cityOption, city);
    }

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement addressFirstLineOption;

    public void enterFirstLineOfAddressCity(String address) {
        log.info("enterFirstLineOfAddressCity " + addressFirstLineOption.toString());
        sendTextToElement(addressFirstLineOption, address);
    }

    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement zipPostalCodeeOption;

    public void enterZipPostalCode(String zipcode) {
        log.info("enterZipPostalCode " + zipPostalCodeeOption.toString());
        sendTextToElement(zipPostalCodeeOption, zipcode);
    }

    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumber;

    public void enterPhoneNumber(String phoneNumber) {
        log.info("enterPhoneNumber " + zipPostalCodeeOption.toString());
        sendTextToElement(zipPostalCodeeOption, phoneNumber);
    }

    @CacheLookup
    @FindBy(xpath = "//button[text() = 'Continue']")
    WebElement continueTab;

    public void clickOnContinueTab() {
        log.info("clickOnContinueTab " + continueTab.toString());
        clickOnElement(continueTab);
    }

    @CacheLookup
    @FindBy(id = "shippingoption_2")
    WebElement secondDayAirRadioButtonTab;

    public void clickOnRadioButtonSecondDayAir() {
        log.info("clickOnRadioButtonSecondDayAir " + secondDayAirRadioButtonTab.toString());
        clickOnElement(secondDayAirRadioButtonTab);
    }

    @CacheLookup
    @FindBy(xpath = "///div[@id='shipping-method-buttons-container']/button")
    WebElement continueButtonTab;

    public void clickOnContinueButtonTab() {
        log.info("clickOnContinueButtonTab " + continueButtonTab.toString());
        clickOnElement(continueButtonTab);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement creditCardRadioButton;

    public void clickOnCreditCardRadioButton() {
        log.info("clickOnCreditCardRadioButton " + creditCardRadioButton.toString());
        clickOnElement(creditCardRadioButton);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='checkout-step-payment-method']/div/button")
    WebElement paymentMethodRadioButton;

    public void clickOnCheckOutStepPaymentMethodRadioButton() {
        log.info("clickOnCheckOutStepPaymentMethodRadioButton " + paymentMethodRadioButton.toString());
        clickOnElement(paymentMethodRadioButton);
    }

    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement selectPaymentCardOptionMasterOrVisa;

    public void selectMasterOrVisaCardForPayment(String card) {
        log.info("selectMasterOrVisaCardForPayment " + selectPaymentCardOptionMasterOrVisa.toString());
        selectByVisibleTextFromDropDown(selectPaymentCardOptionMasterOrVisa, card);
    }

    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderName;

    public void cardHolderNameAsOnCard(String name) {
        log.info("cardHolderNameAsOnCard " + cardHolderName.toString());
        sendTextToElement(cardHolderName, name);
    }

    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber;

    public void cardNumberAsOnCard(String number) {
        log.info("cardNumberAsOnCard " + cardNumber.toString());
        sendTextToElement(cardNumber, number);
    }

    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement monthOption;

    public void enterMonthOption(String month) {
        log.info("enterMonthOption " + monthOption.toString());
        selectByVisibleTextFromDropDown(monthOption, month);
    }

    @CacheLookup
    @FindBy(id = "ExpireYear")
    WebElement yearOption;

    public void enterYearOption(String year) {
        log.info("enterYearOption " + yearOption.toString());
        selectByVisibleTextFromDropDown(yearOption, year);
    }

    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cardCodeOption;

    public void enterCardCodeFromBackOfTheCard(String code) {
        log.info("enterCardCodeFromBackOfTheCard " + cardCodeOption.toString());
        selectByVisibleTextFromDropDown(cardCodeOption, code);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='payment-info-buttons-container']/button")
    WebElement continueCheckOutTab;

    public void clickOnContinueCheckOutTab() {
        log.info("clickOnContinueCheckOutTab " + continueCheckOutTab.toString());
        clickOnElement(continueCheckOutTab);
    }

    @CacheLookup
    @FindBy(xpath = "//li[@class='payment-method']/span[2]")
    WebElement paymentMethodCreditCardOption;

    public String verifyPaymentMethodByCreditCardText() {
        log.info("verifyPaymentMethodByCreditCardText " + paymentMethodCreditCardOption.toString());
        return getTextFromElement(paymentMethodCreditCardOption);
    }

    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']/span[2]")
    WebElement shippingSecondDayAirMethodText;

    public String getShippingSecondDayAirMethodText() {
        log.info("getShippingSecondDayAirMethodText " + shippingSecondDayAirMethodText.toString());
        return getTextFromElement(shippingSecondDayAirMethodText);
    }

    @CacheLookup
    @FindBy(xpath = "//td[@class='subtotal']/span")
    WebElement totalPriceText;

    public String getTotalPriceText() {
        log.info("getTotalPriceText " + totalPriceText.toString());
        return getTextFromElement(totalPriceText);
    }

    @CacheLookup
    @FindBy(xpath = "//button[text()='Confirm']")
    WebElement confirmButton;

    public void clickOnConfirmButton() {
        log.info("clickOnConfirmButton " + confirmButton.toString());
        clickOnElement(confirmButton);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement thankYouText;

    public String getThankYouText() {
        log.info("getThankYouText " + thankYouText.toString());
        return getTextFromElement(thankYouText);
    }

    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement successfulOrderText;

    public String getSuccessfulOrderText() {
        log.info("getSuccessfulOrderText " + successfulOrderText.toString());
        return getTextFromElement(successfulOrderText);
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement lastContinueButton;

    public void clickOnTheLastContinueButton() {
        log.info("clickOnTheLastContinueButton " + lastContinueButton.toString());
        clickOnElement(lastContinueButton);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welcomeText;

    public String getWelcomeText() {
        log.info("getWelcomeText " + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOutButton;

    public void clickOnLogoutTabButton() {
        log.info("clickOnLogoutTabButton " + logOutButton.toString());
        clickOnElement(logOutButton);
    }

    @CacheLookup
    @FindBy(xpath = "https://demo.nopcommerce.com/")
    WebElement confirmUrlText;

    public String getCurrentUrl() {
        log.info("getCurrentUrl ");
        return getCurrentUrl();
    }


}
