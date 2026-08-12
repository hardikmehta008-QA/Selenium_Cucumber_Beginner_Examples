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

import java.time.Duration;
import java.util.List;
import java.util.Map;

//Data table with Maps: DataTable.asMaps(String.class, String.class)
// This method converts the data table into a list of maps, where each map represents a row in the data table.
// The keys of the map are the column headers, and the values are the corresponding cell values for that row.
// This is useful when you have a data table with multiple columns and want to access the data using meaningful keys.
public class Login_Maps_DataDriven {
    //private static final Logger log = LoggerFactory.getLogger(Login_DataTable_StepDefination.class);
    public static WebDriver driver;

    @Given("Login page of Automation Exercise Website")
    public void Login_page_of_Automation_Exercise_Website() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://automationexercise.com/login");

    }

    @When("Title of the login page Automation Exercise")
    public void Title_of_the_login_page_Automation_Exercise() {
        String title = driver.getTitle();
        System.out.println("Title of the login page is: " + title);
        Assert.assertEquals("Automation Exercise - Signup / Login", title);
    }

    //Regular expression:
    //1.  \"([^\"]*)\"
    //2.  \"(.*)\"
    @Then("User is entered username and password")
    public void User_is_entered_username_and_password(DataTable userData) {
        for(Map<String, String> data : userData.asMaps(String.class, String.class)) {
            driver.findElement(By.xpath("//input[@type='email' and @name='email']")).click();
            driver.findElement(By.xpath("//input[@type='email' and @name='email']")).sendKeys(data.get("username"));
            driver.findElement(By.xpath("//input[@type='password' and @name='password']")).click();
            driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys(data.get("password"));
        }
    }

    @Then("Login button is clicked")
    public void Login_button_is_clicked() {
        driver.findElement(By.xpath("//button[@type='submit' and @data-qa='login-button']")).click();
    }

    @Then("After login navigate to the home page")
    public void After_login_navigate_to_the_home_page() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        String userName = driver.findElement(By.xpath("//div[@class='shop-menu pull-right']/*[last()]/*[last()]//b")).getText();
        System.out.println("User Name is....." + userName);
        Assert.assertEquals("Test Automation", userName);
    }

    @Then("Successful login redirect to the home page")
    public void Successful_login_redirect_to_the_home_page() {
        String getHomePageText = driver.findElement(By.xpath("//a[normalize-space()='Home']")).getText();
        System.out.println("Get Home Page Button Text...." + getHomePageText);
    }

    @Then("All the products displayed on the home page")
    public void All_the_products_displayed_on_the_home_page() {
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
    @Then("Browser is closed")
    public void Browser_is_closed() {
        driver.close();
    }
}
