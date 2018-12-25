package Soru_1;

import java.util.Stack;
import java.util.StringTokenizer;


public class Parser {

	Stack<Operator> operatorStack = new Stack<Operator>();
	Stack<Double> numberStack = new Stack<Double>();

	/**
	 * parse method with using stacks
	 * @param infix
	 */
	public void parse(String infix) {
		StringTokenizer a = new StringTokenizer(infix, "+,/,-,*");
		while (a.hasMoreTokens())
			numberStack.push(Double.parseDouble(a.nextToken()));

		String[] b = infix.split("");
		for (int i = 0; i < b.length; i++) {
			if (Operator.isOperator(b[i])) {
				Operator operator = new Operator(b[i]);
				operatorStack.push(operator);
			}
		}

	}

	public Stack<Operator> getOperatorStack() {
		return operatorStack;
	}

	public Stack<Double> getNumberStack() {
		return numberStack;
	}

	
}
