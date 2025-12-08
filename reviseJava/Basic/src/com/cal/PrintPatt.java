package com.cal;

import java.util.Scanner;

public class PrintPatt {

	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the row ");
//		int row = sc.nextInt();
//	 for(int i=0;i<=row;i++) {
//		 for(int j=1;j<row-i;j++) {
//			 System.out.print("*");
//		 }
//		 System.out.println("");
//	 }

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row ");
		int row = sc.nextInt();
		for (int i = 0; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}

	}

}
