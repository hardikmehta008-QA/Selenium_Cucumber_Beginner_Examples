package Runner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "E:\\Intellij_IDEA_Projects\\Selenium_Cucumber_Beginner_Examples\\src\\main\\java\\Features\\login_DataTable.feature", //the path of the feature file.
        glue = {"stepDefinations"}, //the path of the step defination file.
        plugin = { //to generate different types of reporting.
                "pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        },
        dryRun = false, //to check the mapping is proper between feature file & step defination file.
        monochrome = true //Display the console output in a proper readable format.
        //strict :- it will be checking if any step is not defined in step defination file.

)
public class LoginRunner {

}
