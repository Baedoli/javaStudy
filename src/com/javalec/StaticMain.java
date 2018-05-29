package com.javalec;

public class StaticMain {

	public static void main(String[] args) {
		
		FirstChild fc = new FirstChild();
		fc.takeMoney(100);;
		
		SccondChild sc = new SccondChild();
		sc.takeMoney(100);
		
		ThirdChild tc = new ThirdChild();
		tc.takeMoney(100);
		
		System.out.println("PapaPouch Money :" + PapaPouch.money);
		
	}
	
	
}
