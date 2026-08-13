Feature: Verify All Products and product detail page

  Scenario: Verify that all products and product details are displayed correctly
    Given Click on 'Products' button
    When Verify that user is navigated to ALL PRODUCTS page successfully
    Then Verify that all the products are visible on screen
    Then Click on 'View Product' of product
    Then User is landed to product detail page
    Then Verify that detail is visible product name, category, price, availability, condition, brand
