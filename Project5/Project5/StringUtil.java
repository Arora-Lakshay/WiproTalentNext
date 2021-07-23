/*
 *
 * Project V
 *
 * @author Lakshay Arora
 * File - StringUtil.java
 *
 */

package Project5;

import java.util.ArrayList;

public abstract class StringUtil {

	private static ArrayList<String> list = new ArrayList<String>(10);

	public static void insert(String str) {
		boolean success = list.add(str);
		
		if(success) {
			System.out.println("\nItem inserted Successfully !");
		} else {
			System.err.println("\nUnexpected Error Occured. Please Try Again");
		}
	}

	public static void search(String str) {
		if(list.isEmpty()) {
			System.out.println("\nNo items currently present in the List");
			return;
		}
		
		boolean present = list.contains(str);
		if(present) {
			System.out.println("\nItem found at index : " + list.indexOf(str));
		} else {
			System.out.println("\nItem does not exists");
		}
	}

	public static void delete(String str) {
		if(list.isEmpty()) {
			System.out.println("\nNo items currently present in the List");
			return;
		}
		
		boolean present = list.contains(str);
		if(present) {
			System.out.println("\nDeleting Item : " + str);
			boolean success = list.remove(str);
			if(success) {
				System.out.println("\nItem deleted Successfully !");
			} else {
				System.err.println("\nUnexpected Error Occured. Please Try Again");
			}
		} else {
			System.out.println("\nItem does not exits");
		}
	}

	public static void display() {
		if(list.isEmpty()) {
			System.out.println("\nNo items currently present in the List");
			return;
		}

		System.out.println("\nDisplaying all the items...");
		System.out.println("\t" + list);
	}

}
