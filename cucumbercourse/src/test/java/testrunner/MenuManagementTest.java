package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"/Users/dhawalsarwate/Documents/workspace/cucumbercourse/src/test/java/features"},
        glue = {"stepdefinitions", "hooks"},
//		tags = "@SmokeTest or @RegressionTest",
//		tags = "@NightlyBuildTest and  @RegressionTest",
        tags = "@ListOfMaps",
        plugin = {"pretty",
                "html: target/report.html",
                "json: target/systemTestReports/json/report.json",
                "junit: target/systemTestReports/junit/report.xml"},
        publish = true,
        dryRun = false
)
public class MenuManagementTest {

}
