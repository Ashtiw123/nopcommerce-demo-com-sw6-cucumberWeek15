package com.demo.nopcommerce.sw6.cucumber.steps;

import com.demo.nopcommerce.sw6.cucumber.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ComputerSteps {

    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^I click on Computer tab$")
    public void iClickOnComputerTab() {
        new HomePage().clickComputerTab();
    }

    @And("^I click on Desktop$")
    public void iClickOnDesktop() {
        new ComputerPage().clickOnDesktopOption();
    }

    @And("^I select sort by position Name: Z to A$")
    public void iSelectSortByPositionNameZToA() {
        new DesktopPage().selectDropdownOptionZtoA();
    }

    @Then("^Verify the product will arrange  in descending order$")
    public void verifyTheProductWillArrangeInDescendingOrder() {
        new DesktopPage().verifyProductsAreInTheRightOrder();
    }

    @And("^I select sort by position Name: A to Z$")
    public void iSelectSortByPositionNameAToZ() {
    }

    @And("^I click on add to cart$")
    public void iClickOnAddToCart() {
        new DesktopPage().clickAddToCartButton();
    }

    @Then("^I should should be able to see \"([^\"]*)\" text$")
    public void iShouldShouldBeAbleToSeeText(String expected) {
        Assert.assertEquals(expected, new BuildYourOwnComputerPage().getTextFromBuildYourOwnComputerHeading(), "Message not displayed");
    }

    @And("^I select \"([^\"]*)\"$")
    public void iSelect(String processor) {
        new BuildYourOwnComputerPage().selectProcessorOption(processor);
    }

    @And("^I select RAM \"([^\"]*)\"$")
    public void iSelectRAM(String ram) throws InterruptedException {
        Thread.sleep(1000);
        new BuildYourOwnComputerPage().selectRamOption(ram);
    }

    @And("^I select HDD radio \"([^\"]*)\"$")
    public void iSelectHDDRadio(String hddButton) throws InterruptedException {
        Thread.sleep(1000);
        new BuildYourOwnComputerPage().selectHddOption();
    }

    @And("^I select OS radio \"([^\"]*)\"$")
    public void iSelectOSRadio(String osButton) throws InterruptedException {
        Thread.sleep(1000);
        new BuildYourOwnComputerPage().selectOsOption();
    }

    @And("^I check the box titled \"([^\"]*)\"$")
    public void iCheckTheBoxTitled(String software) throws InterruptedException {
        Thread.sleep(1000);
        new BuildYourOwnComputerPage().selectSoftWareOption();
    }

    @Then("^I verify price  \"([^\"]*)\"$")
    public void iVerifyPrice(String price) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(price, new BuildYourOwnComputerPage().getTextFromPriceHeading(), "Total price not displayed");
    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

    @Then("^I should be able to see on top of green bar \"([^\"]*)\"$")
    public void iShouldBeAbleToSeeOnTopOfGreenBar(String label) {
        Assert.assertEquals(label, new BuildYourOwnComputerPage().getTheProductHasBeenAddedToCart(), "Product has not been added to cart");
    }

    @And("^I click on cross button to close green bar$")
    public void iClickOnCrossButtonToCloseGreenBar() {
        new BuildYourOwnComputerPage().crossButtonOption();
    }

    @And("^I hover mouse on shopping cart and click on Go To cart button$")
    public void iHoverMouseOnShoppingCartAndClickOnGoToCartButton() {
        new BuildYourOwnComputerPage().hoverOnShoppingCartOption();
        new BuildYourOwnComputerPage().clickOnGoToCartShoppingCartOptionAndClickOnGoToCart();
    }

    @Then("^I should be able to see \"([^\"]*)\" text$")
    public void iShouldBeAbleToSeeText(String cart) {
        Assert.assertEquals(cart, new ShoppingCartPage().getTextFromShoppingCartHeading(), "No Shopping Cart Message");
    }

    @And("^I should be able to change quantity to \"([^\"]*)\"$")
    public void iShouldBeAbleToChangeQuantityTo(String qty) {
        new ShoppingCartPage().quantitySpaceOption();
    }

    @And("^click on update shopping cart$")
    public void clickOnUpdateShoppingCart() {
        new ShoppingCartPage().clickOnUpdateShoppingCart();
    }

    @Then("^I should be able to verify total \"([^\"]*)\"$")
    public void iShouldBeAbleToVerifyTotal(String newTotal) throws InterruptedException, AssertionError {
        Thread.sleep(1000);
        Assert.assertEquals(newTotal, new ShoppingCartPage().getTextFromFinalPrice(), "Total has not updated.");
    }

    @And("^I click on check box of I agree with terms of service$")
    public void iClickOnCheckBoxOfIAgreeWithTermsOfService() {
        new ShoppingCartPage().clickOnTermsOfServiceOption();
    }

    @And("^I click on check out$")
    public void iClickOnCheckOut() {
        new ShoppingCartPage().clickCheckOutOption();
    }

    @Then("^I should be able see \"([^\"]*)\" text$")
    public void iShouldBeAbleSeeText(String text) {
        Assert.assertEquals(text, new CheckOutWelcomePage().getTextFromWelcomeSignInTitle(), "Welcome Text Not Displayed");
    }

    @And("^I click on check out as guest menu$")
    public void iClickOnCheckOutAsGuestMenu() {
        new CheckOutWelcomePage().clickCheckoutAsGuestButton();
    }


    @Given("^I am on checkout page$")
    public void iAmOnCheckoutPage() {
        new CheckOutBillingPage().checkOutLabel();
    }

    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String name) {
        new CheckOutBillingPage().firstNameOption(name);
    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String lastname) {
        new CheckOutBillingPage().lastNameOption(lastname);
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) {
        new CheckOutBillingPage().enterEmailId(email);
    }

    @And("^I select country from dropdown \"([^\"]*)\"$")
    public void iSelectCountryFromDropdown(String country) {
        new CheckOutBillingPage().selectUKFromDropdownOption(country);
    }

    @And("^I enter city \"([^\"]*)\"$")
    public void iEnterCity(String city) {
        new CheckOutBillingPage().enterCity(city);
    }

    @And("^I enter address \"([^\"]*)\"$")
    public void iEnterAddress(String address) {
        new CheckOutBillingPage().enterAddressLine1(address);
    }

    @And("^I enter Zipcode \"([^\"]*)\"$")
    public void iEnterZipcode(String zip) {
        new CheckOutBillingPage().enterZipcode(zip);
    }

    @And("^I enter phone number \"([^\"]*)\"$")
    public void iEnterPhoneNumber(String phone) {
        new CheckOutBillingPage().enterPhoneNumber(phone);
    }

    @And("^I click on continue tab$")
    public void iClickOnContinueTab() {
        new CheckOutBillingPage().clickOnContinueButton();
    }

    @And("^I choose Next Day Air zero cost delivery option$")
    public void iChooseNextDayAirZeroCostDeliveryOption() {
        new CheckOutBillingPage().clickOnTheShoppingOption();
    }

    @And("^I click on second continue tab$")
    public void iClickOnSecondContinueTab() {
        new CheckOutBillingPage().clickOnSecondContinueButton();
    }

    @And("^I click on credit card option$")
    public void iClickOnCreditCardOption() throws InterruptedException {
        Thread.sleep(1000);
        new CheckOutBillingPage().selectCardPaymentOption();
    }


    @And("^I click the third continue button$")
    public void iClickTheThirdContinueButton() {
        new CheckOutBillingPage().clickOnThirdContinueButton();
    }

    @And("^I choose Mastercard from dropdown$")
    public void iChooseMastercardFromDropdown() throws InterruptedException {
        Thread.sleep(1000);
        new CheckOutBillingPage().selectMasterCardOptionFromDropdown("Master card");
    }

    @And("^I enter cardholder name \"([^\"]*)\"$")
    public void iEnterCardholderName(String name) {
        new CheckOutBillingPage().enterCardHolderName(name);
    }

    @And("^I enter card number \"([^\"]*)\"$")
    public void iEnterCardNumber(String cardNumber) {
        new CheckOutBillingPage().enterCardNumber(cardNumber);
    }

    @And("^I enter Expiration date month \"([^\"]*)\"$")
    public void iEnterExpirationDateMonth(String month) {
        new CheckOutBillingPage().enterExpiryMonth(month);
    }

    @And("^I enter year \"([^\"]*)\"$")
    public void iEnterYear(String year) {
        new CheckOutBillingPage().enterExpiryYear(year);
    }

    @And("^I enter card code \"([^\"]*)\"$")
    public void iEnterCardCode(String code) {
        new CheckOutBillingPage().enterSecurityCode(code);
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new CheckOutBillingPage().clickOnFourthContinueButton();
    }

    @Then("^I should be able to see the payment method \"([^\"]*)\"$")
    public void iShouldBeAbleToSeeThePaymentMethod(String paymentMethod) {
        Assert.assertEquals(paymentMethod, new CheckOutBillingPage().getPaymentMethodText(), "Payment Text Not Displayed");
    }

    @Then("^I should be able to see the shipping method \"([^\"]*)\"$")
    public void iShouldBeAbleToSeeTheShippingMethod(String shippingMethod) {
        Assert.assertEquals(shippingMethod, new CheckOutBillingPage().getShippingMethodText(), "Shipping Text Not Displayed");
    }

    @Then("^I verify final Total \"([^\"]*)\"$")
    public void iVerifyFinalTotal(String finalAmount) {
        Assert.assertEquals(finalAmount, new CheckOutBillingPage().getTotalPriceText(), "Total Price Not Displayed");
    }

    @And("^I click on confirm$")
    public void iClickOnConfirm() {
        new CheckOutBillingPage().clickOnConfirmButton();
    }

    @Then("^I should be able to see the message \"([^\"]*)\"$")
    public void iShouldBeAbleToSeeTheMessage(String thankYouMessage) {
        Assert.assertEquals(thankYouMessage, new CheckOutBillingPage().getThankYouText(), "Thank you Text Not Displayed");
    }

    @Then("^I should be able to verify \"([^\"]*)\"$")
    public void iShouldBeAbleToVerify(String successMessage) {
        Assert.assertEquals(successMessage, new CheckOutBillingPage().getSuccessfulOrderText(), "Success Text Not Displayed");
    }

    @And("^I click on the final continue button$")
    public void iClickOnTheFinalContinueButton() {
        new CheckOutBillingPage().clickOnTheLastContinueButton();
    }

    @Then("^I should be on the next page with \"([^\"]*)\" text$")
    public void iShouldBeOnTheNextPageWithText(String welcomeText) {
        Assert.assertEquals(welcomeText, new CheckOutBillingPage().getWelcomeText(), "Welcome Text Not Displayed");
    }


}
