/*
 *
 * Project IV
 *
 * @author Lakshay Arora
 * File - Project4.java
 *
 */

package Project4;

public class Project4 extends IOUtils {

	public static void main(String[] args) {
		System.out.println("\nWelcome to Employee Management System");
		boolean exit = false;
		do 
		{
			System.out.println("\nMain Menu");
			System.out.println(
				"\n\t1. Add an Employee" +
				"\n\t2. Display All" +
				"\n\t3. Exit"
			);

			int choice = getInteger("Enter your choice : ");

			switch(choice) {
				case 1: {
					Employee.addEmployee();
					break;
				}

				case 2: {
					Employee.display();
					break;
				}

				case 3: {
					exit = true;
					System.out.println("\n------Session Terminated------");
					break;
				}

				default:
					System.out.println("***Invalid Choice****");
			}
		} while(!exit);
	}
}
