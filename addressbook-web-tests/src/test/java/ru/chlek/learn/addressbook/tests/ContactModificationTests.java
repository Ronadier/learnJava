package ru.chlek.learn.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.chlek.learn.addressbook.model.ContactData;

import java.util.HashSet;
import java.util.List;

public class ContactModificationTests extends TestBase{
    @Test
    public void testContactDeletion(){
        if (! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("test1", "test2", "test3", "test4", "test5"));
        }
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getNavigationHelper().gotoEditContact(before.size() - 2);
        ContactData contact = new ContactData(before.get(before.size() - 2).getId(),"test1", "test2", "test3", "test4", "test5");
        app.getContactHelper().fillContactForm(contact);
        app.getContactHelper().editContact();
        app.getContactHelper().returnToMainPage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size());

        before.remove(before.size() - 2);
        before.add(contact);
        Assert.assertEquals(new HashSet<>(before), new HashSet<>(after));
    }
}
