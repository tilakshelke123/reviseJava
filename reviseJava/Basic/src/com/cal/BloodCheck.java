package com.cal;

import java.util.Scanner;

public class BloodCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enetr your name : ");
		String name = sc.next();

		System.out.println("Enetr youe age ");
		int age = sc.nextInt();

		System.out.println("Enetr youe weight ");
		int weight = sc.nextInt();

		if ((age >= 18 && age <= 65) && (weight >= 50)) {

			// extra for just understanding
			if (weight >= 50) {
				System.out.println(name + " Your eligible Donation of Blood ");
			} else {
				System.out.println(name + " Your are not Eligible !!");
			}
		} else {
			System.out.println(name + " Your age is not between 18 to 65");
		}
	}

}
