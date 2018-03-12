package com.javaex.Mission01;

import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
// [문제4] 키보드에서 정수로 된 돈의 액수를 입력받아 
//		오만원권, 만원권, 오천원권, 천원권, 
//		500원동전, 100원동전, 50원동전, 1원동전 
//		각 몇 개로 변환 되는지 작성 하세요.
		
		  System.out.print("금액 : ");
	        Scanner sc = new Scanner(System.in);
	        int price = sc.nextInt();

	        int coin[] = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};

	        for (int i = 0; i < coin.length; i++){
	            System.out.println(coin[i]+"원:"+(price / coin[i])+"개");
	            price = price - (coin[i] * (price / coin[i]));
	        	}	

	}

}
