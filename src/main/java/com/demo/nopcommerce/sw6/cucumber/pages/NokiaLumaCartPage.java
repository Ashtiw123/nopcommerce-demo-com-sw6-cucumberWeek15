package com.demo.nopcommerce.sw6.cucumber.pages;

import com.demo.nopcommerce.sw6.cucumber.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NokiaLumaCartPage extends Utilities {
    private static final Logger log = LogManager.getLogger(NokiaLumaCartPage.class.getName());

    public NokiaLumaCartPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement nokiaLumaCartText;

    public String verifyNokiaLumaShoppingCartText() {
       log.info("verifyNokiaLumaShoppingCartText " + nokiaLumaCartText.toString());
        return getTextFromElement(nokiaLumaCartText);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement nokiaLumaCartQuantityText;

    public String verifyQuantityText() {
        log.info("verifyQuantityText " + nokiaLumaCartQuantityText.toString());
        return getTextFromElement(nokiaLumaCartQuantityText);
    }

    @CacheLookup
    @FindBy(xpath = "//span//strong[contains(text(),'$698.00')]")
    WebElement nokiaLumaCartUpdatedPriceText;

    public String verifyTotalPriceText() {
        log.info("verifyTotalPriceText " + nokiaLumaCartUpdatedPriceText.toString());
        return getTextFromElement(nokiaLumaCartUpdatedPriceText);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement clickOnBoxIAgreeTerms;

    public void clickOnBoxIAgreeToTermsOfServiceOption() {
        log.info("clickOnBoxIAgreeToTermsOfServiceOption " + clickOnBoxIAgreeTerms.toString());
        clickOnElement(clickOnBoxIAgreeTerms);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement clickOnCheckOut;

    public void clickOnCheckOutOption() {
        log.info("clickOnCheckOutOption " + clickOnCheckOut.toString());
        clickOnElement(clickOnCheckOut);
    }


}
