package ru.chlek.learn.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.chlek.learn.addressbook.model.ContactData;

import java.util.List;

public class ContactDeletionTests extends TestBase {
    @Test
    public void testContactDeletion() {
        if (! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("test1", "test2", "test3", "test4", "test5"));
        }
        List<ContactData> before = app.getContactHelper().getContactList();
        System.out.println(before.size());
        app.getContactHelper().selectContact(before.size() - 2);
        app.getContactHelper().deletionContact();
        app.getContactHelper().returnToMainPage();
        List<ContactData> after = app.getContactHelper().getContactList();
        System.out.println(before.size());
        System.out.println(after.size());
        Assert.assertEquals(after.size(), before.size() - 1);

        before.remove(before.size() - 2);
        Assert.assertEquals(before, after);

    }
}
