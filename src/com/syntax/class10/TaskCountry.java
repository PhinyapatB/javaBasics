package com.syntax.class10;

public class TaskCountry {

	public static void main(String[] args) {
		
		////create an array of countries. while retrieving all values from an array print capital of each country.
		
		String[] countries= {"Thailand", "Japan", "United Kingdom", "Russia", "France"};
		String capital = null;
		
		for(int i=0;i<countries.length;i++) {
			
			switch (countries[i]) {
			
			  case "Thailand":
				  capital="Bangkok";
				  break;
			  case "Japan":
				  capital="Tokyo";
				  break;  
			  case "United Kingdom":
				  capital="London";
				  break;
			  case "Russia":
				  capital="Moscow";
				  break;
			  case "France":
				  capital="Paris";
				  break;
				  
			}
			
			System.out.println("The capital of country "+countries[i]+" is "+capital);
		}

	}

}
