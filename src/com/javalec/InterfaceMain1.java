package com.javalec;

public class InterfaceMain1 {

	
	public static void main(String[] args) {

		IFunction aPhone = new APhone();
		IFunction bPhone = new BPhone();
		IFunction cPhone = new CPhone();
		
		int[] iArr = { 10,20,30 };
		
		IFunction[] iFunctions = {aPhone, bPhone, cPhone};
		
		
		for (int i=0; i<iFunctions.length; i++) {
			iFunctions[i].callSendReceive();
			iFunctions[i].canLte();
			iFunctions[i].tvRemoteController();
			System.out.println("**************************************");
		}
		
	}
	
	
}
