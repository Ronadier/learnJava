package ru.chlek.learn.addressbook.tests;

import org.testng.annotations.*;
import ru.chlek.learn.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {
  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
    app.logout();
  }
}