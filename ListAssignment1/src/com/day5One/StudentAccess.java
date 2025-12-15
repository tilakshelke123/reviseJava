package com.day5One;

public class StudentAccess extends Member implements GymServices {

	int monthlyFee = 300;
	String accessTime = "6Am=12Pm, Student Details";
	String studDetails = "cdac college ";

	public StudentAccess(int memberId, String name, int phone, String status, String joinDate, int monthlyFee,
			String accessTime, String studDetails) {
		super(memberId, name, phone, status, joinDate);
		this.monthlyFee = monthlyFee;
		this.accessTime = accessTime;
	}

	@Override
	public void displayMemberDetails() {
		System.out.println("StudnetMember [monthlyFee=" + monthlyFee + ", accessTime=" + accessTime + ", memberId="
				+ memberId + ", name=" + name + ", phone=" + phone + ", status=" + status + ", joinDate=" + joinDate
				+ "studDetails" + studDetails + "]");
	}

	@Override
	public void renewMembership(int months) {
		calculateFees(months);

	}

	@Override
	public void cancelMembership() {
		System.out.println("Cncelled!!!");
		System.out.println("Student Memebership Cancelled");

	}

	@Override
	public double calculateFees(int months) {
		double basic = months * monthlyFee;
		System.out.println(basic);
		return basic;
	}
}
