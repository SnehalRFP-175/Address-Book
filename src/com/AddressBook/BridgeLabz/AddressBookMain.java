package com.AddressBook.BridgeLabz;

/*
 * UC 2- Adding new Contacts to Address Book
 */
public class AddressBookMain {
	
	public static void main(String a[])
	{
		//Created the object of AddressBook class
		AddressBook addressbook= new AddressBook();
		
		addressbook.addDetails();
		addressbook.display();
	}

}
