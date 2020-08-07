package com.company;// tutorial reference: https://www.youtube.com/watch?v=U3Ibvu0htNs

import java.util.Scanner;

public class Email {
    private static String company = "habitBook";
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String companyEmail;

    // constructor to receive first name and last name
    public Email (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Creating email for " + firstName + " " + lastName + "...");

        this.department = setDepartment();
        this.password = genRandomPass(10);
        this.companyEmail = setCompanyEmail();
    }

    // ask user input for department
    private String setDepartment() {
        System.out.print("Enter your department: ");
        Scanner in = new Scanner(System.in);
        String input = in.next();
        if (input.isEmpty()) {
            System.out.println("Department cannot be empty.");
            return setDepartment();
        } else {
            return input;
        }
    }

    // generate random password
    private String genRandomPass(int passLength) {
        String CHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        char[] password = new char[passLength];
        for (int i = 0; i < passLength; i++) {
            int randIndex = (int) (Math.random() * CHARS.length());
            password[i]  = CHARS.charAt(randIndex);
        }
        return new String(password);
    }

    // set companyEmail
    private String setCompanyEmail() {
        // format: firstname_lastname@department.company.com
        return (firstName + "_" + lastName + "@" + department + "." + company + ".com").toLowerCase();
    }


    // get user data
    public void displayUserData() {
        System.out.println("Company: " + this.company);
        System.out.println("First name: " + this.firstName);
        System.out.println("Last name: " + this.lastName);
        System.out.println("Department: " + this.department);
        System.out.println("Password: " + this.password);
        System.out.println("Company email: " + this.companyEmail);
    }
}
