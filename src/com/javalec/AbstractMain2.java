package com.javalec;

public class AbstractMain2 {
	
	public static void main(String[] args) {
		
		StarCar car1 = new StarCarLowGrade(CarSpec.CO_BLUE,CarSpec.TR_NORMAL, CarSpec.DISPLACEMENT_2000, CarSpec.HANDLE_NORMAL);
		StarCar car2 = new StarCarHighGrade(CarSpec.CO_RED, CarSpec.TR_WILD, CarSpec.DISPLACEMENT_2200, CarSpec.HANDLE_POWER);
		
		car1.getSpec();
		car2.getSpec();
		 
		
	}
	

}
