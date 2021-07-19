/*
 *
 * Project II
 *
 * @author Lakshay Arora
 * File - Video.java
 *
 */
package Project2;

public class Video {
	String title;
	boolean flag;
	double avg_rating;
	int check_outs;

	Video(String title) {
		this.title = title;
		this.flag = false;
		this.avg_rating = 0.0;
		this.check_outs = 0;
	}
}
