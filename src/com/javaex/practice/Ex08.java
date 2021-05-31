package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[6];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
				}
			}
		}

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}

}
