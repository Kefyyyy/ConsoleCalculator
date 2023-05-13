package calculator;

import java.math.BigInteger;
import java.util.Scanner;

public class Assets {
	static Scanner scanner = new Scanner(System.in);

	// Simplified user input

	public static String input(String msg) {
		System.out.print(msg);
		return scanner.nextLine();
	}

	// Getting a valid values

	public static Double getDoubleInput(String msg) {
		Double number = Double.NaN;
		
		// Try to get value
		try {
			number = Double.parseDouble(input(msg));
		} catch (Exception e) {
			
			// Errors
			if (e.getMessage().equals("empty String")) {
				System.out.println("[ Error ] : Empty value.\n");
			} else {
				System.out.println("[ Error ] : Isn't a valid value.\n");
			}
		}

		return number;
	}

	
	// Calculate factorial
	public static BigInteger Factorial(Double n1) {
		
		BigInteger factorial = BigInteger.valueOf(1);
		for (int i = 1; i < n1; i++) {
			factorial = factorial.multiply(BigInteger.valueOf(i+1));
		}
		return factorial;
	}
	
	// Calculate double factorial
	public static BigInteger DoubleFactorial(Double n1) {
		
		BigInteger factorial = BigInteger.valueOf(1);
		
		if(n1 % 2 == 0) {
			
			for(int i = 2; i < n1; i = i+2) {
				factorial = factorial.multiply(BigInteger.valueOf(i+2));
			}
		}
		
		else {
			
			for(int i = 1; i < n1; i = i+2) {
				factorial = factorial.multiply(BigInteger.valueOf(i+2));
			}
		}
		return factorial;
	}
	

	// Programm's info and operators list

	public static void info() {
		System.out.println("Info: \n"
						+ "Simple calculator v1.1\n"
						+ "by @Kefyyyy with @Lethax help\n"
						+ "\n"
						+ "Usage:\n"
						+ "Value 1: [value 1] <Enter first value e.g: 45 or 3.14>\n"
						+ "Operator: [operator] <Enter operator (Check operators list below)>\n"
						+ "Value 2: [value 2] <Enter second value e.g: 45 or 3.14. IMPORTANT! You dont need to enter "
						 											+"secong value if you are using \"root\" operator>\n"
						+ "Would you want to continue? (Y/n): [Y] or [n] <Enter \"Y\"> if you want to continue>\n"
						+ "\n"
						+ "Operators list:\n"
						+ "\"+\", \"plus\";\n"
						+ "\"-\", \"minus\";\n"
						+ "\"*\", \"multip\", \"multipl\", \"multiply\";\n"
						+ "\"/\", \":\", \"division\", \"div\";\n"
						+ "\"sqrt\", \"root\", \"rt\"};\r\n"
						+ "\"^\", \"power\", \"pow\";\n"
						+ "\"cubedroot\", \"cbrt\", \"3rt\";\n"
						+ "\"logarithm\", \"log\";\n"
						+ "\"!\", \"f\", \"fact\", \"factorial\";\n"
						+ "\"!!\", \"df\", \"dfact\", \"dfactorial\"\n");
	}
	
}
