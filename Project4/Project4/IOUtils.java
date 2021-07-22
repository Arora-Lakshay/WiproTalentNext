/*
 *
 * Project IV
 *
 * @author Lakshay Arora
 * File - IOUtils.java
 *
 */

package Project4;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


abstract class IOUtils {

	public static int getInteger(String prompt) {
		do {
			System.out.print("\n" + prompt);
			try {
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				return Integer.parseInt(reader.readLine());
			} catch (Exception e) {
				System.err.println("Exception : " + e);
			}
		} while(true);
	}

	public static String getString(String prompt) {
		do {
			System.out.print("\n" + prompt);
			try {
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				return reader.readLine();
			} catch (Exception e) {
				System.err.println("Exception : " + e);
			}
		} while(true);
	}

	public static double getDouble(String prompt) {
		do {
			System.out.print("\n" + prompt);
			try {
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				return Double.parseDouble(reader.readLine());
			} catch (Exception e) {
				System.err.println("Exception : " + e);
			}
		} while(true);
	}
}
