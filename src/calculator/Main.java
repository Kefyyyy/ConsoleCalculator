/*
 * Calculator v1.00
 * by @Kefyyyy with @Lethax help
 * 
 * Was created in 3 days as a first java project
 * 
 * My GitHub: https://github.com/Kefyyyy
 * 
 * 
 * PatchNotes:
 * 1.1 - added starting message and able to enter help command 
 * 
 */

package calculator;

public class Main {

	// Execute code and ask to repeat

	public static void main(String[] args) {
		boolean repeat = false;

		// Starting
		
		String start = Assets.input("Calculator-v1.1\nType help for info or any else to continue: ").trim();
		if (start.equals("help") || start.equals("info") || start.equals("list") || start.equals("ls")) {
			Assets.info();
		}
		
		// Loop for executing main code

		do {
			repeat = false;
			calculatorCode();
			String askToRepeat = Assets.input("Would you want to continue? (Y/n): ").toLowerCase();
			if (askToRepeat.equals("y") || askToRepeat.equals("+")) {
				repeat = true;
			}
			System.out.println();
		} while (repeat);

	}

	// Main code

	public static void calculatorCode() {

		// Set default variables' values

		Double n1 = Double.NaN;
		Double n2 = Double.NaN;
		String operator = "";
		
		int i = 0;
		int j = 0;
		boolean isFound = false;
		
		//2D array of valid operators
		
		String[][] validOperators = { 	{ "+", "plus" },
										{ "-", "minus" },
										{ "*", "multip", "multipl", "multiply" },
										{ "/", ":", "division", "div", },
										{ "sqrt", "root", "rt"},
										{ "^", "power", "pow"}
									};

		// Get first value
		
		do {
			n1 = Assets.getDoubleInput("Value 1: ");
		} while (n1.isNaN());

		// Operator verification
		// <I spent 2 days for it meh....>

		do {

			// Ask for operator

			operator = Assets.input("operator: ");

			// Compare operator with operators list

			for (i = 0; i < validOperators.length && !isFound; i++) {

				for (j = 0; j < validOperators[i].length; j++) {

					if (operator.equals(validOperators[i][j])) {
						// Debug log
						// System.out.println("operator verification success: " + operator);
						isFound = true;
						break;
					}
				}
			}

			// Error message for invalid operator

			if (!isFound) {
				System.out.println("[ Error ] : Invalid operator\n");
			}

		} while (!isFound);

		// Check if operator is "root"

		if (operator.equals("root") || operator.equals("rt") || operator.equals("sqrt")) {
			System.out.println("Squared root from " + n1 + " = " + Math.sqrt(n1));
			return;
		}

		// Get second value

		do {
			n2 = Assets.getDoubleInput("Value 2: ");
		} while (n2.isNaN());

		// Calculations
		
		if (operator.equals("-") || operator.equals("minus")) {
			System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
		} else if (operator.equals("+") || operator.equals("plus")) {
			System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
		} else if (operator.equals("/") || operator.equals(":") || operator.equals("division")
				|| operator.equals("div")) {
			System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
		} else if (operator.equals("*") || operator.equals("multiplication") || operator.equals("multip")
				|| operator.equals("multipl")) {
			System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
		} else if (operator.equals("^") || operator.equals("power") || operator.equals("pow")) {
			System.out.println(n1 + " ^ " + n2 + " = " + Math.pow(n1, n2));
		}
	}
}