package com.blz.addressBook;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class AddressBookMain {
   static Set<PersonContact> addressBook = new HashSet<>();
    public static void main(String[] args) {
        AddressBookMain addressBookMain = new AddressBookMain();
        System.out.println("Welcome to address book program ");
        addressBook.add(addressBookMain.consolInput());
        addressBook.add(addressBookMain.consolInput());
        addressBook.add(addressBookMain.consolInput());

        addressBookMain.displaypPersionDetails();
    }
    public  PersonContact consolInput() {
        Scanner sc = new Scanner(System.in);
        PersonContact personDetail = new PersonContact();
        System.out.println("Enter a first Name");
       personDetail.firstName = sc.next();
        System.out.println("first name: " +personDetail.firstName);
        System.out.println("Enter a Last name");
        personDetail.lastName = sc.next();
        System.out.println("last namre: " +personDetail.lastName);
        System.out.println("enter a city");
        personDetail.city = sc.next();
        System.out.println("city: " +personDetail.city);
        System.out.println("enter a state");
        personDetail.state = sc.next();
        System.out.println("state: " +personDetail.state);
        sc.nextLine();
        System.out.println("Enter a Address");
        personDetail.address = sc.nextLine();
        System.out.println("address: " +personDetail.address);
        System.out.println("enter a zip code");
        personDetail.zip = sc.nextInt();
        System.out.println("zip: " +personDetail.zip);
        System.out.println("Enter a Phone number");
        personDetail.phoneNumber = sc.nextLong();
        System.out.println("phone number: " +personDetail.phoneNumber);
      return personDetail;
    }

     public void displaypPersionDetails(){
         for (PersonContact persioDetail : addressBook) {
             System.out.println(persioDetail);
         }
     }
}

class PersonContact {
    public String firstName;
    public String lastName;
    public    String city;
    public    String state;
    public    String address;
    public    int zip;
    public    long phoneNumber;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonContact)) return false;
        PersonContact contact = (PersonContact) o;
        return phoneNumber == contact.phoneNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber);
    }

    @Override
    public String toString() {
        return "PersonContact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", address='" + address + '\'' +
                ", zip=" + zip +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}

