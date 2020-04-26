package ru.chlek.learn.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.chlek.learn.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

  public void fillContactForm(ContactData contactData) {
      type(By.name("firstname"), contactData.getFirstname());
      type(By.name("lastname"), contactData.getLastmane());
      type(By.name("address"), contactData.getAddress());
      type(By.name("home"), contactData.getHomephone());
      type(By.name("email"), contactData.getEmail());
  }

    public void editContact() {
        click(By.name("update"));
    }

    public void submitContactCreation() {
        click(By.xpath("(//input[@name='submit'])[2]"));
    }

    public void deletionContact() {
        click(By.name("selected[]"));
        click(By.xpath("//input[@value='Delete']"));
        wd.switchTo().alert().accept();
    }
}
