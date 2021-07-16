/*
 *
 * Project I
 *
 * @author Lakshay Arora
 * File - Employee.java
 *
 */

package Project1;

public class Employee
{
	String name;
	int emp_id;
	String join_date;
	Designation des_code;
	String dept;
	int basic;
	int hra;
	int it;

	Employee(String name, int emp_id, String join_date, Designation des_code, String dept, int basic, int hra, int it)
	{
		this.name = name;
		this.emp_id = emp_id;
		this.join_date = join_date;
		this.des_code = des_code;
		this.dept = dept;
		this.basic = basic;
		this.hra = hra;
		this.it = it;
	}

	private int getSalary() {
		return this.basic + this.hra + this.des_code.getDa() - this.it;
	}

	public void display() {
		System.out.format("\n%-10s %-15s %-15s %-15s %-10s", "Emp No.", "Emp Name", "Department", "Designation", "Salary");
		System.out.format("\n%-10d %-15s %-15s %-15s %-10d\n", this.emp_id, this.name, this.dept, this.des_code.getDesignation(), this.getSalary());
	}
}
