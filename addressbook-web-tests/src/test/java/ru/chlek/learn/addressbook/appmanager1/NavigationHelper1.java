package ru.chlek.learn.addressbook.appmanager1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper1 {
    private WebDriver wd;

    public NavigationHelper1(WebDriver wd) {

    }

    public void gotoContact() {
      wd.findElement(By.linkText("add new")).click();
    }
}
