/*
 *
 * Project VII
 *
 * @author Lakshay Arora
 * File - Project7.java
 *
 */

package Project7;

import java.util.Scanner;

public class Project7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Total number of cards : ");
		int N = sc.nextInt();

		for(int i = 0; i < N; i++) {
			CardSet.addNewCard();
		}

		CardSet.showStats();
	}
}
