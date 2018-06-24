package com.javalec.robotex;

import com.javalec.robotex.inter.IFly;
import com.javalec.robotex.inter.iKnife;
import com.javalec.robotex.inter.iMisail;

public abstract  class Robot {

	IFly fly;
    iMisail misail;
    iKnife knife;
	
	public Robot() {
		// TODO Auto-generated constructor stub
	}
	
	public void actionWalk() {
		// TODO Auto-generated method stub
		System.out.println("걸을 수 있습니다.");
	}
	
	public void actionRun() {
		// TODO Auto-generated method stub
		System.out.println("달릴 수 있습니다.");
	}
	
	public abstract void shape();
	
	public void setFly(IFly fly) {
		this.fly = fly;
	}

	public void setMisail(iMisail misail) {
		this.misail = misail;
	}

	public void setKnife(iKnife knife) {
		this.knife = knife;
	}
	
	public void actionKnife() {
		// TODO Auto-generated method stub
		this.knife.knife();
	}
	
	public void actionFly() {
		// TODO Auto-generated method stub
		this.fly.fly();
	}
	
	public void actionMisail() {
		// TODO Auto-generated method stub
		this.misail.misail();
	}
	
}
