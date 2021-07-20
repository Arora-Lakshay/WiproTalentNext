/*
 *
 * Project III
 *
 * @author Lakshay Arora
 * Roll No. 1816669
 * File - FDAccount.java
 *
 */

package Project3;

import java.util.Scanner;

public class FDAccount extends Account {
	int no_of_days;
	int age_of_ac_holder;

	FDAccount() {
		this.amount = this.getAmount();
		this.no_of_days = this.getNoOfDays();
		this.age_of_ac_holder = this.getAge();
		this.interest_rate = this.getInterestRate();
	}

	private int getNoOfDays() {
		int days = 0;
		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("\nEnter the number of days : ");
				days = sc.nextInt();
				if(days < 7) {
					throw new InvalidValueException("Invalid number of days");
				} else if(days > 366) {
					days = 366;
				}
			} catch(Exception e) {
				System.out.println("\nException : " + e);
			}
		} while(days < 7);
		return days;
	}

	private int getAge() {
		int age = 0;
		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("\nEnter your age : ");
				age = sc.nextInt();
				if(age < 1) {
					throw new InvalidValueException("Invalid value of Age");
				}
			} catch(Exception e) {
				System.out.println("\nException : " + e);
			}
		} while(age < 1);
		return age;
	}

	private double getInterestRate() {
		int[] days = { 14, 29, 45, 60, 184, 366 };
		double[] g_rate = { 4.50, 4.75, 5.50, 7, 7.50, 8.00 };
		double[] s_rate = { 5.00, 5.25, 6.00, 7.50, 8.00, 8.50 };
		double[] m_rate = { 6.50, 6.75, 6.75, 8, 8.50, 10.00 };

		double interest_rate = 0.0;

		for(int i = 0; i < days.length; i++) {
			if(days[i] >= this.no_of_days) {
				if(this.amount <= 10000000.0) {
					if(this.age_of_ac_holder <= 60) {
						interest_rate = g_rate[i];
					} else {
						interest_rate = s_rate[i];
					}
				} else {
					interest_rate = m_rate[i];
				}
				break;
			}
		}
		return interest_rate / 100.0;
	}

	double calculateInterest() {
		return this.amount * this.interest_rate;
	}
}
