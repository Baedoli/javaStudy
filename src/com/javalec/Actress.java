package com.javalec;

public class Actress implements PoliceMan, FireFighter, Chef {
	
	@Override
	public void makePizza() {
		// TODO Auto-generated method stub
		System.out.println("can make pizza");
	}
	
	@Override
	public void makeSpaghetti() {
		// TODO Auto-generated method stub
		System.out.println("can make Spaghetti");
	}
	
	@Override
	public void outFire() {
		// TODO Auto-generated method stub
		System.out.println("can Fire Stop");
	}
	
	@Override
	public void saveMan() {
		// TODO Auto-generated method stub
		System.out.println("Can Save Man!!");
	}
	
	@Override
	public void canCatchCriminal() {
		// TODO Auto-generated method stub
		System.out.println("Can catch Criminal !!");
	}
	
	@Override
	public void canSearch() {
		// TODO Auto-generated method stub
		System.out.println("Can Search goods!!");
	}
	

}
