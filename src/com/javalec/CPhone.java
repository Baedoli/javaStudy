package com.javalec;

public class CPhone implements IFunction {

	@Override
	public void callSendReceive() {
		// TODO Auto-generated method stub
		System.out.println("OK.");
	}
	
	@Override
	public void canLte() {
		// TODO Auto-generated method stub
		System.out.println("OK 4G Lte");
	}
	
	@Override
	public void tvRemoteController() {
		// TODO Auto-generated method stub
		System.out.println("Not Ok.");
	}
	
}
