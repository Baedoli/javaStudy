package com.javalec;

import java.util.Scanner;

public class calEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int i = scanner.nextInt();
		
		System.out.println(i+"를 3으로 나누어서 나머지가 0이 나오면 사용자가 입력한 숫자는 3의 배수 입니다.");
		System.out.println("i % 3 = "+i%3);
		
	}
	
	
	
	
}
