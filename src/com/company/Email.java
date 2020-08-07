package com.company;// tutorial reference: https://www.youtube.com/watch?v=U3Ibvu0htNs

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    static {
        String company = "habitBook";
    }

    // constructor to receive first name and last name
    public Email (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Creating email for " + firstName + " " + lastName + "...");

        // ask for department and return department
        setDepartment();
    }

    // ask for department
    private void setDepartment() {
        System.out.print("Enter your department: ");
        Scanner in = new Scanner(System.in);
        this.department = in.next();
    }

    // generate random password

    // set mailbox capacity

    // set alternate email

    // change password

    // get user data
}
