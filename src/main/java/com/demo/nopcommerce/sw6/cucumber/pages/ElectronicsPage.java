package com.demo.nopcommerce.sw6.cucumber.pages;

import com.demo.nopcommerce.sw6.cucumber.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ElectronicsPage extends Utilities {
    private static final Logger log = LogManager.getLogger(ElectronicsPage.class.getName());

    public ElectronicsPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement cellPhoneOption;
    public void clickCellPhones(){
        Reporter.log("clickCellPhones " + cellPhoneOption.toString());
        clickOnElement(cellPhoneOption);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Cell phones')]")
    WebElement cellPhone;

    public String getCellPhonesText() {
        log.info("Get Cell Phones Text" + cellPhone.toString());
        return getTextFromElement(cellPhone);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement viewTab;
    public void clickOnViewTab(){
        log.info("Click On View Tab" + viewTab.toString());
        clickOnElement(viewTab);
    }
}
