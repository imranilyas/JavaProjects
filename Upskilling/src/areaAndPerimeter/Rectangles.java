package areaAndPerimeter;

import java.util.Scanner;

public class Rectangles {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Base: ");
		int base = scan.nextInt();
		System.out.println("Height: ");
		int height = scan.nextInt();
		int area = base*height;
		int perimeter = base*2 + height*2;
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
	}
}
