/*
 *
 * Project III
 *
 * @author Lakshay Arora
 * Roll No. 1816669
 * File - RDAccount.java
 *
 */

package Project3;

import java.util.Scanner;

public class RDAccount extends Account {
	int no_of_months;
	int age_of_ac_holder;
	double monthly_amount;
	
	RDAccount() {
		this.amount = this.getAmount();
		this.no_of_months = this.getNoOfMonths();
		this.age_of_ac_holder = this.getAge();
		this.interest_rate = this.getInterestRate();
	}

	private int getNoOfMonths() {
		int months = 0;
		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("\nEnter the number of months : ");
				months = sc.nextInt();
				if(months < 6) {
					throw new InvalidValueException("Invalid number of months");
				} else if(months > 21) {
					months = 21;
				}
			} catch(Exception e) {
				System.out.println("\nException : " + e);
			}
		} while(months < 6);
		return months;
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
		int[] months = { 8, 11, 14, 17, 20, 23 };
		double[] g_rate = { 7.50, 7.75, 8.00, 8.25, 8.50, 8.75 };
		double[] s_rate = { 8.00, 8.25, 8.50, 8.75, 9.00, 9.25 };

		double interest_rate = 0.0;

		for(int i = 0; i < months.length; i++) {
			if(months[i] >= this.no_of_months) {
				if(this.age_of_ac_holder <= 60) {
					interest_rate = g_rate[i];
				} else {
					interest_rate = s_rate[i];
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
