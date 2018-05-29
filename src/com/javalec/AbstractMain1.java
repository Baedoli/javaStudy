package com.javalec;

public class AbstractMain1 {

	public static void main(String[] args) {
		
		LunchMenu child1 = new Child1(PriceTable.RICE, PriceTable.BULGOGI, PriceTable.BANANA, PriceTable.MILK, PriceTable.ALMOND);
		LunchMenu child2 = new Child2(PriceTable.RICE, PriceTable.BULGOGI, PriceTable.BANANA, PriceTable.MILK, PriceTable.ALMOND);
		
		System.out.println("1번 아이의 식대는 :"+child1.calculating());
		System.out.println("2번 아이의 식대는 :"+child2.calculating());
		
	}
	
	
	
}
