package com.day5One;

public interface GymServices {

	abstract void renewMembership(int months);

	abstract void cancelMembership();

	abstract double calculateFees(int months);
}
