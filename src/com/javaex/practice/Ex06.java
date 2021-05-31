package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l' };

		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}

		c[4] = ',';
		c[7] = ',';
		c[9] = ',';
		System.out.println("");

		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
	}

}
