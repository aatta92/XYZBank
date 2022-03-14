package com.xyzbank.pageobjects;

import com.xyzbank.base.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends PageObject {
    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "[ng-click='customer()']")
    WebElement customer_loginBtn;

    @FindBy(css = "#userSelect")
    WebElement username_dropDown;

    @FindBy(css = "[class='btn btn-default']")
    WebElement loginBtn;

    @FindBy(css = ".fontBig.ng-binding")
    WebElement name_ofUser;

    @FindBy(css = "[ng-click='manager()']")
    WebElement manager_loginBtn;


    public void customerLogin() {
        customer_loginBtn.click();
        wait_in_seconds(1);
    }

    public void select_user_name() {
        username_dropDown.click();
        Select select = new Select(username_dropDown);
        select.selectByValue("2");
        wait_in_seconds(1);
    }


    public void click_on_login_button() {
        loginBtn.click();
        wait_in_seconds(1);
    }

    public boolean verifyUserIsLoggedInSuccessfully() {
        return name_ofUser.isDisplayed();
    }


    public void manager_login() {
        manager_loginBtn.click();
        wait_in_seconds(1);
    }
}
