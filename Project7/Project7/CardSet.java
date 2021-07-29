/*
 *
 * Project VII
 *
 * @author Lakshay Arora
 * File - CardSet.java
 *
 */

package Project7;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.ArrayList;

public abstract class CardSet {

	private static TreeMap<Character, ArrayList<Byte>> entries = new TreeMap<Character, ArrayList<Byte>>();
	private static int total_cards = 0;

	public static void addNewCard() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter your Card " + (total_cards + 1) + " Details");
		System.out.print("Symbol : ");
		char symbol = sc.next().charAt(0); 
		System.out.print("Number : ");
		byte number = sc.nextByte();

		boolean present = CardSet.entries.containsKey(symbol);
		if(!present) {
			ArrayList<Byte> set = new ArrayList<Byte>();
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

	public static void showDistinctCards() {
		System.out.print("\nDistinct Cards are : [");
		for(Map.Entry<Character, ArrayList<Byte>> entry : CardSet.entries.entrySet()) {
			System.out.print(" " + entry.getKey() + ", ");
		}
		System.out.println("\b\b ]");
	}

	public static void showStats() {
		CardSet.showDistinctCards();
		for(Map.Entry<Character, ArrayList<Byte>> entry : CardSet.entries.entrySet()) {
			System.out.println("\n\t# Cards in \"" + entry.getKey() + "\" symbol : ");
			int sum_of_cards = 0;
			Iterator<Byte> iter = entry.getValue().iterator();
			while(iter.hasNext()) {
				byte value = iter.next();
				sum_of_cards += value;
				System.out.println("\t\t" + entry.getKey() + " " + value);			
			}
			System.out.println("\t  Number of Cards : " + entry.getValue().size());
			System.out.println("\t  Sum of all these Cards : " + sum_of_cards);
		}
		System.out.println();
	}

}
