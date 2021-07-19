/*
 *
 * Project II
 *
 * @author Lakshay Arora
 * File - VideoStore.java
 *
 */

package Project2;

import java.util.Scanner;

public class VideoStore {

	private Video[] shelf;
	private int shelf_capacity; // Maximum Videos that can be stored in shelf
	private int shelf_size; // Number of Videos currently present in the shelf

	VideoStore(int shelf_capacity) {
		this.shelf_capacity = shelf_capacity;
		this.shelf = new Video[shelf_capacity];
		this.shelf_size = 0;
	}

	public void addVideo(String title) {
		if(this.shelf_size < shelf_capacity) {
			Video new_video = new Video(title);
			int pos = this.shelf_size;
			this.shelf[pos] = new_video;
			this.shelf_size += 1;
			System.out.println("Done! Added Video : " + title);
		} else {
			System.out.println("Sorry, we can't afford a new Video at this moment.");
		}
	}

	public void checkOut(String title) {
		int i = this.getItemLocation(title);
		if(i >= 0 && this.shelf[i].flag == false) {
			this.shelf[i].flag = true;
			this.shelf[i].check_outs += 1;
			System.out.println("\n" + title + " has been checked-out successfully !");
			return;
		}
		System.out.println("\nSorry, " + title + " is currently unavailable in our store.");
	}

	public void returnVideo(String title) {
		int i = this.getItemLocation(title);
		if(i >= 0 && this.shelf[i].flag == true) {
			this.shelf[i].flag = false;

			System.out.println("\nWe have received your request.");
			System.out.println("\nPlease rate your experience for this Video.");
			System.out.print("\nEnter your rating : ");

			Scanner sc = new Scanner(System.in);
			double rating = sc.nextDouble();
			
			this.receiveRating(title, rating);
			return;
		}
		System.out.println("\nSorry, " + title + " doesn't belongs to our store.");		
	}

	public void receiveRating(String title, double rating) {
		int i = this.getItemLocation(title);
		if(i >= 0 && this.shelf[i].check_outs > 0) {
			double avg_rating = (this.shelf[i].avg_rating + rating) / this.shelf[i].check_outs;
			this.shelf[i].avg_rating = avg_rating;
			System.out.println("\nThanks for rating our product");
			return;
		}
		System.out.println("\nSorry, " + title + " can't be rated.");
	}

	public void listInventory() {
		if(this.shelf_size < 1) {
			System.out.println("\nWe are currently out of stock.");
			return;
		}
		boolean all_checked_out = true;
		System.out.format("\n%-50s %-10s\n", "Title", "Rating");
		for(int i = 0; i < this.shelf_size; i++) {
			if(this.shelf[i].flag == false) {
				all_checked_out = false;
				System.out.format("\n# %-50s %-10.2f", this.shelf[i].title, this.shelf[i].avg_rating);
			}
		}
		if(all_checked_out) {
			System.out.println("*** Currenly all items had been checked-out ***");
			return;
		}
		System.out.println();
	}

	private int getItemLocation(String title) {
		for(int i = 0; i < this.shelf_size; i++) {
			if(this.shelf[i].title.equals(title)) {
				return i;
			}
		}
		return -1;
	}
}
