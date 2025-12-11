package com.Exception;

import java.util.Scanner;

public class BankTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Bank bb = new Bank();
		Bank b1 = new Bank("Tilak", 123, 10000);
		Bank b2 = new Bank("piyush", 234, 11000);
		Bank b3 = new Bank("manoj", 345, 12000);
		Bank b4 = new Bank("vish", 456, 13000);
		Bank b5 = new Bank("pragati", 567, 14000);
		Bank b6 = new Bank("mrunali", 678, 15000);

		/*
		 * Bank arr[]= {b1,b2,b3,b4,b5,b6};
		 */

		try {

			int option;
			double amt;
			do {
				System.out.println("*** Welcome To the CDAC Bank Account ***");
				System.out.println("1. Dislay  2. Deposit SAmount  3. Withdrawl Amount  4. TransferAmount  5. Exit");
				option = sc.nextInt();

				switch (option) {
				case 1:
					b1.display();
					break;
				case 2:

					System.out.println("Enter deposit amount:");
					amt = sc.nextInt();
					b1.deposit(amt);
					break;
				case 3:
					System.out.println("Enter Withdrawl amount:");
					amt = sc.nextInt();
					b1.withdrawl(amt);
					break;
				case 4:
					System.out.println("Enter deposit amount:");
					amt = sc.nextInt();
					bb.Transfer(b2, b3, amt);
					break;
				case 5:
					System.out.println("Exiting !!!!");
					break;
				default:
					System.out.println(" Invalid Value Entered !!");
					break;
				}
			} while (option != 5);

		} catch (MoneyNotFoundException e) {
			System.out.println(e.getMessage());

		}

	}
}