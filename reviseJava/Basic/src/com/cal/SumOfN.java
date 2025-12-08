package com.cal;

import java.util.Scanner;

public class SumOfN {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter any no:");
	int n=sc.nextInt();
	int sum=0;
	for(int i=0;i<n;i++) {
		sum= sum+i;
	}
	System.out.println("sum: "+sum);
	}

}
