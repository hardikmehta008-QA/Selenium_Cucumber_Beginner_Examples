package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class LoginStepDefination {
    public static WebDriver driver;

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://rahulshettyacademy.com/client/#/auth/login");

    }
    @When("Title of the login page is Let's Shop")
    public void title_of_the_login_page_is_lets_shop() {
        String title = driver.getTitle();
        System.out.println("Title of the login page is: " + title);
        Assert.assertEquals("Let's Shop", title);
    }
    @Then("User enters valid username and password")
    public void user_enters_valid_username_and_password() {
        driver.findElement(By.id("userEmail")).click();
        driver.findElement(By.id("userEmail")).sendKeys("testauto_45@yopmail.com");
        driver.findElement(By.id("userPassword")).click();
        driver.findElement(By.id("userPassword")).sendKeys("Testauto@45");

    }
    @Then("User clicks on the login button")
    public void user_clicks_on_the_login_button() {
        driver.findElement(By.id("login")).click();

    }
    @Then("User is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        String textValidatation = driver.findElement(By.xpath("//div//h3[text()='Automation']")).getText();
        System.out.println("Home page Text Validate...." + textValidatation);
        Assert.assertEquals("AUTOMATION", textValidatation);
    }
    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
        String getHomePageText = driver.findElement(By.xpath("//button[normalize-space()='HOME']")).getText();
        System.out.println("Get Home Page Button Text...." + getHomePageText);
    }
    @Then("User see a list of all the products displayed on the home page")
    public void user_see_a_list_of_all_the_products_displayed_on_the_home_page() {
        // 1. Define the locator matching ALL product name elements
        By productLocator = By.xpath("//section[@id='products']/*[last()-1]/*[last()]/child::div");
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
        }
        else {
            System.out.println("No products found with the specified locator.");
        }

        //Close the browser
        driver.close();
    }
}
