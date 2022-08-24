package com.AddressBook.BridgeLabz;

public class Contacts {
	
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private long zipCode;
	private long phoneNumber;
	private String email;
	
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public String getLastName()
	{
		return lastName;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getAddress()
	{
		return address;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	public String getCity()
	{
		return city;
	}
	
	public void setState(String state)
	{
		this.state = state;
	}
	public String getState()
	{
		return state;
	}
	public void setZip(long zipCode)
	{
		this.zipCode = zipCode;
	}
	public long getzip()
	{
		return zipCode;
	}
	
	public void setPhoneNumber(long phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	public long getPhoneNumber()
	{
		return phoneNumber;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getEmail()
	{
		return email;
	}
	
}