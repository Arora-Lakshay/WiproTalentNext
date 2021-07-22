/*
 *
 * Project IV
 *
 * @author Lakshay Arora
 * File - Employee.java
 *
 */

package Project4;

import java.util.ArrayList;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Employee extends IOUtils implements Serializable {
	private int emp_id;
	private String name;
	private int age;
	private double salary;

	final private static String db = "Edb.ser";
	private static FileInputStream fin;
	private static FileOutputStream fout;
	private static ObjectInputStream ois;
	private static ObjectOutputStream oos;
	int count = 0;

	static {
		try {

			Employee.fout = new FileOutputStream(Employee.db, true);
			Employee.oos = new ObjectOutputStream(Employee.fout);

			Employee.fin = new FileInputStream(Employee.db);
			Employee.ois = new ObjectInputStream(Employee.fin);

		} catch(Exception e) {
			System.err.println("Exception NOBJ : " + e);
		}
	}

	private Employee(int emp_id, String name, int age, double salary) {
		this.emp_id = emp_id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public static void addEmployee() {
		int emp_id = getInteger("Enter Employee ID : ");
		String name = getString("Enter Employee Name : ");
		int age = getInteger("Enter Employee Age : ");
		double salary = getDouble("Enter Employee Salary : ");

		Employee new_emp = new Employee(emp_id, name, age, salary);
		boolean success = Employee.serialize(new_emp);

		if(success) {
			System.out.println("\nSuccessfully added a new Employee !");
		} else {
			System.err.println("\nUnexpected error occured..Please Try Again");
		}
	}

	public static void display() {
		ArrayList<Employee> objects = Employee.deSerialize();

		if(objects.size() < 1) {
			return;
		}

		System.out.println("\nDisplaying record of all Employees...");
		for(Employee emp : objects) {
			System.out.print("\n\t# " + emp.emp_id + " " + emp.name + " " + emp.age + " " + emp.salary);
		}
	}

	private static boolean serialize(Employee obj) {
		boolean serialized = false;

		try {

			Employee.oos.writeObject(obj);
			serialized = true;

		} catch(Exception e) {
			System.err.println("Exception OBJ2S : " + e);
		}

		return serialized;
	}

	private static ArrayList<Employee> deSerialize() {
		ArrayList<Employee> emps = new ArrayList<Employee>();

		try {

			do {
				Employee obj = null;
				obj = (Employee) Employee.ois.readObject();
				if(obj == null) break;
				emps.add(obj);
			} while(true);

		} catch(FileNotFoundException e) {
			System.err.println("No Employees currently to display");
		} catch(EOFException e) {
			System.err.println("No Employees currently to display");
		} catch(Exception e) {
			System.err.println("Exception S2DS : " + e);
		}

		return emps;
	}

}
