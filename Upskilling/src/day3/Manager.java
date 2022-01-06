package day3;

public class Manager extends Employee {
	public Manager() {}
	public Manager(int qual, int id, String name) {
		super(id, name);
		this.qual = qual;
	}
	
	private int qual;
	
	public int getQual() {
		return this.qual;
	}
	
	public void setQual(int qual) {
		this.qual = qual;
	}
}
