package ru.chlek.learn.addressbook.tests1;

import org.openqa.selenium.By;
import org.testng.annotations.*;
import ru.chlek.learn.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase1{

  @Test
  public void testContactCreation() throws Exception {
    app1.getNavigationHelper1().gotoContact();
    app1.getContactHelper().createContact(new ContactData("test1", "test2", "test3", "test4", "test5"), By.xpath("(//input[@name='submit'])[2]"));
    app1.goHomeAndLogout();
  }

}
