package co.gc.famouslab;


public class Complete {
	private String fname;
	private String lname;
	private String invention;
	private int year;
	
	public Complete(String fname, String lname, String invention, int year) {
		this.fname = fname;
		this.lname = lname;
		this.invention = invention;
		this.year = year;
	}
	public Complete() {
		
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getInvention() {
		return invention;
	}
	public void setInvention(String invention) {
		this.invention = invention;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}


	
}
