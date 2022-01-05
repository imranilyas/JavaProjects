package day2;

import java.util.Scanner;

public class DisplayOddEven {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean invalidRange = true;
		int max = 0;
		
		while(invalidRange) {
			System.out.println("Input the range. Must be greater than 0: ");
			max = scan.nextInt();
			
			// Safe check to ensure the range is not 0
			if(max == 0) {
				System.out.println("Please enter a valid range...");
			} else {invalidRange = false;}
		}
		iterateThroughLoop(max);
		
		
	}
	
	// Prints odd and even numbers from 1 to range exclusive
	public static void iterateThroughLoop(int range) {
		int temp = 1;
		String evenOrOdd;
		do {
			// Determine if the current number is odd or even
			if(temp%2 == 0) {
				evenOrOdd = "EVEN";
			} else {evenOrOdd = "ODD";}
			
			// Print current number
			System.out.println(temp + " - " + evenOrOdd);
			
			// Increment or Decrement depending on range (can be +/-)
			if(temp > range) {
				temp--;
			}
			else if(temp < range) {
				temp++;
			}
			
		} while(temp != range);
	}
}
