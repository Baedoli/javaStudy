package com.javalec;

public class FirstClass {

	public FirstClass() {
		
		SingleTonClass stc = SingleTonClass.getSingleTonClass();
		
		System.out.println("First Claas");
		System.out.println("i = "+stc.getI());;
		stc.setI(200);
		System.out.println("i ="+stc.getI());
		
	}
	
}
