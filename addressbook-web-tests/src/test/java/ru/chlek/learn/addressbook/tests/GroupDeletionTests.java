package ru.chlek.learn.addressbook.tests;

import org.testng.annotations.Test;
import ru.chlek.learn.addressbook.model.GroupData;

public class GroupDeletionTests extends TestBase{
  @Test
  public void testGroupDeletion() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    if (! app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup(new GroupData("test1", null, null));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroup();
    app.getGroupHelper().returnToGroupPage();
  }

}
