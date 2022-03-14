package com.xyzbank.stepDefinitions.smoke;

import com.xyzbank.pageobjects.LoginPage;
import com.xyzbank.pageobjects.ManagerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.xyzbank.base.TestBase.driver;


public class AddCustomerSteps {
    LoginPage loginPage = new LoginPage(driver);
    ManagerPage managerPage = new ManagerPage(driver);

    @And("click on Manager Login link")
    public void clickOnManagerLoginLink() {
        loginPage.manager_login();
    }

    @Given("click on add customer link")
    public void click_on_add_customer_link() {
        managerPage.add_customerLink1();
    }

    @Given("enter customers info")
    public void enter_customers_info() {
        managerPage.add_customer("anwar", "atta", "20155");
    }

    @And("click on add customer button")
    public void clickOnAddCustomerButton() {
        managerPage.click_add_customerBtn();
    }

    @Then("verify customer is added successfully")
    public void verify_customer_is_added_successfully() {
        boolean text = managerPage.verify_customer_isAdded().contains("Customer added successfully");
        Assert.assertTrue(text);
    }
}
