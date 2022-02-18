package com.syntax.class09;

public class HW01 {

	public static void main(String[] args) {
		// Create an array of cars and store 6 elements into it. 
		//Using 2 different loops print all values from the array.
		
		String [] cars= {"BMW", "Jeep", "Toyota", "Honda", "Kia", "Tesla"};
		
		for (String car:cars) {
			System.out.print(car+" ");
		}
		System.out.println();
		
		for (int i=0;i<6;i++) {
			System.out.print(cars[i]+" ");
		}
		System.out.println();
		
		
		//Create an array of animals and store 5 elements into it. 
		//Using 2 different loops print all elements from the array.
		
		String [] animals= {"Cat", "Dog", "Ant", "Ribbit", "Hipo"};
		
		for (String animal:animals) {
			System.out.print(animal+" ");
		}
		System.out.println();
		
		for (int a=0;a<5;a++) {
			System.out.print(animals[a]+" ");
		}
		System.out.println();
		
		
		//Create an array on integers and calculate the sum of all elements in an array
		
		int [] nums= {12, 14, 50, 18, 10};
		
		int sum=nums[0]+nums[1]+nums[2]+nums[3]+nums[4];
		System.out.println("The sum is "+sum);
		
		//From an array of integer elements find the largest number.
		
		int largestNum = nums[0];

		for (int b : nums) {
			if (b > largestNum)
				largestNum = b;
		}

		System.out.println("The largest number is " + largestNum);



	}

}
