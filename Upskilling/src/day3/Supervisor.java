package day3;

public class Supervisor extends Employee {
	public Supervisor() {
		
	}
	
	public Supervisor(int exp, int id, String name) {
		super(id, name);
		this.exp = exp;
	}
	
	private int exp;
	
	public int getExp() {
		return this.exp;
	}
	
	public void setExp(int exp) {
		this.exp = exp;
	}
}
