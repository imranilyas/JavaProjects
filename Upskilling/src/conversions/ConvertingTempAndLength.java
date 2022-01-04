package conversions;

import java.util.Scanner;

public class ConvertingTempAndLength {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Celsius: ");
		int celsius = scan.nextInt();
		System.out.println("Farenheit: ");
		int farenheit = scan.nextInt();
		System.out.println("Centimeter: ");
		int centimeter = scan.nextInt();
		System.out.println("Inches: ");
		int inches = scan.nextInt();
		convert(celsius, farenheit, centimeter, inches);		
	}
	
	public static void convert(int c, int f, int cent, int inch) {
		double celsius = (double)((f-32)*5/9);
		double farenheit = (double)((f*9/5) + 32);
		double inches = (double)cent/2.54;
		double centimeters = (double)inch*2.54;
		System.out.println("Celsius: " + celsius);
		System.out.println("Inches " + inches);
		System.out.println("Fahrenheit " + farenheit);
		System.out.println("Centimeters " + centimeters);
	}
}
