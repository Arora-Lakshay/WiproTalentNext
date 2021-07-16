/*
 *
 * Project I
 *
 * @author Lakshay Arora
 * File - Designation.java
 *
 */

package Project1;

public enum Designation {
	e("Engineer", 20000),
	c("Consultant", 32000),
	k("Clerk", 12000),
	r("Receptionist", 15000),
	m("Manager", 40000);

	private String desg;
	private int da;
	private Designation(String desg, int da) {
		this.desg = desg;
		this.da = da;
	}

	public String getDesignation() {
		return this.desg;
	}

	public int getDa() {
		return this.da;
	}
}
