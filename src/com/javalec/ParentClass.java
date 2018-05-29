package com.javalec;

public class ParentClass {

	public String pStr = "부모 클래스";
	public String pName1;
	public String pName2;
	
	public ParentClass() {
		// TODO Auto-generated constructor stub
		
	}

	public String getPapaName() {
		// TODO Auto-generated method stub
		pName1 = "아버지 : 배종식";
		
		return pName1;
	}
	
	public String getMamiName() {
		// TODO Auto-generated method stub

		pName2 = "어버니 : 이인자";
		
		return pName2;

	}
	
	
}
