package stepDefinations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.List;

public class Login_DataTable_StepDefination {
    //private static final Logger log = LoggerFactory.getLogger(Login_DataTable_StepDefination.class);
    public static WebDriver driver;

    @Given("Open Login page of Automation Exercise Website")
    public void open_Login_page_of_Automation_Exercise_Website() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://automationexercise.com/login");

    }

    @When("Login page title is Automation Exercise - Login")
    public void login_page_title_is_Automation_Exercise_Login() {
        String title = driver.getTitle();
        System.out.println("Title of the login page is: " + title);
        Assert.assertEquals("Automation Exercise - Signup / Login", title);
    }

    //Regular expression:
    //1.  \"([^\"]*)\"
    //2.  \"(.*)\"
    @Then("Enters username and password")
    public void enters_username_and_password(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        driver.findElement(By.xpath("//input[@type='email' and @name='email']")).click();
        driver.findElement(By.xpath("//input[@type='email' and @name='email']")).sendKeys(data.get(0).get(0));
        driver.findElement(By.xpath("//input[@type='password' and @name='password']")).click();
        driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys(data.get(0).get(1));
    }

    @Then("Clicks on the login button")
    public void Clicks_on_the_login_button() {
        driver.findElement(By.xpath("//button[@type='submit' and @data-qa='login-button']")).click();
    }

    @Then("Navigate to the home page")
    public void navigate_to_the_home_page() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        String userName = driver.findElement(By.xpath("//div[@class='shop-menu pull-right']/*[last()]/*[last()]//b")).getText();
        System.out.println("User Name is....." + userName);
        Assert.assertEquals("Test Automation", userName);
    }

    @Then("Redirect to the home page")
    public void redirect_to_the_home_page() {
        String getHomePageText = driver.findElement(By.xpath("//a[normalize-space()='Home']")).getText();
        System.out.println("Get Home Page Button Text...." + getHomePageText);
    }

    @Then("List of all the products displayed on the home page")
    public void list_of_all_the_products_displayed_on_the_home_page() {
        // 1. Define the locator matching ALL product name elements
        By productLocator = By.xpath("//div[@class='features_items']/child::div");
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
    @Then("Close the browser")
    public void close_the_browser() {
        driver.close();
    }

}
