package com.AddressBook.BridgeLabz;

import java.util.Scanner;

/*
 * UC 3- Updating the Contacts of Address Book
 */
public class AddressBookMain {
	
	public static void main(String a[])
	{
		//Created the object of AddressBook class
		AddressBook adressbook= new AddressBook();
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("\n 1. ADD CONTACTS \n 2. DISPLAY CONTACTS \n 3. UPDATE CONTACTS \n 4. EXIT");
			System.out.println("Enter Your Choice :");
			
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				adressbook.addContacts();
				break;
				
			case 2:
				adressbook.displayContacts();
				break;
				
			case 3:
				adressbook.updateContacts();
				break;
				
			case 4:
				System.out.println("Exited...!");
				return;
				
			default:
				System.out.println("Please Enter Valid Choice.....");
				break;	
			}
		}
	}

}
