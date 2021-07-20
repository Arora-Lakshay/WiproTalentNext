/*
 *
 * Project III
 *
 * @author Lakshay Arora
 * Roll No. 1816669
 * File - Account.java
 *
 */

package Project3;

import java.util.Scanner;

public abstract class Account {
	double interest_rate;
	double amount;
	abstract double calculateInterest();

	protected double getAmount() {
		double amount = -1.0;
		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("\nEnter the Average amount in your account : ");
				amount = sc.nextDouble();
				if(amount < 0) {
					throw new InvalidValueException("Negative Priciple Value");
				}
			} catch(Exception e) {
				System.out.println("\nException : " + e);
			}
		} while(amount < 0);
		return amount;
	}
}
