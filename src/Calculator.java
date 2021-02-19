import java.util.Scanner;
public class Calculator {
	double firstNumber;
	double secondNumber;
	char operation;
	double result;
	
	public Calculator() {
		firstNumber = 0;
		secondNumber = 0;
		result = 0;
		operation = ' ';
	}	
	public Calculator setOperandOne(double  num1) {
		this.firstNumber = num1;
		return this;
		
	}
	public Calculator setOperandTwo(double num2) {
		this.secondNumber = num2;
		return this;
	}
	public Calculator setOperation(char op) {
		this.operation = op;
		return this;
	}
	public Calculator performOperation() {
		switch (operation) {
		
		case '+': this.result = this.firstNumber + this.secondNumber; return this;
		
		case '-': this.result = this.firstNumber - this.secondNumber; return this;
		
		case '*': this.result = this.firstNumber * this.secondNumber; return this;
		
		case '/': this.result = this.firstNumber / this.secondNumber; return this;
		
		default: System.out.println("Operation must be +, -, *, or /.");
			return this;
		
		}
	}
	public double getResults() {
		System.out.println(this.firstNumber + " " + this.operation + " " + this.secondNumber + " = " + this.result);
		return this.result;
	}
}
