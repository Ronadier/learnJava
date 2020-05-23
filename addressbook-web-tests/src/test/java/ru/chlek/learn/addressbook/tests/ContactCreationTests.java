package ru.chlek.learn.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.chlek.learn.addressbook.model.ContactData;

import java.util.List;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getNavigationHelper().gotoAddContact();
    app.getContactHelper().createContact(new ContactData("test1", "test2", "test3", "test4", "test5"));
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size() + 1);
  }

}
