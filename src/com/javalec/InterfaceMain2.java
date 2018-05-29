package com.javalec;

public class InterfaceMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Actress actress = new Actress();
		actress.canCatchCriminal();
		actress.canSearch();
		actress.outFire();
		actress.saveMan();
		actress.makePizza();
		actress.makeSpaghetti();
		
		PoliceMan actressP = new Actress();
		actressP.canCatchCriminal();
		actressP.canSearch();
		
		FireFighter actressF = new Actress();
		actressF.outFire();
		actressF.saveMan();
		
		Chef actressC = new Actress();
		actressC.makePizza();
		actressC.makeSpaghetti();

	}

}
