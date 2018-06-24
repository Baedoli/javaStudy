package com.javalec;

public class SecondClass {

	public SecondClass() {
		
		SingleTonClass stc = SingleTonClass.getSingleTonClass();
		System.out.println("Second Class");
		System.out.println("i ="+stc.getI());
		
	}
	
}
