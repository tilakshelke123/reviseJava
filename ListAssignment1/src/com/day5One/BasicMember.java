package com.day5One;

public class BasicMember extends Member implements GymServices {

	int monthlyFee = 500;
	String accessTime = "6Am-6Pm";

	public BasicMember(int memberId, String name, int phone, String status, String joinDate, int monthlyFee,
			String accessTime) {
		super(memberId, name, phone, status, joinDate);
		this.monthlyFee = monthlyFee;
		this.accessTime = accessTime;
	}

	@Override
	public void displayMemberDetails() {
		System.out.println("BasdicMember [monthlyFee=" + monthlyFee + ", accessTime=" + accessTime + ", memberId="
				+ memberId + ", name=" + name + ", phone=" + phone + ", status=" + status + ", joinDate=" + joinDate
				+ "]");
	}

	@Override
	public void renewMembership(int months) {
		calculateFees(months);

	}

	@Override
	public void cancelMembership() {
		System.out.println("Cncelled!!!");
		System.out.println("Bsic Memebership Cancelled");

	}

	@Override
	public double calculateFees(int months) {
		double basic = months * monthlyFee;
		System.out.println(basic);
		return basic;
	}
}
