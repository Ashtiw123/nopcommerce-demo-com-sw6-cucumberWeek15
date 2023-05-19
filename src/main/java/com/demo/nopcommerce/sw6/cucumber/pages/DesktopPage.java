package com.demo.nopcommerce.sw6.cucumber.pages;

import com.demo.nopcommerce.sw6.cucumber.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utilities {

    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());

    public DesktopPage() {
        PageFactory.initElements(driver, this);
    }



    @CacheLookup
    @FindBy(xpath = "//option[contains(text(),'Name: Z to A')]")
    WebElement dropDownOptionZtoA;

    public void selectDropdownOptionZtoA() {
        log.info("selectDropdownOptionZtoA " + dropDownOptionZtoA.toString());
        clickOnElement(dropDownOptionZtoA);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-name']/a")
    WebElement listOfProducts;

    public void verifyProductsAreInTheRightOrder() {
        log.info("selectDropdownOptionZtoA " + listOfProducts.toString());
        List<WebElement> productNames = driver.findElements(By.xpath("//h2[@class='product-name']/a"));
        List<String> productNameStrings = new ArrayList<String>();
        for (WebElement productName : productNames) {
            productNameStrings.add(productName.getText());
        }
        List<String> sortedProductNames = new ArrayList<String>(productNameStrings);
        Collections.sort(sortedProductNames, Collections.reverseOrder());
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]" +
            "/div[2]/div[3]/div[2]/button[1]")
    WebElement addToCartButton;

    public void clickAddToCartButton() {
       log.info("clickAddToCartButton " + addToCartButton.toString());
        clickOnElement(addToCartButton);
    }
}
