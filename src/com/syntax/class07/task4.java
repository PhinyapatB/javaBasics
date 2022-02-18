package com.syntax.class07;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		int secretNumber=12;
		Scanner scan=new Scanner(System.in);
		int guessNumber;
		
		do {
			System.out.println("Please enter a number to win");
			guessNumber=scan.nextInt();
		}while(guessNumber==secretNumber);

	}

}
