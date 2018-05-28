package com.javalec;

public class ManClass {

	private int age_;
	private int height_;
	private int weight_;
	private String phoneNum;
	
	public ManClass() {

		System.out.println("사람이 생성되었습니다.");
		
	} 
	
	public ManClass(int age_, int height_, int weight_, String phoneNum) {
		
		this.age_ = age_;
		this.height_ = height_;
		this.weight_ = weight_;
		this.phoneNum = phoneNum;
		
		System.out.println("나이 :"+this.age_+" 키 :"+this.height_+" 몸무게 :"+this.weight_+" 전화번호 : "+this.phoneNum);
		
	}
	
	public double calcBMI() {
		double result = weight_ / ( height_ * height_);
		return result;
	}

	public int getAge_() {
		return age_;
	}

	public void setAge_(int age_) {
		this.age_ = age_;
	}

	public int getHeight_() {
		return height_;
	}

	public void setHeight_(int height_) {
		this.height_ = height_;
	}

	public int getWeight_() {
		return weight_;
	}

	public void setWeight_(int weight_) {
		this.weight_ = weight_;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	
	
}
