package com.onlinetechvision.test;

/**
 * Created by online09 on 7/6/2017.
 */
public class PersonBean {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return "First NAme "+firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return "lastName"+lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
