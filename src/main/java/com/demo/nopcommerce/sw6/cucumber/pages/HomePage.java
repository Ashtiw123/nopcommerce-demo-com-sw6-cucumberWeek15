package com.demo.nopcommerce.sw6.cucumber.pages;

import com.demo.nopcommerce.sw6.cucumber.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utilities {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement computerTab;

    public void clickComputerTab() {
       log.info("clickComputerTab " + computerTab.toString());
        clickOnElement(computerTab);
    }
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[6]/div[2]/ul[1]/li[2]")
    WebElement electronicsTab;
    public void clickElectronicsTab() {
     log.info("clickElectronicsTab " + electronicsTab.toString());
        clickOnElement(electronicsTab);
    }
}