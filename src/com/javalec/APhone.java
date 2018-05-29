package com.javalec;

public class APhone implements IFunction {

	@Override
	public void callSendReceive() {
		// TODO Auto-generated method stub
		System.out.println("OK..");
	}
	
	@Override
	public void canLte() {
		// TODO Auto-generated method stub
		System.out.println("Not Ok 3G.");
	}
	
	@Override
	public void tvRemoteController() {
		// TODO Auto-generated method stub
		System.out.println("Not include.");
	}
	
}
