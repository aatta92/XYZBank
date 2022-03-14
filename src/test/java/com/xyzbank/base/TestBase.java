package com.xyzbank.base;

import com.xyzbank.utils.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class TestBase {

    public static WebDriver driver;

    @Before
    public void setUp() {
        driver = DriverFactory.browserName("chrome");
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
    }


    @After
    public void tearDown() {
        driver.quit();
    }
}
