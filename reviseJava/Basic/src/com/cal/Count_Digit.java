package com.cal;

import java.util.Scanner;

public class Count_Digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the Number: ");
		int num = sc.nextInt();
		int count=0;
	while (num !=0) {
		num=num/10;
		count++;
	    }
	System.out.println("Toatal digit: "+count);
	}

}
