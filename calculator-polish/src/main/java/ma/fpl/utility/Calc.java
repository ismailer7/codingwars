package ma.fpl.utility;

import java.util.Stack;

public class Calc {
	
	static final String OPERATORS = "+-*/";
	
	public static double evaluate(String expr) {
		if(expr.isEmpty()) {
			return 0;
		}
		Stack<String> stack = new Stack<String>();
		
		String[] exprSplit = expr.split(" ");
		
		
		if (exprSplit.length == 1) {
			if (exprSplit[0].contains(".")) return Double.parseDouble(exprSplit[0]);
			return (double) Integer.parseInt(exprSplit[0]);
		}
		// polish calculator algorithm here
		for (String string : exprSplit) {
			if(!OPERATORS.contains(string)) {
				// this is a number -> we only push the number into our stack.
				stack.push(string);
			} else {
				// this is an operator -> we pop out our 2 last items.
				String operator = string;
				double operand2 = Double.valueOf(stack.pop());
				double operand1 = Double.valueOf(stack.pop());
				double result = 0.0;
				switch(operator) {
					case "+":
						result = operand1 + operand2;
						break;
					case "-":
						result = operand1 - operand2;
						break;
					case "/":
						result = operand1 / operand2;
						break;
					case "*":
						result = operand1 * operand2;
						break;
				}
				stack.push(String.valueOf(result));		
			}
		}
		return Double.valueOf(stack.pop());
	}
	
	
}
