package day2;

public class Rectangle {

	public Rectangle() {
		
	}
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	private int length = 1;
	private int width = 1;
	
	public int getLength() {
		return this.length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int perimeter() {
		return 2*length + 2*width;
	}
	
	public int area() {
		return length*width;
	}
	
	@Override
	public String toString() {
		return "Rectangle {"
				+ "Length: " + length
				+ ", Width: " + width
				+ ", Perimeter: " + perimeter()
				+ ", Area: " + area()
				+ "}";
	}
	
}
