package com.xyzbank.pageobjects;

import com.xyzbank.base.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends PageObject {
    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".borderM.box.padT20")
    WebElement homepage_container;


    public String mainLinksUpload() {
        return homepage_container.getText();
    }
}
