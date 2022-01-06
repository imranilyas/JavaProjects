package day3;

public class Rectangle extends Polygon {
	public Rectangle() {
		super(0,0);
	}

	public Rectangle(double dim1, double dim2) {
		super(dim1, dim2);
	}
	
	public double getArea() {
		double dim1 = getDim1();
		double dim2 = getDim2();
		return dim1*dim2;
	}
}
