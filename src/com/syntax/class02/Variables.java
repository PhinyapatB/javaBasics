package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		
		String name= "Phinyapat";
		String lastName= "Booranakool";
		char grade='B';
		String city= "Bunker Hill";
		String state= "WV";
		String phoneNumber= "450-999-9999";
		
		System.out.println("My name is "+name+" and my last name is "+lastName);
		System.out.println("I am "+grade+" student");
		System.out.println("I live in city "+city+" and state "+state);
		System.out.println("And my phone number is "+phoneNumber);
		
		grade='A';
		city= "Winchester";
		state= "VA";
		phoneNumber= "450-555-5555";
		
		System.out.println("My name is "+name+" and I moved to new city "+city+" and new state "+state+".");
		System.out.println("My new phone number is "+phoneNumber);
		
	}

}
