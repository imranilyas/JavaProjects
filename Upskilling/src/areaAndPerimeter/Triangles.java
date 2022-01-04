package areaAndPerimeter;

import java.util.Scanner;

public class Triangles {

	public static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Triangles tri = new Triangles();
		System.out.println("Please enter the length of a side: ");
		int side = scan.nextInt();
		
		System.out.println("Please enter the length of the base: ");
		int base = scan.nextInt();
		
		System.out.println("Please enter the final side of the triangle: ");
		int last = scan.nextInt();
		
		int perimeter = last + side + base;
		double area = tri.calculateArea(last, side, base);
		
		System.out.println("Your triangle's perimeter: " + perimeter);
		System.out.println("Your triangle's area: " + area);
	}
	

	public double calculateArea(int last, int side, int base) {
		double semi = (double)(last + side + base)/2;
		double heronsEquation = semi*(semi-last)*(semi-side)*(semi-base);
		return Math.sqrt(heronsEquation);
	}
}
