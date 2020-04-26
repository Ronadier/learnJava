package ru.chlek.learn.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase{

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void gotoGroupPage() {
      click(By.linkText("groups"));
    }
    public void gotoAddContact() {
        click(By.linkText("add new"));
    }

    public void gotoEditContact() {
        click(By.xpath("//img[@alt='Edit']"));
    }
}
