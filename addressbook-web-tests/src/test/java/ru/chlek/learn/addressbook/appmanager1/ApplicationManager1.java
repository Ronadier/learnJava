package ru.chlek.learn.addressbook.appmanager1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager1 {
    protected WebDriver wd;

    private SessionHelper1 sessionHelper1;
    private NavigationHelper1 navigationHelper1;
    private ContactHelper contactHelper;

    public void init() {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        contactHelper = new ContactHelper(wd);
        navigationHelper1 = new NavigationHelper1(wd);
        sessionHelper1 = new SessionHelper1(wd);
        sessionHelper1.login("admin", "secret");
    }

    public void goHomeAndLogout() {
      wd.findElement(By.linkText("home")).click();
      wd.findElement(By.linkText("Logout")).click();
    }

    public void stop() {
        wd.quit();
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }

    public NavigationHelper1 getNavigationHelper1() {
        return navigationHelper1;
    }
}
