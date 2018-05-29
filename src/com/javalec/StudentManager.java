package com.javalec;

import java.util.ArrayList;


public class StudentManager {

	ArrayList<Student> students = new ArrayList<Student>();
	StudentExpel studentExpel = new StudentExpel();
	
	public static void main(String[] args) {
		
		StudentManager sm = new StudentManager();
		
		sm.addStudent("bae",22,20180101,"경제");
		sm.addStudent("oh",23,20180102,"가정교육");
		sm.addStudent("lee",20,20180103,"전산");
		
		System.out.println(sm.students.get(0).getName());
		System.out.println(sm.students.get(1).getName());
		System.out.println(sm.students.get(2).getName());
		
	}

	
	public void addStudent(String name, int age, int studentNum, String major) {
		
		students.add(new Student(name, age, studentNum,major));
		System.out.println(name +" created !!!");
		
	}

	
}
