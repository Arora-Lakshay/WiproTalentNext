/*
 *
 * Date : July 10, 2021
 * Submitted By : Lakshay
 *
 */

import java.util.Scanner;

// PS1 : Generate the minimum and maximum value for each of the Numeric Wrapper classes
public class MinMax {
	public static void main(String[] args) {
		System.out.println("Byte Range : ");
		System.out.println("\tMinimum Value = " + Byte.MIN_VALUE);
		System.out.println("\tMaximum Value = " + Byte.MAX_VALUE);

		System.out.println("Short Range : ");
		System.out.println("\tMinimum Value = " + Short.MIN_VALUE);
		System.out.println("\tMaximum Value = " + Short.MAX_VALUE);

		System.out.println("Integer Range : ");
		System.out.println("\tMinimum Value = " + Integer.MIN_VALUE);
		System.out.println("\tMaximum Value = " + Integer.MAX_VALUE);
		
		System.out.println("Long Range : ");
		System.out.println("\tMinimum Value = " + Long.MIN_VALUE);
		System.out.println("\tMaximum Value = " + Long.MAX_VALUE);

		System.out.println("Float Range : ");
		System.out.println("\tMinimum Value = " + Float.MIN_VALUE);
		System.out.println("\tMaximum Value = " + Float.MAX_VALUE);

		System.out.println("Double Range : ");
		System.out.println("\tMinimum Value = " + Double.MIN_VALUE);
		System.out.println("\tMaximum Value = " + Double.MAX_VALUE);
	}
}

// PS2 : Convert Decimal to Binary
public class D2B {
	public static void main(String[] args) {
		System.out.print("Enter a decimal number : ");

		Scanner sc = new Scanner(System.in);
		Integer num = sc.nextInt();

		String bin = Integer.toBinaryString(num);
		
		String lz = "";
		for(int i = 0; i < (8 - bin.length()); i++) {
			lz += "0";
		}

		bin = lz + bin;
		System.out.println(bin);
	}
}