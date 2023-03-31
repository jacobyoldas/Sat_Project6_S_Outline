package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    tags = "@SmokeTest",
    features = {"src/test/java/FeatureFiles/_01_Login.feature"},
//              "src/test/java/FeatureFiles/"}
    glue = {"StepsDefinitions"}

)
public class _01_TestRunner extends AbstractTestNGCucumberTests {
}
