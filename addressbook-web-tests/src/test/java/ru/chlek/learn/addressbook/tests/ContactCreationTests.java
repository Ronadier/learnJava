package ru.chlek.learn.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.chlek.learn.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getNavigationHelper().gotoContact();
    app.getContactHelper().createContact(new ContactData("test1", "test2", "test3", "test4", "test5"), By.xpath("(//input[@name='submit'])[2]"));
  }

}
