package Module3;

import java.util.Scanner;

public class Contact 
{
    String contactID;
    String firstName;
    String lastName;
    String address;
    String number;

    public static void main(String[] args) 
    {
        
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter Contact ID: ");
        String contactID = scanner1.nextLine();

        if(contactID == null) 
        {
            System.out.println("Re-enter ID: ");
        } else if(contactID.length() <= 10){
            System.out.println(contactID);
        } else {
            System.out.println("Entry is not valid! Please re-enter");
        }
        
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter your First Name: ");
        String firstName = scanner2.nextLine();

        if(firstName == null) 
        {
            System.out.println("Please Re-enter first name!");
        } else if(firstName.length() <= 10) 
        {
            System.out.println(firstName);

        } else {
            System.out.println("Use a nickname! :) ");
        }
        
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter your Last Name");
        String lastName = scanner3.nextLine();

        if(lastName == null) 
        {
            System.out.println("Please Re-enter last name!");
        } else if(lastName.length() <= 10) 
        {
            System.out.println(lastName);

        } else {
            System.out.println("Your last name is to long! :)");
        }

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Enter your Address: ");
        String address = scanner4.nextLine();

        if(address == null) 
        {
            System.out.println("Please Re-enter Address!");
        } else if(address.length() <= 30) 
        {
            System.out.println(address);

        } else {
            System.out.println("Your address is to long! :)");


            
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Enter your Phone Number: ");
        String number = scanner5.nextLine();

        if(number == null) 
        {
            System.out.println("Please Re-enter Number!");
        } else if(number.length() != 10) 
        {
            System.out.println("Not valid number");

        } else {
            System.out.println(number);
        }
    
    }

    }
}
/*


The contact object shall have a required unique contact ID string that cannot be longer than 10 characters. The contact ID shall not be null and shall not be updatable.
The contact object shall have a required firstName String field that cannot be longer than 10 characters. The firstName field shall not be null.
The contact object shall have a required lastName String field that cannot be longer than 10 characters. The lastName field shall not be null.
The contact object shall have a required phone String field that must be exactly 10 digits. The phone field shall not be null.
The contact object shall have a required address field that must be no longer than 30 characters. The address field shall not be null.

*/