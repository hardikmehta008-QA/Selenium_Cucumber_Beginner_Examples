package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TaggingStepDefination {

    @Given("This is a valid login test")
    public void this_is_a_valid_login_test() {
        System.out.println("STEP: This is a valid login test");
    }

    @Given("This is a invalid login test")
    public void this_is_a_invalid_login_test() {
        System.out.println("STEP: This is a invalid login test");
    }

    @Given("Home page title is verified")
    public void home_page_title_is_verified() {
        System.out.println("STEP: Home page title is verified");
    }

    @Given("All Products and product detail page is verified")
    public void all_products_and_product_detail_page_is_verified() {
        System.out.println("STEP: All Products and product detail page is verified");
    }

    @Given("Enter product name in search input")
    public void enter_product_name_in_search_input() {
        System.out.println("STEP: Enter product name in search input");
    }

    @When("click search button")
    public void click_search_button() {
        System.out.println("STEP: click search button");
    }

    @Then("Verify Search Product is visible")
    public void verify_search_product_is_visible() {
        System.out.println("STEP: Verify Search Product is visible");
    }

    @Given("Scroll down to footer")
    public void scroll_down_to_footer() {
        System.out.println("STEP: Scroll down to footer");
    }

    @When("Verify text SUBSCRIPTION is visible")
    public void verify_text_subscription_is_visible() {
        System.out.println("STEP: Verify text SUBSCRIPTION is visible");
    }

    @Then("Enter email address in input and click arrow button")
    public void enter_email_address_in_input_and_click_arrow_button() {
        System.out.println("STEP: Enter email address in input and click arrow button");
    }

    @Then("Verify success message You have been successfully subscribed is visible")
    public void verify_success_message_you_have_been_successfully_subscribed_is_visible() {
        System.out.println("STEP: Verify success message You have been successfully subscribed is visible");
    }

    @Given("Click on Cart button")
    public void click_on_cart_button() {
        System.out.println("STEP: Click on Cart button");
    }

    @Given("Click on Products button")
    public void click_on_products_button() {
        System.out.println("STEP: Click on Products button");
    }

    @When("Hover over first product and click Add to cart")
    public void hover_over_first_product_and_click_add_to_cart() {
        System.out.println("STEP: Hover over first product and click Add to cart");
    }

    @Then("Click Continue Shopping button")
    public void click_continue_shopping_button() {
        System.out.println("STEP: Click Continue Shopping button");
    }

    @Then("Hover over second product and click Add to cart")
    public void hover_over_second_product_and_click_add_to_cart() {
        System.out.println("STEP: Hover over second product and click Add to cart");
    }

    @Then("Click View Cart button")
    public void click_view_cart_button() {
        System.out.println("STEP: Click View Cart button");
    }

    @Then("Verify both products are added to Cart")
    public void verify_both_products_are_added_to_cart() {
        System.out.println("STEP: Verify both products are added to Cart");
    }

    @Then("Verify their prices, quantity and total price")
    public void verify_their_prices_quantity_and_total_price() {
        System.out.println("STEP: Verify their prices, quantity and total price");
    }

    @Given("Click 'View Product' for any product on home page")
    public void click_view_product_for_any_product_on_home_page() {
        System.out.println("STEP: Click 'View Product' for any product on home page");
    }

    @Then("Verify product detail is opened")
    public void verify_product_detail_is_opened() {
        System.out.println("STEP: Verify product detail is opened");
    }

    @Then("Increase quantity to 4")
    public void increase_quantity_to_4() {
        System.out.println("STEP: Increase quantity to 4");
    }

    @Then("Click 'Add to cart' button")
    public void click_add_to_cart_button() {
        System.out.println("STEP: Click 'Add to cart' button");
    }

    @Then("Click 'View Cart' button")
    public void click_quoted_view_cart_button() {
        System.out.println("STEP: Click 'View Cart' button");
    }

    @Then("Verify that product is displayed in cart page with exact quantity")
    public void verify_that_product_is_displayed_in_cart_page_with_exact_quantity() {
        System.out.println("STEP: Verify that product is displayed in cart page with exact quantity");
    }

    @Given("Add products to cart")
    public void add_products_to_cart() {
        System.out.println("STEP: Add products to cart");
    }

    @When("Click 'Cart' button")
    public void click_cart_button() {
        System.out.println("STEP: Click 'Cart' button");
    }

    @Then("Verify that cart page is displayed")
    public void verify_that_cart_page_is_displayed() {
        System.out.println("STEP: Verify that cart page is displayed");
    }

    @Then("Verify products are added to Cart")
    public void verify_products_are_added_to_cart() {
        System.out.println("STEP: Verify products are added to Cart");
    }

    @Then("Click Proceed To Checkout button")
    public void click_proceed_to_checkout_button() {
        System.out.println("STEP: Click Proceed To Checkout button");
    }

    @Then("Verify Address Details and Review Your Order")
    public void verify_address_details_and_review_your_order() {
        System.out.println("STEP: Verify Address Details and Review Your Order");
    }

    @Then("Enter description in comment text area and click Place Order")
    public void enter_description_in_comment_text_area_and_click_place_order() {
        System.out.println("STEP: Enter description in comment text area and click Place Order");
    }

    @Then("Enter payment details like Name on Card, Card Number, CVC, Expiration date")
    public void enter_payment_details_like_name_on_card_card_number_cvc_expiration_date() {
        System.out.println("STEP: Enter payment details like Name on Card, Card Number, CVC, Expiration date");
    }

    @Then("Click Pay and Confirm Order button")
    public void click_pay_and_confirm_order_button() {
        System.out.println("STEP: Click Pay and Confirm Order button");
    }

    @Then("Verify success message Your order has been placed successfully")
    public void verify_success_message_your_order_has_been_placed_successfully() {
        System.out.println("STEP: Verify success message Your order has been placed successfully");
    }
}
