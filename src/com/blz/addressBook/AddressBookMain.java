package com.blz.addressBook;

import java.util.*;

public class AddressBookMain {
    List<PersonContact> addressBook = new ArrayList<>();
    String persionName;

    public static void main(String[] args) {
        AddressBookMain addressBookMain = new AddressBookMain();
        System.out.println("Welcome to address book program ");
        int option;
        do {
            System.out.println("1.AddContac\n2.editContact\n3.display\n4.exit");
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Add a contact");
                    addressBookMain.addContact();
                    break;
                case 2:
                    System.out.println("edit contact");
                    addressBookMain.editPersionContact(addressBookMain.addressBook);
                    break;
                case 3:
                    addressBookMain.displaypPersionDetails();
                    break;
                default:
                    System.out.println("choose from menue");
                    break;
            }

        } while (option != 4);
    }

    public PersonContact consolInput() {
        Scanner sc = new Scanner(System.in);
        PersonContact personDetail = new PersonContact();
        System.out.println("Enter a first Name");
        personDetail.firstName = sc.next();
        System.out.println("first name: " + personDetail.firstName);
        System.out.println("Enter a Last name");
        personDetail.lastName = sc.next();
        System.out.println("last namre: " + personDetail.lastName);
        System.out.println("enter a city");
        personDetail.city = sc.next();
        System.out.println("city: " + personDetail.city);
        System.out.println("enter a state");
        personDetail.state = sc.next();
        System.out.println("state: " + personDetail.state);
        sc.nextLine();
        System.out.println("Enter a Address");
        personDetail.address = sc.nextLine();
        System.out.println("address: " + personDetail.address);
        System.out.println("enter a zip code");
        personDetail.zip = sc.nextInt();
        System.out.println("zip: " + personDetail.zip);
        System.out.println("Enter a Phone number");
        personDetail.phoneNumber = sc.nextLong();
        System.out.println("phone number: " + personDetail.phoneNumber);
        return personDetail;
    }

    public void addContact() {
        addressBook.add(consolInput());
    }

    public void displaypPersionDetails() {
        for (PersonContact persioDetail : addressBook) {
            System.out.println(persioDetail);
        }
    }

    public void editPersionContact(List<PersonContact> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name");
        String persionName = scanner.next();
        getPersionContact(persionName, list);
    }

    public void getPersionContact(String persionName, List<PersonContact> list) {
        for (int i = 0; i < list.size(); i++) {
            if (persionName.equals(list.get(i).firstName)) {
                list.remove(i);
                list.add(i, consolInput());
            } else
                System.out.println("contact not available");
        }
    }
}

class PersonContact {
    public String firstName;
    public String lastName;
    public String city;
    public String state;
    public String address;
    public int zip;
    public long phoneNumber;

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

