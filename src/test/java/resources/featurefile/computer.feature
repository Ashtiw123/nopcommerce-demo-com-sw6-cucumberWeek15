
Feature: Building computer to specification

@smoke @regression
  Scenario: User should be able to sort product alphabetically
    Given I am on home page
    When I click on Computer tab
    And I click on Desktop
    And I select sort by position Name: Z to A
    Then Verify the product will arrange  in descending order

@smoke @sanity
  Scenario: User should be able to build a desktop and add to shopping cart successfully
    Given I am on home page
    When I click on Computer tab
    And I click on Desktop
    And I select sort by position Name: A to Z
    And I click on add to cart
    Then I should should be able to see "Build your own computer" text
    And I select "2.2 GHz Intel Pentium Dual-Core E2200"
    And I select RAM "8GB [+$60.00]"
    And I select HDD radio "400 GB [+$100.00]"
    And I select OS radio "Vista Premium [+$60.00]"
    And I check the box titled "Total Commander[+$5.00]"
    Then I verify price  "$1,475.00"
    And I click on add to cart button
    Then I should be able to see on top of green bar "The product has been added to your shopping cart"
    And I click on cross button to close green bar
    And I hover mouse on shopping cart and click on Go To cart button
    Then I should be able to see "Shopping cart" text
    And I should be able to change quantity to "2"
    And click on update shopping cart
    Then I should be able to verify total "$2,950.00"
    And I click on check box of I agree with terms of service
    And I click on check out
    Then I should be able see "Welcome, Please Sign In!" text
    And I click on check out as guest menu
    And I am on checkout page
    And I enter first name "ASTII"
    And I enter last name "ITSA"
    And I enter email "Prime123@Gmail.com"
    And I select country from dropdown "United Kingdom"
    And I enter city "LONDON"
    And I enter address "10 Downing Street LONDON"
    And I enter Zipcode "SW11AAA"
    And I enter phone number "07986876564"
    And I click on continue tab
    And I choose Next Day Air zero cost delivery option
    And I click on second continue tab
    And I click on credit card option
    And I click the third continue button
    And I choose Mastercard from dropdown
    And I enter cardholder name "PrimeTesting"
    And I enter card number "0759 2136 2156 5987"
    And I enter Expiration date month "01"
    And I enter year "2026"
    And I enter card code "111"
    And I click on continue button
    Then I should be able to see the payment method "Credit Card"
    Then I should be able to see the shipping method "Next Day Air"
    Then I verify final Total "$2,950.00"
    And I click on confirm
    Then I should be able to see the message "Thank you"
    Then I should be able to verify "Your order has been successfully processed!"
    And I click on the final continue button
    Then I should be on the next page with "Welcome to our store" text












