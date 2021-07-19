/*
 *
 * Project II
 *
 * @author Lakshay Arora
 * File - VideoStoreLauncher.java
 *
 */

package Project2;

import java.util.Scanner;

public class VideoStoreLauncher
{
	public static String getVideoTitle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter video title : ");
		return sc.nextLine();
	}

	public static void main(String[] args)
	{
		VideoStore store = new VideoStore(20);

		String[] videos = {
			"The Matrix",
			"Godfather II",
			"The Invisible Man",
			"The BFG",
			"Chappie",
			"Star Wars Episode IV : A New Hope",
			"Harry Potter and the Order of Pheonix",
			"Speed"
		};

		System.out.println("\nWelcome to our Store.\nChoose your operation from following choices");
		System.out.println(
			"\n\t'a' -> Add a video" +
			"\n\t'c' -> Chect out a video" +
			"\n\t'r' -> Return a video" +
			"\n\t'd' -> Display videos that are available" +
			"\n\t'i' -> Import demo content for testing" +
			"\n\t'e' -> Exit from our store"
		);


		boolean exit = false;
		do
		{	
			Scanner sc = new Scanner(System.in);
			System.out.print("\nEnter your choice: ");
			char choice = sc.next().charAt(0);
			switch(choice)
			{
				case 'a': {

					store.addVideo(getVideoTitle());
					break;
				}

				case 'c': {
					store.checkOut(getVideoTitle());
					break;
				}

				case 'r': {
					store.returnVideo(getVideoTitle());
					break;
				}

				case 'd': {
					System.out.println("\nLet's check out what we have got for you !");
					store.listInventory();
					break;
				}

				case 'i': {
					for(String v : videos) {
						store.addVideo(v);
					}
					break;
				}

				case 'e': {
					exit = true;
					System.out.println("Thanks for visiting us !!!");
					break;
				}

				default:
					System.out.println("*** Invalid Choice ***");
			}
		} while (!exit);
	}
}
