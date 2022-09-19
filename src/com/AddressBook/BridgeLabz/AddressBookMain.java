package com.AddressBook.BridgeLabz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * UC4 -Deleting the Contacts of AddrressBook
 */

public class AddressBookMain {
	
	public static void main(String a[])
	{
		//Created the object of AddressBook class
		AddressBook adressbook= new AddressBook();
		Scanner sc = new Scanner(System.in);
		HashMap<String, AddressBook> addressBookHashMap = new HashMap<>();
		
		while(true)
		{
			System.out.println("\n 1. ADD CONTACTS \n 2. DISPLAY CONTACTS \n 3. UPDATE CONTACTS \n 4. DELETE CONTACTS \n 5.ADD ADDRESSBOOK \n6.DISPLAY ADDRESSBOOK \n 7.EXIT");
			System.out.println("Enter Your Choice :");
			
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				
				System.out.println("Enter The Address Book Name:");
				String addressBookName = sc.next();
                if (!addressBookHashMap.containsKey(addressBookName)){
                    System.out.println("Address book not exists!");
                }
                else {
                    AddressBook addressBook = addressBookHashMap.get(addressBookName);
                    addressBook.addContacts();
                }
               
				break;
				
			case 2:
				System.out.println("Enter The Address Book Name:");
				String addressBookDisplay = sc.next();
                if (!addressBookHashMap.containsKey(addressBookDisplay)){
                    System.out.println("Address book not exists!");
                }
                else {
                    adressbook.displayContacts();
                }
				break;
				
			case 3:
				System.out.println("Enter The Address Book Name:");
				String addressBookUpdate = sc.next();
                if (!addressBookHashMap.containsKey(addressBookUpdate)){
                    System.out.println("Address book not exists!");
                }
                else {
                    adressbook.updateContacts();
                }
               	
				break;
				
			case 4:
				System.out.println("Enter The Address Book Name:");
				String addressBookDelete = sc.next();
                if (!addressBookHashMap.containsKey(addressBookDelete)){
                    System.out.println("Address book not exists!");
                }
                else {
                	adressbook.deleteContacts();
                }
               	
				break;
				
				//Adding Multiple Address Book
			case 5:
				 System.out.println("Enter the Address Book Name : ");
                 String addressName = sc.next();
                 if (addressBookHashMap.containsKey(addressName)){
                     System.out.println("Address book already exists!");
                 }
                 else {
                     AddressBook addressBook = new AddressBook();
                     addressBookHashMap.put(addressName, addressBook);
                 }
				
				break;
				
			case 6:
				 Set<Map.Entry<String, AddressBook>> addressBook = addressBookHashMap.entrySet();
                 if (addressBook.isEmpty()){
                     System.out.println("No address books available!");
                 }
                 for (Map.Entry entry :  addressBook){
                     System.out.println(entry.getKey());
                     AddressBook addBook = (AddressBook) entry.getValue();
                     addBook.displayContacts();
                 }
                 break;
                 	
			case 7:
				System.out.println("Exited...!");
				return;
				
			default:
				System.out.println("Please Enter Valid Choice.....");
				break;	
			}
		}
	}

}
