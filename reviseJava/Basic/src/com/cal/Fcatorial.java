package com.cal;

import java.util.Scanner;

public class Fcatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr any no: ");
		int num = sc.nextInt();
		int i = 1;
		int fact = 1;

		while (i <= num) {
			fact = fact * i;
			i++;

		}
		System.out.println(" fact: "+fact);
	}

}
