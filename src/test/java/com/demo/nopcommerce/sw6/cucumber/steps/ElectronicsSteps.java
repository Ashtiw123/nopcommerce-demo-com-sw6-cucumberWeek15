package com.demo.nopcommerce.sw6.cucumber.steps;

import com.demo.nopcommerce.sw6.cucumber.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ElectronicsSteps {
    @When("^I hover mouse over electronics tab$")
    public void iHoverMouseOverElectronicsTab() {
        new HomePage().clickComputerTab();
    }

    @And("^I hover mouse over cellphones and click$")
    public void iHoverMouseOverCellphonesAndClick() {
    new ElectronicsPage().clickCellPhones();
    }


    @Then("^I should see text \"([^\"]*)\"$")
    public void iShouldSeeText(String mobile) {
        Assert.assertEquals(mobile, new ElectronicsPage().getCellPhonesText(), "Cell Phones Not Displayed");

    }

    @And("^I click on list view tab$")
    public void iClickOnListViewTab() {
        new ElectronicsPage().clickOnViewTab();

    }

    @And("^I click on product Nokia Lumia (\\d+)$")
    public void iClickOnProductNokiaLumia(int arg0) {
        new NokiaLumaPage().verifyNokiaLuma1020Text();
    }

    @Then("^I should be able to see text \"([^\"]*)\"$")
    public void iShouldBeAbleToSeeText(String Nokia)  {
        new NokiaLumaPage().verifyNokiaLuma1020Text();
        Assert.assertEquals(Nokia, new NokiaLumaPage().verifyNokiaLuma1020Text(), "Nokia Luma Text not displayed");
    }

    @Then("^I should be able to see price \"([^\"]*)\"$")
    public void iShouldBeAbleToSeePrice(String price) {
        Assert.assertEquals(price, new NokiaLumaPage().verifyNokiaLuma1020PriceText(), "Wrong price displayed");
    }

    @And("^I change quantity to \"([^\"]*)\"$")
    public void iChangeQuantityTo(String arg0) {
        new NokiaLumaPage().quantitySpaceOption();
    }

    @Then("^I must be able to see message \"([^\"]*)\" on bar top green bar$")
    public void iMustBeAbleToSeeMessageOnBarTopGreenBar(String Bar) {
        Assert.assertEquals(Bar, new NokiaLumaPage().verifyTheProductHasBeenAddedToYourShoppingCartText(),"Product not added to Cart");
    }

    @And("^I close bar by clicking x button on green bar$")
    public void iCloseBarByClickingXButtonOnGreenBar() {
        new NokiaLumaPage().clickOnXOnGreenBarOption();
    }

    @Then("^I should be able see message \"([^\"]*)\"$")
    public void iShouldBeAbleSeeMessage(String Message) {
        Assert.assertEquals(Message,new NokiaLumaCartPage().verifyNokiaLumaShoppingCartText(), "Shopping cart not displayed");

    }

    @Then("^I should be able see quantity \"([^\"]*)\"$")
    public void iShouldBeAbleSeeQuantity(String qty)  {
        Assert.assertEquals(qty,new NokiaLumaCartPage().verifyQuantityText(),"qty");

    }

    @Then("^I should be able to see total \"([^\"]*)\"$")
    public void iShouldBeAbleToSeeTotal(String price)  {
        Assert.assertEquals(price, new NokiaLumaCartPage().verifyTotalPriceText(),"price");

    }

    @And("^I click on Checkout$")
    public void iClickOnCheckout() {
        new NokiaLumaCartPage().clickOnCheckOutOption();

    }

    @Then("^I should be able to see \"([^\"]*)\"$")
    public void iShouldBeAbleToSee(String checkout)  {
        Assert.assertEquals(checkout, new NokiaLumaCheckOutPage().verifyWelcomePleaseSignInText(),"checkout");

    }

    @And("^I should be ab able to click on Register button$")
    public void iShouldBeAbAbleToClickOnRegisterButton() {
        new NokiaLumaCheckOutPage().clickOnRegisterTabOption();
    }

    @And("^I should be able to click on appropriate gender button male$")
    public void iShouldBeAbleToClickOnAppropriateGenderButtonMale() {
        new NokiaLumaRegisterPage().clickOnAppropriateGenderButton();
    }

    @And("^I should be able to enter first name \"([^\"]*)\"$")
    public void iShouldBeAbleToEnterFirstName(String firstname)  {
        new NokiaLumaRegisterPage().firstNameOption("firstname");

    }

    @And("^I should be able to enter last name \"([^\"]*)\"$")
    public void iShouldBeAbleToEnterLastName(String lastname) {
        new NokiaLumaRegisterPage().lastNameOption("lastname");
    }

    @And("^I should be able to choose date from Day dropdown \"([^\"]*)\"$")
    public void iShouldBeAbleToChooseDateFromDayDropdown(String date) {
        new NokiaLumaRegisterPage().dateOfBirth("date");
    }

    @And("^I should be able to choose month from month dropdown \"([^\"]*)\"$")
    public void iShouldBeAbleToChooseMonthFromMonthDropdown(String month) {
        new NokiaLumaRegisterPage().dateOfBirthMonth("month");
    }

    @And("^I should be able to choose year from year dropdown \"([^\"]*)\"$")
    public void iShouldBeAbleToChooseYearFromYearDropdown(String year)  {
        new NokiaLumaRegisterPage().dateOfBirthYear("year");

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new NokiaLumaRegisterPage().enterPasswordOption("password");
    }

    @And("^I confirm password \"([^\"]*)\"$")
    public void iConfirmPassword(String confirm) {
        new NokiaLumaRegisterPage().confirmPasswordOption("confirm");
    }

    @And("^I click on terms and condition$")
    public void iClickOnTermsAndCondition() {
        new NokiaLumaRegisterPage().clickOnTermsAndServiceBox();
    }
}
