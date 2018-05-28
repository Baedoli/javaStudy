package com.javalec;

import java.util.Scanner;

public class studyProc {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int input_ = scanner.nextInt();
		
		studyProc sp = new studyProc();
		
		sp.sum_(input_);
		
	}
	
	// iMac test
	
	
	public void sum_(int i) {
		
		for (int j=1; j < 10; j++) {
			
			System.out.println(i+ " * "+j+" = "+(i*j));
			
		} 
	}
	
	
}
