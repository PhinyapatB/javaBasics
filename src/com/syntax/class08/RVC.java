package com.syntax.class08;

public class RVC {

	public static void main(String[] args) {

		String userName = "Phiny";
		String password = "pass1234";
		if (userName.equals("Phiny") && password.equals("pass1234")) {
			System.out.println("Welcome back " + userName);
		} else {
			System.out.println("Username or password is not correct");
		}
	}

}
