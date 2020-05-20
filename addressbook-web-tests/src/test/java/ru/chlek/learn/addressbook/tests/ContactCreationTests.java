package ru.chlek.learn.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.chlek.learn.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    int before = app.getContactHelper().getContactCount();
    app.getNavigationHelper().gotoAddContact();
    app.getContactHelper().createContact(new ContactData("test1", "test2", "test3", "test4", "test5"));
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before + 1);
  }

}
