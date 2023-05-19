package com.demo.nopcommerce.sw6.cucumber.pages;

import com.demo.nopcommerce.sw6.cucumber.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends Utilities {

        private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

        public ShoppingCartPage() {
            PageFactory.initElements(driver, this);
        }


    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCarText;

    public String getTextFromShoppingCartHeading() {
        log.info("getTextFromShoppingCartHeading " + shoppingCarText.toString());
        return getTextFromElement(shoppingCarText);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement quantityOption;

    public void quantitySpaceOption() {
       log.info("quantitySpaceOption " + quantityOption.toString());
        clickOnElement(quantityOption);
        sendTextToElement(quantityOption, Keys.CONTROL + "a"); // Select all existing text
        sendTextToElement(quantityOption, "2"); // Type in the new text
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='updatecart']")
    WebElement updateShoppingCartButton;
    public void clickOnUpdateShoppingCart() {
        log.info("clickOnUpdateShoppingCart " + updateShoppingCartButton.toString());
        clickOnElement(updateShoppingCartButton);
    }

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]" +
            "/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]")
    WebElement priceFinalOption;

    public String getTextFromFinalPrice() {
        log.info("getTextFromFinalPrice " + priceFinalOption.toString());
        return getTextFromElement(priceFinalOption);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement termsOption;
    public void clickOnTermsOfServiceOption() {
       log.info("clickOnTermsOfServiceOption " + termsOption.toString());
        clickOnElement(termsOption);
    }
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkOutOption;

    public void clickCheckOutOption() {
       log.info("clickCheckOutOption " + checkOutOption.toString());
        clickOnElement(checkOutOption);
    }

}
