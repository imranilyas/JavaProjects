package day5;

public class Kaiju implements Comparable<Kaiju> {
	public Kaiju() {
		
	}
	
	public Kaiju(int id, String name, int power) {
		this.id = id;
		this.name = name;
		this.power = power;
	}
	
	private int id;
	private String name;
	private int power;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public int compareTo(Kaiju k) {
		return this.id - k.getId();
	}
}
