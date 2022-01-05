package day2;

import day2.Calculator;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Calculator.brand = "Canon";
		System.out.println(Calculator.brand);
		
		calc.setNum1(4);
		calc.setNum2(22);
		System.out.println(calc.getNum1() + " + " + calc.getNum2() + " = "
				+  calc.add()
		);
		
		Calculator calc2 = new Calculator();
		calc2.setNum1(6);
		calc2.setNum2(11);		
		System.out.println(calc2.getNum1() + " + " + calc2.getNum2() + " = "
				+  calc2.add()
		);
	}
}
