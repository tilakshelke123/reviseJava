package com.cal;

import java.util.Scanner;

public class AtmPin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opin=1234;
		int pin;
		do{
			System.out.println("*** Welcome to the Wolrd Of Banking  ATM ***");
			System.out.println("plz Entered the Pin:-  ");
			pin = sc.nextInt();
			if(opin==pin) {
				System.out.println("Your Atm pin Matches");
			}
			else {
				System.out.println(" You Entered the pin Wrongly plz try again ");
			}
			
				continue;
		}
		while(pin!=1234);
	}

}
