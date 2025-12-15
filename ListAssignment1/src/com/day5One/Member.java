package com.day5One;

public abstract class Member implements GymServices {

//	Fields: memberId, name, email, phone, status, joinDate
//	Abstract method: displayMemberDetails()
	int memberId;
	String name;
	int phone;
	String status;
	String joinDate;

	public Member(int memberId, String name, int phone, String status, String joinDate) {
		super();
		this.memberId = memberId;
		this.name = name;
		this.phone = phone;
		this.status = status;
		this.joinDate = joinDate;
	}
	

	public Member() {
		super();
	}


	public void displayMemberDetails() {
		System.out.println("Member [memberId=" + memberId + ", name=" + name + ", phone=" + phone + ", status=" + status
				+ ", joinDate=" + joinDate + "]");
	}


	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", name=" + name + ", phone=" + phone + ", status=" + status
				+ ", joinDate=" + joinDate + "]";
	}


	


}
