package Runner;

import cucumber.api.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/sachin/IdeaProjects/POMFramework/POMFramework/CucumberFramework/src/main/java/Features", glue="StepDefination",
format= {"pretty","html:test-outout", "json:json-output/cucumber.json", "junit:junit_output/cucumber.xml"}, monochrome = true,
        strict = true, dryRun = false, tags = {"~@RegressionTest", "~@SmokeTest", "@PageFactory"})

public class TestRunnner  extends AbstractTestNGCucumberTests {

}
