package com.day5One;

import java.util.ArrayList;
import java.util.List;

public class GymManager {
	List<Member> members = new ArrayList<Member>();

	List<Member> activeList = new ArrayList<Member>();

	// add memeber in the list
	public void addMember(Member mem) {
		activeList.add(mem);
		System.out.println("member add Successfully "+mem);
	}

	// display all members in the list
	public void disPlayAll() {
		members.addAll(activeList);
		for (Member m : members) {
			int i = 0;
			System.out.println("members: " + i++);
			System.out.println(m);
		}
	}

	// remove memebers form list
	public void removeMember(Member id) {
		activeList.remove(id);
		System.out.println("member remove Successfully " + id);
	}

	// SearchDisplay from list
	public void searchMember(Member id) {
		for (Member m : activeList) {
			if (id == m) {
				System.out.println("name: " + m.name + "id: " + m.memberId + "" + m.toString());

			}

		}
	}

	// ActiveElementlist
	public void displayActiveMembers() {

		for (Member m : activeList) {
			System.out.println("Active list members:");
			System.out.println(m);
		}
	}
}
