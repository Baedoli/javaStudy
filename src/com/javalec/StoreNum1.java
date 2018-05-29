package com.javalec;

public class StoreNum1 extends HeadQuarterStore {

	public StoreNum1() {
		// TODO Auto-generated constructor stub
		System.out.println("매장 1호점 메뉴 입니다.");
	}
	
	@Override
	public void ordKimchi() {
		// TODO Auto-generated method stub
	   System.out.println("4500원");	
	}
	
	@Override
	public void ordBuDae() {
		// TODO Auto-generated method stub
	    System.out.println("5000원");	
	}
	
	@Override
	public void ordBiBim() {
		// TODO Auto-generated method stub
		System.out.println("6000원");
	}
	
	@Override
	public void ordSunDae() {
		// TODO Auto-generated method stub
		System.out.println("판매하지 않음");
	}
	
	@Override
	public void ordGongGi() {
		// TODO Auto-generated method stub
		System.out.println("1000원");
	}
}
