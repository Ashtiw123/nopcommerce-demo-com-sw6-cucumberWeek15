package com.demo.nopcommerce.sw6.cucumber.pages;

import com.demo.nopcommerce.sw6.cucumber.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NokiaLumaPage extends Utilities {

    private static final Logger log = LogManager.getLogger(NokiaLumaPage.class.getName());
    public String iShouldBeAbleSeeMessage;

    public NokiaLumaPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Nokia Lumia 1020')]")
    WebElement nokiaLumaText;

    public String verifyNokiaLuma1020Text() {
        log.info("verifyNokiaLuma1020Text " + nokiaLumaText.toString());
        return getTextFromElement(nokiaLumaText);
    }

    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-20']")
    WebElement nokiaLumaPriceText;

    public String verifyNokiaLuma1020PriceText() {
        log.info("verifyNokiaLuma1020PriceText " + nokiaLumaPriceText.toString());
        return getTextFromElement(nokiaLumaPriceText);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_enteredQuantity_20']")
    WebElement quantityOption;

    public void quantitySpaceOption() {
        log.info("quantitySpaceOption " + quantityOption.toString());
        clickOnElement(quantityOption);
        sendTextToElement(quantityOption, Keys.CONTROL + "a"); // Select all existing text
        sendTextToElement(quantityOption, "2"); // Type in the new text
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
    WebElement addToCartOption;

    public void clickOnAddToCartOption() {
        log.info("clickOnAddToCartOption " + addToCartOption.toString());
        clickOnElement(addToCartOption);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='bar-notification']/div/p")
    WebElement productAddedToShoppingCartText;

    public String verifyTheProductHasBeenAddedToYourShoppingCartText() {
        log.info("verifyTheProductHasBeenAddedToYourShoppingCartText " + productAddedToShoppingCartText.toString());
        return getTextFromElement(productAddedToShoppingCartText);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement clickOnGreenBarXButtonOption;

    public void clickOnXOnGreenBarOption() {
        log.info("clickOnXOnGreenBarOption " + clickOnGreenBarXButtonOption.toString());
        clickOnElement(clickOnGreenBarXButtonOption);
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement shoppingCartButtonOption;

    public void mouseHoverOverShoppingCartOption() {
        log.info("mouseHoverOverShoppingCartOption " + shoppingCartButtonOption.toString());
        mouseHoverToElementAndClick(shoppingCartButtonOption);
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement goToCartOption;

    public void clickOnGoToCartOption() {
        log.info("clickOnGoToCartOption " + goToCartOption.toString());
        clickOnElement(goToCartOption);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement shoppingTrolley;
    public void verifyShoppingCartText(){
        log.info("Shopping Cart Text " + goToCartOption.toString());


    }
}