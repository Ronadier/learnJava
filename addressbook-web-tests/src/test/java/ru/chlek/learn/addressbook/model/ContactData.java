package ru.chlek.learn.addressbook.model;

import java.util.Objects;

public class ContactData {
    private final String id;
    private final String firstname;
    private final String lastname;
    private final String address;
    private final String homephone;
    private final String email;

    public ContactData(String id, String firstname, String lastname, String address, String homephone, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.homephone = homephone;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactData that = (ContactData) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(firstname, that.firstname) &&
                Objects.equals(lastname, that.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, lastname);
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "id='" + id + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public ContactData(String firstname, String lastname, String address, String homephone, String email) {
        this.id = null;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.homephone = homephone;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
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
