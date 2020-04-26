package ru.chlek.learn.addressbook.appmanager1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperBase1 {
    protected WebDriver wd;

    public HelperBase1(WebDriver wd) {
        this.wd = wd;
    }

    protected void click(By xpath) {
        wd.findElement(xpath).click();
    }

    protected void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }
}
