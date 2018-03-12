package com.javaex.Mission01;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		
		int[] ave = new int[5];
		int result = 0;
		
		for(int i=0;i<ave.length;i++) {
			
			int num = sc.nextInt();
			result = num+result;
		}
		double average = result/5;
		System.out.println("평균값은 "+average+" 입니다.");
	}

}
