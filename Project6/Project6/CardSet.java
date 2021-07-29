/*
 *
 * Project VI
 *
 * @author Lakshay Arora
 * File - CardSet.java
 *
 */

package Project6;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.LinkedHashSet;

public abstract class CardSet {

	private static TreeMap<Character, LinkedHashSet<Byte>> entries = new TreeMap<Character, LinkedHashSet<Byte>>();
	private static int total_cards = 0;

	public static void addNewCard() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter your Card Details");
		System.out.print("Symbol : ");
		char symbol = sc.next().charAt(0); 
		System.out.print("Number : ");
		byte number = sc.nextByte();

		boolean present = CardSet.entries.containsKey(symbol);
		if(!present) {
			LinkedHashSet<Byte> set = new LinkedHashSet<Byte>();
			set.add(number);
			CardSet.entries.put(symbol, set);
		} else {
			CardSet.entries.get(symbol).add(number);
		}
		total_cards++;
	}

	public static boolean isCompleted() {
		if(CardSet.entries.size() == 4) {
			return true;
		}
		return false;
	}

	public static void showStats() {
		System.out.println("\nFour Symbols gathered in " + total_cards + " cards : ");
		System.out.println("First Occurences of these cards are as follows : ");
		for(Map.Entry<Character, LinkedHashSet<Byte>> entry : CardSet.entries.entrySet()) {
			Iterator<Byte> iter = entry.getValue().iterator();
			System.out.println("\t" + entry.getKey() + " " + iter.next());
		}
		System.out.println();
	}

}
