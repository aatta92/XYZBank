package com.xyzbank.stepDefinitions.regression;

import com.xyzbank.pageobjects.HomePage;
import io.cucumber.java.en.Then;

import static com.xyzbank.base.TestBase.driver;

public class HomePageLinksSteps {
    HomePage homePage = new HomePage(driver);

    @Then("verify customer and manager button upload")
    public void verify_customer_and_manager_button_upload() {
        homePage.mainLinksUpload().contains("Customer Login");
        homePage.mainLinksUpload().contains("Bank Manager Login");
    }
}
