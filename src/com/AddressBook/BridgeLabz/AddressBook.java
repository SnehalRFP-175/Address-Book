package com.AddressBook.BridgeLabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.Serializable;
import java.util.HashMap;

public class AddressBook 
{
	
	Scanner sc = new Scanner(System.in);
	
	static ArrayList<Contacts> contactList = new ArrayList<>();
	
	
	//add methode for Adding new Contact
	public void addContacts()
	{
		System.out.println("Enter the Number of Contacts You Want to Add :");
		int num=sc.nextInt();
		
		for(int i = 0 ; i < num ; i++)
		{
			
			Contacts contact = new Contacts(); //Local Object
			System.out.println("Hash Code :" +contact.hashCode());
			
			contact.contactDetails();	
			contactList.add(contact);
		}

	}
	
	// display method to display all contact details
	public void displayContacts()
	{
		for (int i = 0; i < contactList.size(); i++) {
			
			 Contacts contact = contactList.get(i);
			 System.out.println("Hash Code :" +contact.hashCode());
			 System.out.println(contact.toString());
			 
	        }
	}
	
	
	//update method to update the contacts details
	  public void updateContacts()
	{
		System.out.println("Enter Name to Update the Information :");
		String firstName = sc.next();
		boolean isAvailable = false;
		
		for (Contacts contact : contactList) {
			
			  if(contact.getFirstName().equals(firstName))
			  { 
				  while(true)
				{
				  isAvailable = true;
				  System.out.println(" 1. First Name \n 2. Last Name \n 3. Address \n 4. City \n 5. State \n 6. Zip Code \n 7. Mobile Number \n 8. Email Id \n 9. ALL \n 10. EXIT");
				  System.out.println("What you want to edit :");
				  
				  int ch = sc.nextInt(); 
				
				  switch(ch)
				  {
				  case 1:
					  System.out.println("\nEnter First Name :");
					  contact.setFirstName(sc.next());
					  break;
					  
				  case 2:
					  System.out.println("Enter Last Name :");
					  contact.setLastName(sc.next());
					  break;
					  
				  case 3:
					  System.out.println("Enter Your Address :");
					  contact.setAddress(sc.next());
					  break;
					  
				  case 4:
					  System.out.println("Enter Your City:");
					  contact.setCity(sc.next());
					  break;
					  
				  case 5:
					  System.out.println("Enter State :");
					  contact.setState(sc.next());
					  break;
					  
				  case 6:
					  System.out.println("Enter Zip Code :");
					  contact.setZip(sc.next());
					  break;
					  
				  case 7:
					  System.out.println("Enter Mobile Number :");
					  contact.setPhoneNumber(sc.next());
					  break;
					  
				  case 8:
					  System.out.println("Enter Email Id :");
					  contact.setEmail(sc.next());
					  break;
					  
				  case 9:
					  contact.contactDetails();
					  System.out.println("Updated Sucessfully....!");
					  return;
					  
				  case 10:
					  System.out.println("Exited...!");
					  return;
					  
				  default:
					  System.out.println("Enter valid Choice..!");
					  break;
						  
				  }
				  System.out.println("Updated Sucessfully....!");
			  }	
		}
	}
		 if( !isAvailable )
		  {
			  System.out.println("Contact Not Available....!");
		  }
		
		
	}
	  
	 //delete method to delete the contacts
	  public void deleteContacts()
		{
			System.out.println("Enter Name to Update the Information :");
			String firstName = sc.next();
			boolean isAvailable = false;
			
			for (Contacts contact : contactList) {
				 if(contact.getFirstName().equals(firstName))
				  { 
					 isAvailable = true;
					 contactList.remove(contact);
					 System.out.println("Deleted Sucessfully....!");
					 break;
				  }
			}
			
			if( !isAvailable )
			  { 
				 System.out.println("Contact Not Available....!");
			  }
		}
	  
	  public List<Contacts> getContactList(){
	        return contactList;
	    }
	  
	  
	  /*
	   * Checking Duplicate Value
	   */
	  public boolean isDuplicate(String firstName, String lastName){
	         boolean result = contactList.stream().filter(contact -> contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)).count() > 0;
	         return result;
	     }
	  
	  /*
	   * Search Person in City or State Across the Multiple
	   */
	  public void searchByCityOrState()
	  {
		  System.out.println("Enter the City or State:");
		  String location =sc.next();
		  contactList.stream().forEach(contact -> {
	             if (contact.getCity().equals(location) || contact.getState().equals(location)){
	                 System.out.println(contact);
	             }
	         });
	     }
	  
	 
} 
	

