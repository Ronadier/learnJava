package ru.chlek.learn.addressbook.appmanager1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.chlek.learn.addressbook.model.ContactData;

public class ContactHelper extends HelperBase1 {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

  public void createContact(ContactData contactData, By locator) {
      type(By.name("firstname"), contactData.getFirstname());
      type(By.name("lastname"), contactData.getLastmane());
      type(By.name("address"), contactData.getAddress());
      type(By.name("home"), contactData.getHomephone());
      type(By.name("email"), contactData.getEmail());
      click(locator);
  }

}
