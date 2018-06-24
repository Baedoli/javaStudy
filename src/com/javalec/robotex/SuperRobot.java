package com.javalec.robotex;

import com.javalec.robotex.inter.FlyYes;

public class SuperRobot extends Robot  {

    
	 public SuperRobot() {
		// TODO Auto-generated constructor stub
		
		 fly = new FlyYes();
		 
	}

	@Override
	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("super robot 슈퍼로봇 입니다. 팔 다리 몸통 머리가 있습니다.");
	}
	
}
