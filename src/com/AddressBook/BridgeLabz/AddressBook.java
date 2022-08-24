package com.AddressBook.BridgeLabz;

/*
 * UC1_
 * Ability to create Contacts in Address Book with First and Last Name, Address, City, State
 * Zip Code, Phone Number,Email
 */
import java.util.Scanner;

public class AddressBook extends Contacts
{
	public void addDetails()
	{
		Contacts contact = new Contacts();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Name :");
		contact.setFirstName(sc.next());
		
		System.out.println("Enter Last Name :");
		contact.setLastName(sc.next());
		
		System.out.println("Enter Your Address :");
		contact.setAddress(sc.next());
		
		System.out.println("Enter Your City:");
		contact.setCity(sc.next());
		
		System.out.println("Enter State :");
		contact.setState(sc.next());
		
		System.out.println("Enter Zip Code :");
		contact.setZip(sc.nextLong());
		
		System.out.println("Enter Mobile Number :");
		contact.setPhoneNumber(sc.nextLong());
		
		System.out.println("Enter Email Id :");
		contact.setEmail(sc.next());
	}
	
	public static void main(String a[])
	{
		AddressBook addressBook = new AddressBook();
		addressBook.addDetails();
		
	}
	
	
	

}