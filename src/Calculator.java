import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;


public class Calculator {
	

	private double addition(double num1, double num2){
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		return num1+num2;
	}
	
	private double multiplication(double num1, double num2){
		System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
		return num1*num2;
	}
	
	private double subtraction(double num1, double num2){
		System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
		return num1-num2;
	}
	
	private double modulus(double num1, double num2){
		if(num2 == 0){
			System.out.println("Error can't divide by 0");
			return Double.MAX_VALUE;
		}
		System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
		return num1%num2;
	}
	
	
	private double division(double num1, double num2){
		if(num2 == 0){
			System.out.println("Error can't divide by 0");
			return Double.MAX_VALUE;
		}
		System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
		return num1/num2;
	}
	
	public double handleOperation(double firstNumber, int op, double secondNumber){
		switch(op){
		
			case 1: return this.addition(firstNumber, secondNumber);
					
			case 2: return this.subtraction(firstNumber, secondNumber);
					
			case 3: return this.multiplication(firstNumber, secondNumber);
				
			case 4: return this.division(firstNumber, secondNumber);
					
			case 5: return this.modulus(firstNumber, secondNumber);
					
			
		}
		return Double.MAX_VALUE;
	}
}
