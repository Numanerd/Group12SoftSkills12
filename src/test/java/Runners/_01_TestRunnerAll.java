package Runners;


import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features =("src/test/java/FeatureFiles"),
glue =("StepDefinitions"),
dryRun = true
)
public class _01_TestRunnerAll {
}
