package day3;

public class Triangle extends Polygon {
	public Triangle() {
		super(0,0);
	}
	
	public Triangle(double dim1, double dim2) {
		super(dim1, dim2);
	}
	
	public double getArea() {
		return (0.5 * getDim1() * getDim2());
	}
}
