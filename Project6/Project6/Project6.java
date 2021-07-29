/*
 *
 * Project VI
 *
 * @author Lakshay Arora
 * File - Project6.java
 *
 */

package Project6;

public class Project6 {
	public static void main(String[] args) {

		while(!CardSet.isCompleted()) {
			CardSet.addNewCard();
		}

		CardSet.showStats();
	}
}
