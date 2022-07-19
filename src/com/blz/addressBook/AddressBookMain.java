package com.blz.addressBook;

import java.util.Scanner;

public class AddressBookMain {
    public static String firstName;
    public static String lastName;
    public static String city;
    public static String state;
    public static String address;
    public static int zip;
    public static long phoneNumber;

    public static void main(String[] args) {
        System.out.println("Welcome to address book program ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first Name");
        firstName = sc.next();
        System.out.println("first name: " + firstName);
        System.out.println("Enter a Last name");
        lastName = sc.next();
        System.out.println("last namre: " + lastName);
        System.out.println("enter a city");
        city = sc.next();
        System.out.println("city: " + city);
        System.out.println("enter a state");
        state = sc.next();
        System.out.println("state: " + state);
        sc.nextLine();
        System.out.println("Enter a Address");
        address = sc.nextLine();
        System.out.println("address: " + address);
        System.out.println("enter a zip code");
        zip = sc.nextInt();
        System.out.println("zip: " + zip);
        System.out.println("Enter a Phone number");
        phoneNumber = sc.nextLong();
        System.out.println("phone number: " + phoneNumber);

    }
}
