package com.javalec;

import java.util.ArrayList;


public class StudentExpel {

    // int[] arrL = { 10,20,30 }	
	ArrayList<Student> expelStudents;
	
	public StudentExpel() {
		// TODO Auto-generated constructor stub
		
		expelStudents = new ArrayList<Student>();
		
	}
	

	public void addExpelStudent(String name, int age, int studentNum, String major ) {
		
		expelStudents.add(new Student(name,age,studentNum,major));
		
	}
	
	
}
