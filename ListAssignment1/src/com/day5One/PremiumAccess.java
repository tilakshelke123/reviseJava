package com.day5One;

public class PremiumAccess extends Member  implements GymServices {

	int monthlyFee = 1500;
	String accessTime = "24 x 7 ";
	String Personal_Trainer = "sallu miya";

	public PremiumAccess(int memberId, String name, int phone, String status, String joinDate, int monthlyFee,
			String accessTime, String Personal_Trainer) {
		super(memberId, name, phone, status, joinDate);
		this.monthlyFee = monthlyFee;
		this.accessTime = accessTime;
		this.Personal_Trainer = Personal_Trainer;
	}

	@Override
	public void displayMemberDetails() {
		System.out.println("PremiumMember [monthlyFee=" + monthlyFee + ", accessTime=" + accessTime + ", memberId="
				+ memberId + ", name=" + name + ", phone=" + phone + ", status=" + status + ", joinDate=" + joinDate
				+ "Personal_Trainer" + Personal_Trainer + "]");
	}

	@Override
	public void renewMembership(int months) {
		calculateFees(months);
	}

	@Override
	public void cancelMembership() {
		System.out.println("Cncelled!!!");
		System.out.println("Premium Memebership Cancelled");
		
	}

	@Override
	public double calculateFees(int months) {
		double basic = months * monthlyFee;
		System.out.println(basic);
		return basic;
	}
}
