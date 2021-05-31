package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] data = new int[5];
		int num = 0;
		
		for (int i = 0; i < data.length; i++) {
			data[i] = sc.nextInt();
			num = num + data[i];
		}
		System.out.println("평균은 "+num / data.length+"입니다.");
		sc.close();
	}

}
