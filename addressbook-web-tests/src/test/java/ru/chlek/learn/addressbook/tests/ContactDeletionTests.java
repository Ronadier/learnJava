package ru.chlek.learn.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.chlek.learn.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase {
    @Test
    public void testContactDeletion() {
        int before = app.getContactHelper().getContactCount();
        if (! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("test1", "test2", "test3", "test4", "test5"));
        }
        app.getContactHelper().selectContact(before - 1);
        app.getContactHelper().deletionContact();
        app.getContactHelper().returnToMainPage();
        int after = app.getContactHelper().getContactCount();
        System.out.println(before);
        System.out.println(after);
        Assert.assertEquals(after, before - 1);

    }
}
