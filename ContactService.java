package Module3;

import java.util.Scanner;

public class ContactService 
{
    String firstName;
    String lastName;
    String address;
    String number;

    public static void main(String[] args) 
    {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter your First Name: ");
        String firstName = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter your Last Name");
        String lastName = scanner2.nextLine();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter in your address: ");
        String address = scanner3.nextLine();

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Enter Phone Number: ");
        String number = scanner4.nextLine();

        System.out.println("Name is: " +  firstName + " " + lastName);
        
        System.out.println("Your address is: " + address);

        System.out.println("Your Phone number is: " + number);

    }
}


/*

The contact service shall be able to add contacts with a unique ID.
The contact service shall be able to delete contacts per contact ID.
The contact service shall be able to update contact fields per contact ID. The following fields are updatable:
firstName
lastName
Number
Address

*/