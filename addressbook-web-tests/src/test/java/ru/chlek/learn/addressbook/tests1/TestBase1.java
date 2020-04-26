package ru.chlek.learn.addressbook.tests1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.chlek.learn.addressbook.appmanager1.ApplicationManager1;

public class TestBase1 {

    protected final ApplicationManager1 app1 = new ApplicationManager1();

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        app1.init();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        app1.stop();
    }
}
