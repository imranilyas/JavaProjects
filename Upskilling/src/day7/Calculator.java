package day7;

public class Calculator {
	public Calculator() {
		
	}
	
	public Calculator(int input1, int input2) {
		this.input1 = input1;
		this.input2 = input2;
	}
	
	private int input1;
	private int input2;
	
	public int getInput1() {
		return input1;
	}

	public void setInput1(int input1) {
		this.input1 = input1;
	}

	public int getInput2() {
		return input2;
	}

	public void setInput2(int input2) {
		this.input2 = input2;
	}
	
	public int add() {
		return input1+input2;
	}
	
	public int subtract() {
		return input1-input2;
	}
	
	public int multiply() {
		return input1*input2;
	}
	
	public double divide() {
		return (double)input1/input2;
	}
	
}
