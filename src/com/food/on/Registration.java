package com.food.on;

import java.util.Scanner;

public class Registration {

    private static String name;
    private static String phoneNumber;
    private static String address;
    private static String userName;

    // The constructor takes and set the value of the user details.
    public Registration(String name, String phoneNumber, String address) {
        Registration.name = name;
        Registration.phoneNumber = phoneNumber;
        Registration.address = address;
        Registration.userName = generateUserName();
        System.out.println("Hi " + name + " welcome to foodOn your username is " + userName.toLowerCase());
    }

    public Registration() {

    }

    public static void registerUser() {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Input your name: ");
        String name = userInput.nextLine();

        System.out.print("Input your phone number: ");
        String phoneNumber = userInput.nextLine();

        System.out.print("Input your address: ");
        String address = userInput.nextLine();
    }

    public static String getName() {
        return name;
    }

    public static String getPhoneNumber() {
        return phoneNumber;
    }

    public static void setPhoneNumber(String phoneNumber) {
        Registration.phoneNumber = phoneNumber;
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        Registration.address = address;
    }

    private String generateUserName() {
        String nom;
        String nameSuffix = phoneNumber.substring(7);
        nom = name + nameSuffix;
        return nom;
    }
}
