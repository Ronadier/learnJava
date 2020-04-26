package ru.chlek.learn.addressbook.appmanager1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper1 extends HelperBase1{

    public SessionHelper1(WebDriver wd) {
        super(wd);
    }

    public void login(String username, String password) {
        wd.get("http://localhost/index.php");
        type(By.name("user"), username);
        type(By.name("pass"), password);
        wd.findElement(By.id("LoginForm")).submit();
    }

}
