@FunctionalTest
Feature: Login on Automation Exercise Website

  @SmokeTest @RegressionTest
  Scenario: login with correct username and correct password
  Given: This is a valid login test

  @RegressionTest
  Scenario: login with incorrect username and correct password
  Given: This is a invalid login test

  @SmokeTest @RegressionTest
  Scenario: verify the title of the home page
  Given: Home page title is verified

  @SmokeTest @RegressionTest
  Scenario: verify All Products and product detail page
  Given: All Products and product detail page is verified

  @RegressionTest
  Scenario: Verify the Search Product
  Given: Enter product name in search input
  When: click search button
  Then: Verify Search Product is visible

  @RegressionTest
  Scenario: Verify Subscription in home page
  Given: Scroll down to footer
  When: Verify text SUBSCRIPTION is visible
  Then: Enter email address in input and click arrow button
  Then: Verify success message You have been successfully subscribed is visible

  @SmokeTest
  Scenario: Verify Subscription in Cart page
  Given: Click on Cart button
  When: Scroll down to footer
  Then: Verify text SUBSCRIPTION is visible
  Then: Enter email address in input and click arrow button
  Then: Verify success message You have been successfully subscribed is visible

  @RegressionTest @End2End
  Scenario: Add Products in Cart
  Given: Click on Products button
  When: Hover over first product and click Add to cart
  Then: Click Continue Shopping button
  Then: Hover over second product and click Add to cart
  Then: Click View Cart button
  Then: Verify both products are added to Cart
  Then: Verify their prices, quantity and total price

  @RegressionTest @End2End
  Scenario: Verify Product quantity in Cart
  Given: Click 'View Product' for any product on home page
  Then:  Verify product detail is opened
  Then: Increase quantity to 4
  Then: Click 'Add to cart' button
  Then: Click 'View Cart' button
  Then: Verify that product is displayed in cart page with exact quantity

  @End2End
  Scenario: Place Order and Checkout products in Cart
  Given: Add products to cart
  When:  Click 'Cart' button
  Then: Verify that cart page is displayed
  Then: Verify products are added to Cart
  Then: Click Proceed To Checkout button
  Then: Verify Address Details and Review Your Order
  Then: Enter description in comment text area and click Place Order
  Then: Enter payment details like Name on Card, Card Number, CVC, Expiration date
  Then: Click Pay and Confirm Order button
  Then: Verify success message Your order has been placed successfully
