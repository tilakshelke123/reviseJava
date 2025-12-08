package com.cal;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int [] marks = new int[5];
	for(int i = 0 ;i<5 ;i++) {
		System.out.println("Enter the students marks "+i);
		marks[i]= sc.nextInt();
	}
// for displaying data 
	for(int i = 0 ;i<5;i++) {
		System.out.println(marks[i]);
	}
	}
	

}
