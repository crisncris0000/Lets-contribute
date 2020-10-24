import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sncr = new Scanner(System.in);
		int userInput;
		int a;
		int b;
		String syntax;
		
		System.out.println("Welcome to the calculator!");
		
		System.out.println("Enter a number : ");;
		a = userInput = sncr.nextInt();
		
		System.out.println("Enter another number : ");
		b = userInput = sncr.nextInt();
		
		
		
		System.out.println("Enter a syntax: (+, -, /, x or *, %)");
		syntax = sncr.next();
		
		if(syntax.equals("+")) {
			
			Addition(a, b);
			System.out.println(Addition(a, b));
		}
		else if(syntax.equals("/")) {
			System.out.println(Division(a, b));
		}
		else if(syntax.equals("-")) {
			System.out.println(Subtraction(a, b));
		}
		else if(syntax.equals("%")) {
			System.out.println(Module(a, b));
		}
		else if(syntax.equals("x") || syntax.equals("*")) {
			System.out.println(Multiplication(a, b));
		}
		else {
			System.out.println("Error, please try again");
		}
		
		
		
	}
	
	public static int Addition(int a, int b) {
		return a + b;
	}
	
	public static int Subtraction(int a, int b) {
		return a - b;
	}
	public static int Division(int a, int b) {
		return a/b;
	}
	public static int Module(int a, int b) {
		return a % b;
	}
	public static int Multiplication(int a, int b) {
		return a * b;
	}
	
	
}
