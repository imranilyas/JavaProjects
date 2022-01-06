package day3;

public class Employee {
	public Employee() {}
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	private String name;
	private int id;
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
