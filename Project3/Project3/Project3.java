/*
 *
 * Project III
 *
 * @author Lakshay Arora
 * Roll No. 1816669
 * File - Project3.java
 *
 */

package Project3;

import java.util.Scanner;

public class Project3 {
	public static void main(String[] args) {

		boolean exit = false;
		double interest_gained = 0.0;
		do
		{
			System.out.print("\nChoose from following options : ");
			System.out.println(
				"\n\t1. Interest Calculator - SB" +
				"\n\t2. Interest Calculator - FD" +
				"\n\t3. Interest Calculator - RD" +
				"\n\t4. Exit"
			);
			System.out.print("\nEnter your choice : ");
			Scanner sc = new Scanner(System.in);
			byte choice = sc.nextByte();

			switch(choice)
			{
				case 1 : {
					SBAccount sba = new SBAccount();
					interest_gained = sba.calculateInterest();
					System.out.println("\n\tInterest gained : Rs. " + interest_gained + " /-");
					break;
				}

				case 2 : {
					FDAccount fda = new FDAccount();
					interest_gained = fda.calculateInterest();
					System.out.println("\n\tInterest gained : Rs. " + interest_gained + " /-");
					break;
				}

				case 3 : {
					RDAccount rda = new RDAccount();
					interest_gained = rda.calculateInterest();
					System.out.println("\n\tInterest gained : Rs. " + interest_gained + " /-");
					break;
				}

				case 4 : {
					exit = true;
					System.out.println("\n------Session Terminated------");
					break;
				}

				default:
					System.out.println("*** Invalid Choice ***");
			}
		} while(!exit);
	}
}