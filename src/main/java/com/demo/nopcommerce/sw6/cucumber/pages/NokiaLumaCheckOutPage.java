package com.demo.nopcommerce.sw6.cucumber.pages;

import com.demo.nopcommerce.sw6.cucumber.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NokiaLumaCheckOutPage extends Utilities {

    private static final Logger log = LogManager.getLogger(NokiaLumaCheckOutPage.class.getName());

    public NokiaLumaCheckOutPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomePleaseSignInText;

    public String verifyWelcomePleaseSignInText() {
        log.info("verifyWelcomePleaseSignInText " + welcomePleaseSignInText.toString());
        return getTextFromElement(welcomePleaseSignInText);
    }

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Register']")
    WebElement clickRegisterTab;
    public void clickOnRegisterTabOption() {
       log.info("clickOnRegisterTabOption " + clickRegisterTab.toString());
        clickOnElement(clickRegisterTab);
    }


}
