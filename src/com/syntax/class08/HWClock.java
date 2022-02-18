package com.syntax.class08;

public class HWClock {

	public static void main(String[] args) {
		
		for(int hour=0;hour<=23;hour++) {
			for(int min=0;min<=59;min++) {
				for(int sec=0;sec<=59;sec++) {
					System.out.println(hour+":"+min+":"+sec);
				}
			}
		}

	}

}
