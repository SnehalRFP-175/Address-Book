package com.AddressBook.BridgeLabz;

/*
 * UC2
 * Ability to create Contacts in Address Book with First and Last Name, Address, City, State
 * Zip Code, Phone Number,Email
 */
import java.util.Scanner;

public class AddressBook extends Contacts
{
	
	Scanner sc = new Scanner(System.in);
	
	//add methode for Adding new Contact
		public void addDetails()
		{
			Contacts contact = new Contacts();
			
			contactDetails();			
		}
		
		public void display()
		{
			System.out.println(toString());
		}
}		