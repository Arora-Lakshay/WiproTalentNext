/*
 *
 * Project V
 *
 * @author Lakshay Arora
 * File - Project5.java
 *
 */

package Project5;

import java.util.Scanner;

public class Project5 {

	private static String getString() {
		System.out.print("\nEnter string value : ");
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

	public static void main(String[] args) {
		System.out.print("\nChoose from the following operations : ");
		System.out.println(
			"\n\t1. Insert" +
			"\n\t2. Search" +
			"\n\t3. Delete" +
			"\n\t4. Display" +
			"\n\t5. Exit"
		);

		boolean exit = false;

		do {

			System.out.print("\nEnter your choice : ");
			
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();

			switch(choice) {
				case 1: {
					StringUtil.insert(getString());
					break;
				}

				case 2: {
					StringUtil.search(getString());
					break;
				}

				case 3: {
					StringUtil.delete(getString());
					break;
				}

				case 4: {
					StringUtil.display();
					break;
				}

				case 5: {
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