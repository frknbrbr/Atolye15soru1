package Soru_1;


public class Operator {


	private Type type;
	public String str;
	
	public Type geType() {
	return type;
	}
		
	public Operator(String string) {
		str=string;
		if(string.equals("+")) {
			type = type.PLUS;
		}else if(string.equals("-")) {
			type = type.MINUS;
		}else if(string.equals("*")) {
			type = type.TIMES;
		}else if(string.equals("/")) {
			type = type.DIVIDE;
		}
	}
	
	/**
	 * static isOperator method to understand a given string is operator or not
	 * @param s
	 * @return boolean value
	 */
	public static boolean isOperator(String s) {
		return (s.equals("+") || s.equals("-") || s.equals("*") 
				|| s.equals("/") || s.equals("(") || s.equals(")") || s.equals("[") || s.equals("]")
				|| s.equals("{") || s.equals("}"));
	}
	
}
