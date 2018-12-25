package Soru_1;

public class Calculator {

	private Parser parser = new Parser();

	/**
	 * private calculate method for turning a number sign to negative
	 * 
	 * @param operator
	 * @param number
	 * @return a double value
	 */
	private double calculate(Operator operator, double number) {
		if (operator.geType().equals(Type.MINUS)) {
			return number * -1;
		} else
			return number;
	}

	/**
	 * calculate method for handling operations(with 2 number and 1 operator)
	 * 
	 * @param operator
	 * @param number1
	 * @param number2
	 * @return returns result double number
	 */
	private double calculate(Operator operator, double number1, double number2) {
		if (operator.geType().equals(Type.PLUS)) {
			return number1 + number2;
		} else if (operator.geType().equals(Type.MINUS)) {
			return number1 - number2;
		} else if (operator.geType().equals(Type.TIMES)) {
			return number1 * number2;
		} else if (operator.geType().equals(Type.DIVIDE)) {
			return number1 / number2;
		}
		return -1;
	}

	public void calculateHelper(Operator operator, Double number1, Double number2) {
		if (parser.getOperatorStack().peek().geType() == Type.MINUS) {
			number2 = number2 * -1;
			double newNumber = calculate(operator, number2, number1) * -1;
			parser.getNumberStack().push(newNumber);

		} else {
			double newNumber = calculate(operator, number2, number1);
			parser.getNumberStack().push(newNumber);

		}
	}

	/**
	 * calculator method to calculate whole expression
	 * 
	 * @param infix
	 */
	public void calculator(String infix) {
		parser.parse(infix);
		while (!parser.getOperatorStack().isEmpty()) {
			Operator operator1 = parser.getOperatorStack().pop();
			Double number1 = parser.getNumberStack().pop();
			if (!parser.getNumberStack().isEmpty()) {
				Double number2 = parser.getNumberStack().pop();
				if (!parser.getOperatorStack().isEmpty()) {
					calculateHelper(operator1, number1, number2);

				} else {
					double newNumber = calculate(operator1, number2, number1);
					parser.getNumberStack().push(newNumber);
				}
			} else {
				double newNumber = calculate(operator1, number1);
				parser.getNumberStack().push(newNumber);
			}
		}

	}

	/**
	 * getter method for accessing parser object
	 * 
	 * @return parser object
	 */
	public Parser getParser() {
		return parser;
	}

}
