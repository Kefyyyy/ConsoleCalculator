package consoleCalculator;

import java.util.Scanner;

public class Assets {
	static Scanner scanner = new Scanner(System.in);

	// simplified user input

	public static String input(String msg) {
		System.out.print(msg);
		return scanner.nextLine();
	}

	// getting a valid values

	public static Double getDoubleInput(String msg) {
		Double number = Double.NaN;
		try {
			number = Double.parseDouble(input(msg));
		} catch (Exception e) {
			if (e.getMessage().equals("empty String")) {
				System.out.println("[ Error ] : Empty value.\n");
			} else {
				System.out.println("[ Error ] : Isn't a valid value.\n");
			}
		}

		return number;
	}
	
	// Programm's info and operators list
	
	public static void info() {
		System.out.println("Info: \n"
						+ "Simple calculator v1.3\n"
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
						+ "\"logarithm\", \"log\"\n");
	}
	
}
