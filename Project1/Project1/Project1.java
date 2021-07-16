/*
 *
 * Project I
 *
 * @author Lakshay Arora
 * File - Project1.java
 *
 */

package Project1;

class Project1
{
	public static void main(String[] args)
	{
		Employee ep1 = new Employee("Ashish", 1001, "01/04/2009", Designation.e, "R&D", 20000, 8000, 3000);
		Employee ep2 = new Employee("Sushma", 1002, "23/08/2012", Designation.c, "PM", 30000, 12000, 9000);
		Employee ep3 = new Employee("Rahul", 1003, "12/11/2008", Designation.k, "Acct", 10000, 8000, 1000);
		Employee ep4 = new Employee("Chahat", 1004, "29/01/2013", Designation.r, "Frnt Desk", 12000, 6000, 2000);
		Employee ep5 = new Employee("Ranjan", 1005, "16/07/2005", Designation.m, "Engg", 50000, 20000, 20000);
		Employee ep6 = new Employee("Suman", 1006, "01/01/2000", Designation.e, "Manufacturing", 23000, 9000, 4400);
		Employee ep7 = new Employee("Tanmay", 1007, "12/06/2006", Designation.c, "PM", 29000, 12000, 10000);

		int emp_id = Integer.parseInt(args[0]);

		switch(emp_id) {
			case 1001:
				ep1.display();
				break;
			case 1002:
				ep2.display();
				break;
			case 1003:
				ep3.display();
				break;
			case 1004:
				ep4.display();
				break;
			case 1005:
				ep5.display();
				break;
			case 1006:
				ep6.display();
				break;
			case 1007:
				ep7.display();
				break;
			default:
				System.out.println("There is no employee with empid: " + emp_id);
		}
	}
}
