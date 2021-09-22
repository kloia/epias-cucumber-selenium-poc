package com.epias.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
/*
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json"},
        glue = "org/example/steps",
        features = "src/test/resources/features",
        tags = "@wip",
        dryRun = false
)
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/epias/step_def",
        features = "src/test/resources/features",
        tags = "",
        dryRun = false
)
public class CucumberTestRunner {
}
