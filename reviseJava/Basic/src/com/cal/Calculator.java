package com.cal;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr any 1st no: ");
		int a = sc.nextInt();

		System.out.println("Enetr any 2st no: ");
		int b = sc.nextInt();

		System.out.println("Enetr any Operator like +,-,/,*: ");
		char c = sc.next().charAt(0);

		// if-else 
		
		/*
		 * if(c=='+') { System.out.println("Addition:"+(a+b)); } else if(c=='-') {
		 * System.out.println("Subtraction:"+(a-b));
		 * 
		 * } else if(c=='/') { if(b!= 0) { System.out.println("division:"+(a/b)); }else
		 * { System.out.println("it gives divide by zero exceptions !!!"); }
		 * 
		 * 
		 * } else if(c=='*') { System.out.println("Multiplication:"+(a*b));
		 * 
		 * } else { System.out.println("not valid operator"); }
		 */

		switch (c) {

		case '+':
			System.out.println("Addition:" + (a + b));
			break;
		case '-':
			System.out.println("subtractions:" + (a - b));
			break;
		case '/':
			if (b != 0) {
				System.out.println("division:" + (a / b));
			} else {
				System.out.println("it gives divide by zero exceptions !!!");
			}
			break;

		case '*':
			System.out.println("division:" + (a * b));
			break;
		default:
			System.out.println("You enetered Wromng operaator plz eneter correct one ");
			break;
		}
	}
}
