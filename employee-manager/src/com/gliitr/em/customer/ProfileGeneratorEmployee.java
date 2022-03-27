package com.gliitr.em.customer;

import com.gliitr.em.emrecords.Employee;

import java.lang.annotation.RetentionPolicy;
import java.util.Random;

public final class ProfileGeneratorEmployee {

    // generate and display e-mail address
    // generate and display password

    public final static String generateEmailaddress(String firstName, String lastName, String deptt){
        return firstName+"_"+lastName+"@"+deptt+"company.com";
    }

    // password generated through internal algorithm

    public final static String generatePassWord(int length) {
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVXYZ";
        String smallLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&*()_<>><?/";
        String seed = capitalLetters + smallLetters + numbers + specialCharacters;
        Ramdom ramdom = new Random();

        if(length < 8){
            throw new IllegalArgumentException("Password length should be a combination of at least 8 charactors");
        }
        char[] password = new char[length];
        for (int i = 0; i<length; i++){
            int randomNumber;
            randomNumber = ramdom.nextInt(seed.length());
            char c = seed.charAt(randomNumber);
            password[i] = c;
                 }
        return String.copyValueOf(password);
    }
    public static void showCredentials(Employee employee){
        System.out.println(" Hi  "+employee.getFirstName() +" "+employee.getLastName()+" your credintials are as under;");
        System.out.println("First name "+employee.getFirstName());
        System.out.println("Last name "+employee.getLastName());
        System.out.println("Email Address: "+employee.getEmailAddress());
        System.out.println("Password: "+employee.getPassWord());

    }
}
