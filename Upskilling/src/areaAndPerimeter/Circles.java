package areaAndPerimeter;

import java.util.Scanner;

public class Circles {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Radius please: ");
		int r = scan.nextInt();
		double c = 2*r*Math.PI;
		double area = r*r*Math.PI;
		System.out.println("Area: " + area);
		System.out.println("Circumference: " + c);
	}
}
