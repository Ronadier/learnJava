package ru.chlek.learn.addressbook.tests;

import org.testng.annotations.Test;
import ru.chlek.learn.addressbook.model.ContactData;

public class ContactEditionTests extends TestBase{
    @Test
    public void testContactDeletion(){
        app.getNavigationHelper().gotoEditContact();
        app.getContactHelper().fillContactForm(new ContactData("test1", "test2", "test3", "test4", "test5"));
        app.getContactHelper().editContact();
    }
}
