package day2;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input the Loan Amount: ");
		double loan = scan.nextDouble();
		System.out.println("Input the Equated Monthly Installment: ");
		double emi = scan.nextDouble();
		System.out.println("Input the Rate of Interest: ");
		double roi = scan.nextDouble();
		
		int numemi = 0;
		
		// Need to calculate how many monthly installments it would take
		// to pay off the loan while factoring in interest
		while(loan > 0) {
			loan -= emi;
			if(loan > 0) {
				loan += loan*roi/100;
			}
			numemi++;  
		}
		
		System.out.println("It will take " + numemi + " month(s) to pay off your loan");
	}
}
