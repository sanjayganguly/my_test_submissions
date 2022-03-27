package com.gliitr.em.emrecords;

public class Employee {

    private final String firstName;
    private final String lastName;
    private String emailAddress;
    private String passWord;
    private String deptt;

    public Employee(String firstName, String lastName, String deptt) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.deptt = deptt;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getDeptt() {
        return deptt;
    }

    public void setDeptt(String deptt) {
        this.deptt = deptt;
    }
}


