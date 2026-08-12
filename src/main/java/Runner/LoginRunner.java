package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "E:\\Intellij_IDEA_Projects\\Selenium_Cucumber_Beginner_Examples\\src\\main\\java\\Features\\tagging.feature", //the path of the feature file.
        glue = {"stepDefinations"}, //the path of the step defination file.
        plugin = { //to generate different types of reporting.
                "pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        },
        dryRun = false, //to check the mapping is proper between feature file & step defination file.
        monochrome = true, //Display the console output in a proper readable format.
        tags = "not (@SmokeTest or @RegressionTest) and @End2End"
        //strict :- it will be checking if any step is not defined in step defination file.
        //OR : "@SmokeTest or @RegressionTest" -->To execute scenarios that have at least one of the specified tags
        //AND : "@SmokeTest and @RegressionTest" -->To execute scenarios that have both of the specified tags
        //Exclude multiple tags (NOT condition): tags="not @smoke and not @regression"
        // -->tags = "not (@SmokeTest or @RegressionTest) and @End2End"
        //Run some tags but exclude others: tags="@SmokeTest and not @RegressionTest"
        //Complex combinations (using grouping parentheses): tags="(@SmokeTest or @RegressionTest) and not @End2End"


        // Old OR: tags = {"@SmokeTest, @RegressionTest"}
        // Old AND: tags = {"@SmokeTest", "@RegressionTest"}
)
public class LoginRunner {

}
