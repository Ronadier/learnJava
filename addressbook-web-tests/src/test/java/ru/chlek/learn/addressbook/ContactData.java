package ru.chlek.learn.addressbook;

public class ContactData {
    private final String firstname;
    private final String lastmane;
    private final String address;
    private final String homephone;
    private final String email;

    public ContactData(String firstname, String lastmane, String address, String homephone, String email) {
        this.firstname = firstname;
        this.lastmane = lastmane;
        this.address = address;
        this.homephone = homephone;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastmane() {
        return lastmane;
    }

    public String getAddress() {
        return address;
    }

    public String getHomephone() {
        return homephone;
    }

    public String getEmail() {
        return email;
    }
}
