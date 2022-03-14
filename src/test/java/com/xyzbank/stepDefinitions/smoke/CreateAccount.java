package com.xyzbank.stepDefinitions.smoke;
import com.xyzbank.pageobjects.ManagerPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.xyzbank.base.TestBase.driver;

public class CreateAccount {
    ManagerPage managerPage = new ManagerPage(driver);

    @Given("click on open account link")
    public void click_on_open_account_link() {
        managerPage.open_account_link();

    }

    @Given("choose customer name and currency")
    public void choose_customer_name_and_currency() {
        managerPage.choose_customer_name_and_currency();
    }

    @Given("click on process")
    public void click_on_process() {
        managerPage.click_on_process();
    }

    @Then("verify user created account successfully")
    public void verify_user_created_account_successfully() {
        String alert = managerPage.verify_user_created_account_successfully();
        Assert.assertTrue(alert.contains("Account created successfully"));
    }

}
