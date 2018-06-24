package com.javalec.robotex;

import com.javalec.robotex.inter.FlyYes;
import com.javalec.robotex.inter.KnifeLazer;
import com.javalec.robotex.inter.MisailYes;

public class MainClass {

	public static void main(String[] args) {

		System.out.println("Super Robot 을 만들어 주세요.,");
		Robot sb = new SuperRobot();

		sb.actionWalk();
		sb.actionRun();
		
		sb.shape();
		// sb.setFly(new FlyYes());
	    sb.actionFly();
	    sb.setKnife(new KnifeLazer());
		sb.actionKnife();
		sb.setMisail(new MisailYes());
		sb.actionMisail();
		
	}
	
}
