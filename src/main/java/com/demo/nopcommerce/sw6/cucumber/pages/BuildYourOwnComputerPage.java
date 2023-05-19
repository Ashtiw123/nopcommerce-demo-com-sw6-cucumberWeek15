package com.demo.nopcommerce.sw6.cucumber.pages;

import com.demo.nopcommerce.sw6.cucumber.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utilities {
    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());

    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement buildYourOwnComputerText;

    public String getTextFromBuildYourOwnComputerHeading() {
        log.info("Get Text From Build Your Own Computer Heading " + buildYourOwnComputerText.toString());
        return getTextFromElement(buildYourOwnComputerText);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorOption;

    public void selectProcessorOption(String processor) {
        log.info("Select Processor option " + processorOption.toString());
        selectByVisibleTextFromDropDown(processorOption, processor);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ramOption;

    public void selectRamOption(String Ram) {
        log.info("Select Ram option " + ramOption.toString());
        selectByVisibleTextFromDropDown(ramOption, Ram);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement hddOption;

    public void selectHddOption() {
        Reporter.log("Select Hdd option " + hddOption.toString());
        clickOnElement(hddOption);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement osOption;

    public void selectOsOption() {
        log.info("Select OS option " + osOption.toString());
        clickOnElement(osOption);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement softwareMicrosoftOption;

    public void selectMicrosoftSoftWareOption() {
        log.info("Select Software option " + softwareMicrosoftOption.toString());
        clickOnElement(softwareMicrosoftOption);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement softwareOption;

    public void selectSoftWareOption() {
        log.info("Select Software option " + softwareOption.toString());
        clickOnElement(softwareOption);
    }

    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement priceText;

    public String getTextFromPriceHeading() {
        log.info("Get Text From Price Heading " + priceText.toString());
        return getTextFromElement(priceText);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton;

    public void clickOnAddToCartButton() {
        log.info("CLick on add to cart button " + addToCartButton.toString());
        clickOnElement(addToCartButton);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]")
    WebElement productAddedToText;

    public String getTheProductHasBeenAddedToCart() {
        log.info("Get The Product Has Been Added To Cart " + productAddedToText.toString());
        return getTextFromElement(productAddedToText);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement crossButtonOption;

    //After that close the bar clicking on the cross button.
    public void crossButtonOption() {
        log.info("Cross Button Option " + crossButtonOption.toString());
        clickOnElement(crossButtonOption);
    }


    @CacheLookup
    @FindBy(xpath = "//li[@id='topcartlink']")
    WebElement shoppingCartOption;

    public void hoverOnShoppingCartOption() {
        log.info("Hover on Shopping Cart Option " + shoppingCartOption.toString());
        mouseHoverToElement(shoppingCartOption);
    }


    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement goToCartOption;

    public void clickOnGoToCartShoppingCartOptionAndClickOnGoToCart() {
        log.info("Click On Got TO Shopping Cart Option " + goToCartOption.toString());
        clickOnElement(goToCartOption);
    }
}
