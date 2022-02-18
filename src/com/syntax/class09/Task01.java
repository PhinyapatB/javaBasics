package com.syntax.class09;

public class Task01 {

	public static void main(String[] args) {
		
		int [] price=new int[4];
		price[0]=5;
		price[1]=12;
		price[2]=15;
		price[3]=8;
		
		System.out.println((price[0]+price[1]+price[2]+price[3])/4);
		
				
		// Create an array of chars and store grades into it: A,B,C,D,E,F. 
	    //Then print a grade B (use 2 different ways of creating an array).
		
		char[] grade=new char[6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		System.out.println("Grade is "+grade[1]);
		System.out.println("-------------------------");
		
		char[] grade2= {'A', 'B', 'C', 'D', 'E', 'F'};
		System.out.println("Grade is "+grade2[1]);
		
		//Create an array of names and store all names of your group. 
		//Then print your name from that array. (use 2 different ways of creating an array).
		
		String[] name= new String[5];
		name[0]="May";
		name[1]="June";
		name[2]="Summer";
		name[3]="April";
		name[4]="Sunny";
		
		System.out.println(name[0]);
		System.out.println("-------------------------");
		
		String[] name2= {"May", "June", "Summer", "April", "Sunny"};
		System.out.println(name[0]);
		
		//Create an array of words: Java, Saturday, day, coding, is. 
		//Print the following sentence using elements of array: “Saturday is Java coding Day”. 
		
		String[] word=new String[4];
		word[0]="Java";
		word[1]="Saturday";
		word[2]="Day";
		word[3]="coding";
		
		System.out.println(word[1]+" is "+word[0]+" "+word[3]+" "+word[2]);
		
		
		

		
	}

}
