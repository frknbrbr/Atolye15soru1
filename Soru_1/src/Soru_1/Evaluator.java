package Soru_1;

public class Evaluator {

	/**
	 * evaluate method for getting the resultant integer
	 * @param infix
	 * @return resultant integer
	 */
	public int evaluate(String infix) {
		Calculator calc = new Calculator();
		calc.calculator(infix);
		return (int) Math.round(calc.getParser().getNumberStack().peek());

	}
	
}
