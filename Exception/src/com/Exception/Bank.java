package com.Exception;

public class Bank {

	public String name;
	public int accNo;
	public double bal;

	public Bank(String name, int accNo, double bal) {
		super();
		this.name = name;
		this.accNo = accNo;
		this.bal = bal;
	}

	public Bank() {
		super();

	}

	public void display() {
		System.out.println("Bank [name=" + name + ", accNo=" + accNo + ", bal=" + bal + "]");

	}

	public double deposit(double amount) {
		System.out.println("before deposit bal " + bal);
		System.out.println(" deposit amoubt  " + amount);
		bal = bal + amount;
		System.out.println("after deposit bal " + bal);
		return bal;

	}

	public double withdrawl(double amount) throws MoneyNotFoundException {
		System.out.println("before withdrawl bal :" + bal);
		System.out.println(" current withdrawl amoubt  " + amount);
		if (amount < bal) {
			bal = bal - amount;
			System.out.println("after withddrawl bal " + bal);
		} else {
			throw new MoneyNotFoundException("Sufficient Amount not found Current Account");
		}

		return bal;

	}

	/*
	 * public double Transfer(Bank[] arr) { for(int i =0; i<arr.length;i++) {
	 * System.out.println(); } return bal; }
	 * 
	 */

	public void Transfer(Bank b2, Bank b3, double amount) throws MoneyNotFoundException {
		System.out.println("Current Withdrawl Amount :" + amount);
		b2.withdrawl(amount);
		System.out.println("Withdraw Successfull  Amount :" + amount);
		
		b2.deposit(amount);
		System.out.println("Deposit Successfull  Amount :" + amount);
 
		System.out.println("Thanks For Using Ouur Service !! Visit Again !!");

		
	}
}
