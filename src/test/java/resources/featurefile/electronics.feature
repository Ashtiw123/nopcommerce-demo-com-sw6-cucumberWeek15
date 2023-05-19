Feature: Navigate through Electronics

  Scenario: User should be able to navigate to cellphones successfully
    Given   I am on home page
    When    I hover mouse over electronics tab
    And     I hover mouse over cellphones and click
    Then    I should see text "Cell phones"

    Scenario: User should be able to add product to shopping cart and place order successfully
      Given   I hover mouse over electronics tab
      When    I hover mouse over cellphones and click
      Then    I should see text "Cell phones"
      And     I click on list view tab
      And     I click on product Nokia Lumia 1020
      Then    I should be able to see text " Nokia Lumia 1020"
      Then    I should be able to see price "$349.00"
      And     I change quantity to "2"
      And     I click on add to cart
      Then    I must be able to see message "The product has been added to your shopping cart" on bar top green bar
      And     I close bar by clicking x button on green bar
      And     I hover mouse on shopping cart and click on Go To cart button
      Then    I should be able see message "Shopping Cart"
      Then    I should be able see quantity "2"
      Then    I should be able to see total "$698.00"
      And     I click on check box of I agree with terms of service
      And     I click on Checkout
      Then    I should be able to see "Welcome, Please Sign In!"
      And     I should be ab able to click on Register button
      And     I should be able to click on appropriate gender button male
      And     I should be able to enter first name "abcd"
      And     I should be able to enter last name "abcd123"
      And     I should be able to choose date from Day dropdown "1"
      And     I should be able to choose month from month dropdown "1"
      And     I should be able to choose year from year dropdown "1937"
      And     I enter email "abcst@gmail.com"
      And     I enter password "A123456789"
      And     I confirm password "A123456789"
      And     I should be ab able to click on Register button
      Then    I should be able to see "Your registration completed"
      And     I click on continue button
      Then    I should be able to see "Shopping cart"
      And     I click on terms and condition
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



