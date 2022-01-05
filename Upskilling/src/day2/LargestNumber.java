package day2;

import java.util.Scanner;

public class LargestNumber {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Type in 3 Integers...");
		
		System.out.println("First: ");
		int first = scan.nextInt();
		
		System.out.println("Second: ");
		int second = scan.nextInt();
		
		System.out.println("Third: ");
		int third = scan.nextInt();
		
		int largest = first;
		if(largest < second) {
			largest = second;
		}
		if(largest < third) {
			largest = third;
		}
		
		System.out.println("The largest number is: " + largest);
		
	}
}
