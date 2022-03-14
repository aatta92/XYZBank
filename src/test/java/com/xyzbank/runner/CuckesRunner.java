package com.xyzbank.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import static org.openqa.selenium.net.HostIdentifier.getHostName;

@CucumberOptions
        (
                features = "src/test/resources/features",
                glue = "com/xyzbank",
                dryRun = false,
                tags = "@test"
        )
public class CuckesRunner extends AbstractTestNGCucumberTests {
}
