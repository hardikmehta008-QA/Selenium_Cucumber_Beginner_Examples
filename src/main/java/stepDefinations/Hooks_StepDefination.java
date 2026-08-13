package stepDefinations;


import com.google.common.base.Verify;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Hooks_StepDefination {
    public static WebDriver driver;

    @Before
    public void setup() {
        System.out.println("Before hook executed");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://automationexercise.com/login");
        driver.findElement(By.xpath("//input[@type='email' and @name='email']")).click();
        driver.findElement(By.xpath("//input[@type='email' and @name='email']")).sendKeys("testauto_45@yopmail.com");
        driver.findElement(By.xpath("//input[@type='password' and @name='password']")).click();
        driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys("Testauto@45");
        driver.findElement(By.xpath("//button[@type='submit' and @data-qa='login-button']")).click();
    }

    @After
    public void teardown() {
        System.out.println("After hook executed");
        driver.quit();
    }

    @Given("Click on 'Products' button")
    public void clickOnProductsButton() {
        Boolean isProductsLinkEnabled = driver.findElement(By.xpath("//a[@href='/products']")).isEnabled();
        if (isProductsLinkEnabled) {
            driver.findElement(By.xpath("//a[@href='/products']")).click();
        } else {
            System.out.println("Products link is not enabled");
        }
    }

    @When("Verify that user is navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToAllProductsPageSuccessfully() {
        String title = driver.getTitle();
        System.out.println("Title of the ALL PRODUCTS page is: " + title);
        if (title.equals("Automation Exercise - All Products")) {
            System.out.println("User is navigated to ALL PRODUCTS page successfully");
        } else {
            System.out.println("User is not navigated to ALL PRODUCTS page successfully");
        }
        //h2[normalize-space()='All Products']
    }

    @Then("Verify that all the products are visible on screen")
    public void verifyThatAllTheProductsAreVisibleOnScreen() {
        if (driver.findElements(By.xpath("//div[@class='product-image-wrapper']")).size() > 0) {
            System.out.println("All the products are visible on screen");
        } else {
            System.out.println("All the products are not visible on screen");
        }

        // 1. Define the locator matching ALL product name elements
        By productLocator = By.xpath("//div[@class='product-image-wrapper']");
        // 2. Extract all matching web elements into a List
        List<WebElement> productElements = driver.findElements(productLocator);

        // 3. Verify if products are found and iterate through the list
        if (!productElements.isEmpty()) {
            System.out.println("Total products found on homepage: " + productElements.size());
            System.out.println("--- Product List ---");

            for (WebElement product : productElements) {
                // Extract text (or use product.getAttribute("innerText"))
                String productName = product.getText().trim();

                // Filter out empty spaces if elements load dynamically
                if (!productName.isEmpty()) {
                    System.out.println("- " + productName);
                }
            }
        } else {
            System.out.println("No products found with the specified locator.");
        }
    }

    @Then("Click on 'View Product' of product")
    public void clickOnViewProductOfProduct() {
        driver.findElement(By.xpath("(//a[normalize-space()='View Product'])[2]")).click();
    }

    @Then("User is landed to product detail page")
    public void userIsLandedToProductDetailPage() {
        String title = driver.getTitle();
        System.out.println("Title of the product detail page is: " + title);
        if (title.equals("Automation Exercise - Product Details")) {
            System.out.println("User is landed to product detail page");
        } else {
            System.out.println("User is not landed to product detail page");
        }
    }

    @Then("Verify that detail is visible product name, category, price, availability, condition, brand")
    public void verifyThatDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() {
        if (driver.findElements(By.xpath("//div[@class='product-information']")).size() > 0) {
            System.out.println("Product details are visible on product detail page");
        } else {
            System.out.println("Product details are not visible on product detail page");
        }
        //Product Details....
        List<WebElement> productDetails = driver.findElements(By.xpath("//div[@class='product-information']/*"));
        if (!productDetails.isEmpty()) {
            System.out.println("Product details found: " + productDetails.size());
            System.out.println("--- Product Details ---");

            for (WebElement product : productDetails) {
                // Extract text (or use product.getAttribute("innerText"))
                String productName = product.getText().trim();

                // Filter out empty spaces if elements load dynamically
                if (!productName.isEmpty()) {
                    System.out.println("- " + productName);
                }
            }
        }
    }
}
