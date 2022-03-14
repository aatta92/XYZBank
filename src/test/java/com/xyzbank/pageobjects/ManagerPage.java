package com.xyzbank.pageobjects;

import com.xyzbank.base.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Queue;

public class ManagerPage extends PageObject {
    public ManagerPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[ng-class='btnClass1']")
    WebElement add_customerLink1;

    @FindBy(css = "[placeholder='First Name']")
    WebElement firstnameField;

    @FindBy(css = "[placeholder='Last Name']")
    WebElement lastnameField;

    @FindBy(css = "[placeholder='Post Code']")
    WebElement zipcodeField;

    @FindBy(css = ".btn.btn-default")
    WebElement add_customer_link2;

    @FindBy(css = "[ng-click='openAccount()']")
    WebElement open_account_link;

    @FindBy(css = "#userSelect")
    WebElement user_select;

    @FindBy(css = "#currency")
    WebElement select_currency;

    @FindBy(css = "[type='submit']")
    WebElement processBtn;

    public void add_customerLink1() {
        add_customerLink1.click();
        wait_in_seconds(1);
    }

    public void add_customer(String fname, String lname, String zipcode) {
        firstnameField.sendKeys(fname);
        lastnameField.sendKeys(lname);
        zipcodeField.sendKeys(zipcode);
    }

    public void click_add_customerBtn() {
        add_customer_link2.click();
        wait_in_seconds(1);
    }

    public String verify_customer_isAdded() {
        return switch_to_alert().getText();
    }

    public void open_account_link() {
        open_account_link.click();
        wait_in_seconds(1);
    }

    public void choose_customer_name_and_currency() {
        user_select.click();
        wait_in_seconds(1);
        Select select = new Select(user_select);
        select.selectByValue("2");
        select_currency.click();
        wait_in_seconds(1);
        Select select1 = new Select(select_currency);
        select1.selectByValue("Dollar");
        wait_in_seconds(1);
    }

    public void click_on_process() {
        processBtn.click();
        wait_in_seconds(1);
    }

    public String verify_user_created_account_successfully() {
        return switch_to_alert().getText();
    }

}
