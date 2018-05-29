package com.javalec;

public class AirPlaneToyClass implements Missile, Light {

	public AirPlaneToyClass() {
		// TODO Auto-generated constructor stub
		System.out.println("비행기 장난감 입니다.");
		canMissile();
		canLight();
		System.out.println("**********************************");
	}
	
	@Override
	public void canMissile() {
		// TODO Auto-generated method stub
		System.out.println("미사일을 발사 할 수 있습니다.");
	}
	
	@Override
	public void canLight() {
		// TODO Auto-generated method stub
		System.out.println("불빛을 발사 할 수 있습니다.");
	}
	
}
