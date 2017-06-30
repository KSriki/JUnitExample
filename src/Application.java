import java.util.Scanner;

public class Application {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double firstNumber;
		double secondNumber;
		Calculator calculator = new Calculator();
		int op = 0;
		System.out.print("What is the first number? ");
		firstNumber = scan.nextDouble();
		System.out.println("1 - Addition");
		System.out.println("2 - Subtraction");
		System.out.println("3 - Multiplication");
		System.out.println("4 - Division");
		System.out.println("5 - Modulus");
		System.out.print("What do you want to do? : ");
		op = scan.nextInt();
		System.out.print("What is the second number ? : ");
		secondNumber = scan.nextDouble();
		calculator.handleOperation(firstNumber, op, secondNumber);
	}
}
