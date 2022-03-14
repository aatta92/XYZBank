package com.xyzbank.base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class PageObject {
    protected WebDriver driver;

    protected PageObject(WebDriver theDriver) {
        driver = theDriver;
    }


    protected void wait_in_seconds(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Alert switch_to_alert() {

        return driver.switchTo().alert();
    }

}
