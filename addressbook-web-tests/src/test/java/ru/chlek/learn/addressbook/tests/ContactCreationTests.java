package ru.chlek.learn.addressbook.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase1{

  @Test
  public void testContactCreation() throws Exception {
    app1.gotoContact();
    app1.createContact(new ContactData("test1", "test2", "test3", "test4", "test5"));
    app1.goHomeAndLogout();
  }

}
