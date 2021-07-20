/*
 *
 * Project III
 *
 * @author Lakshay Arora
 * Roll No. 1816669
 * File - SBAccount.java
 *
 */

package Project3;

import java.util.Scanner;

public class SBAccount extends Account {
	String account_type;

	SBAccount() {
		this.amount = this.getAmount();
		this.account_type = this.getAccountType();

		if(this.account_type.equals("Normal")) {
			this.interest_rate = 0.04;
		} else if(this.account_type.equals("NRI")) {
			this.interest_rate = 0.06;
		}
	}

	double calculateInterest() {
		return this.amount * this.interest_rate;
	}

	private String getAccountType() {
		String type = "";
		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("\nSelect your Account type (Normal / NRI) : ");
				type = sc.nextLine();
				if(!type.equals("Normal") && !type.equals("NRI")) {
					throw new InvalidValueException("Not a valid Account type");
				}
			} catch(Exception e) {
				System.out.println("\nException : " + e);
			}
		} while(!type.equals("Normal") && !type.equals("NRI"));
		return type;
	}
}
