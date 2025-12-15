package com.day5One;

import java.util.Scanner;

public class TesterMember {

	public static void main(String[] args) {
		GymManager mgr = new GymManager();
		Scanner sc = new Scanner(System.in);
		int option;

		Member m1 = new BasicMember(12345, " Tilak ", 22222222, "on", "15 dec 2025", 500, "6am-6ppm");

		Member m2 = new PremiumAccess(2345, " piyush ", 33333, "on", "16 dec 2025", 1500, "24 x7 ", "rehman khan");

		Member m3 = new StudentAccess(345, " vish ", 44444, "on", "17 dec 2025", 200, "6am-12pm ", "cdac centere");

		/*
		 // 1st option call
		 
		m1.displayMemberDetails();
		System.out.println();
		System.out.println("------------------------------");
		m2.displayMemberDetails();
		System.out.println();
		System.out.println("------------------------------");
		m3.displayMemberDetails();
		System.out.println();
		System.out.println("------------------------------");
		
		*/
		
		/*
		 //2nd option call
		
	m1.renewMembership(5);
		System.out.println();
		System.out.println("------------------------------");
		m2.renewMembership(4);
		System.out.println();
		System.out.println("------------------------------");
		m3.renewMembership(3);
		System.out.println();
		System.out.println("------------------------------");

		
		m3.cancelMembership();
		System.out.println();
		System.out.println("------------------------------");
      
      */
		
		// 3rd and 4th both call
		
		
		do {
			
			
		
		System.out.println("Welcome to the World of Collection List Memers");
		System.out.println("plz Chhoose the Option: ");
		System.out.println("1: disPlayAll");
		System.out.println("2: addMember");
		System.out.println("3: removeMember ");
		System.out.println("4: searchMember ");
		System.out.println("5: displayActiveMembers");
		System.out.println("6: exit");
		
		option = sc.nextInt();
		Member obj;
		switch(option) {
		case 1:
			
			mgr.disPlayAll();
			System.out.println("displayall  member Successfully !!!");
			break;
			
			
		case 2:
			System.out.println("Enter the object ");
			obj=sc.n
			mgr.addMember(obj);
			System.out.println("Add member Successfully !!!");
			break;
		
		case 3:
			mgr.removeMember(m3);
			System.out.println("Remove member Successfully !!!");
			break;
			
		case 4:
			mgr.searchMember(m2);
			System.out.println("Add member Successfully !!!");
			break;
			
		case 5:
			mgr.displayActiveMembers();
			System.out.println("displayAllActive Successfully !!!");
			break;
			
		case 6:
			System.out.println("Exit!!!!");
			break;
		default:
			System.out.println("You Choosed Invalid Option Plz Entered Right One !!!");
			break;
		
		}
		
		} while(option !=6);
		
	}

}
