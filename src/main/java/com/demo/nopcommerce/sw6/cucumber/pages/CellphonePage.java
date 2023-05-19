package com.demo.nopcommerce.sw6.cucumber.pages;


import com.demo.nopcommerce.sw6.cucumber.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellphonePage extends Utilities {
    private static final Logger log = LogManager.getLogger(CellphonePage.class.getName());

    public CellphonePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Cell phones')]")
    WebElement cellPhoneText;

    public String getCellPhoneText() {
       log.info("Get Cell Phone Text " + cellPhoneText.toString());
        return getTextFromElement(cellPhoneText);
    }
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement listButton;
    public void clickOnTheListButton() {
       log.info("Click On The List Button " + listButton.toString());
        clickOnElement(listButton);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class='details']//a[contains(text(),'Nokia Lumia 1020')]")
    WebElement nokiaProduct;
    public void clickOnThePhoneOption() {
       log.info("CClick On The Phone Option " + nokiaProduct.toString());

        clickOnElement(nokiaProduct);
    }
}
