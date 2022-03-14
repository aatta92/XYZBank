package com.xyzbank.stepDefinitions.smoke;

import com.xyzbank.base.TestBase;
import com.xyzbank.pageobjects.LoginPage;
import io.cucumber.java.en.*;
import org.testng.Assert;

import static com.xyzbank.base.TestBase.driver;

public class LoginSteps {

    LoginPage loginPage = new LoginPage(driver);


    @Given("user is on homepage")
    public void user_is_on_homepage() {

        String title = TestBase.driver.getTitle();
        Assert.assertEquals("XYZ Bank", title);
    }

    @Given("click on customer login button")
    public void click_on_customer_login_button() {
        loginPage.customerLogin();
    }


    @Given("select user name")
    public void select_user_name() {
        loginPage.select_user_name();
    }

    @Given("click on login button")
    public void click_on_login_button() {
        loginPage.click_on_login_button();
    }

    @Then("verify user is logged in successfully")
    public void verifyUserIsLoggedInSuccessfully() {
        boolean nameOfUser = loginPage.verifyUserIsLoggedInSuccessfully();
        Assert.assertTrue(nameOfUser);
    }
}
