package co.gc.famouslab;


public class Tiny {
	private String name;
	private String invention;
	private int year;
	public Tiny(String name, String invention, int year) {
		this.name = name;
		this.invention = invention;
		this.year = year;
	}
	public Tiny() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
