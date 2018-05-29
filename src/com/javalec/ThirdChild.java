package com.javalec;

public class ThirdChild {

	public ThirdChild() {
		// TODO Auto-generated constructor stub
	}
	
	public void takeMoney(int money) {
		
		PapaPouch.money = PapaPouch.money - money;
		
		if (PapaPouch.money < 0) {
			System.out.println("잔고가 부족 합니다.");
		}
		
		
	}
	
	
}
