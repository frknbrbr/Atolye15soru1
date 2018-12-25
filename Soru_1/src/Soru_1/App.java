package Soru_1;

public class App {
	
	public static void main(String[] args) {
		
		Evaluator evaluator = new Evaluator();

		System.out.println(evaluator.evaluate("13+50"));
		System.out.println(evaluator.evaluate("11*60"));
		System.out.println(evaluator.evaluate("95/5"));
		System.out.println(evaluator.evaluate("25-15"));
		System.out.println(evaluator.evaluate("-25-15*5"));
		System.out.println(evaluator.evaluate("5+10-40"));
		System.out.println(evaluator.evaluate("5-10-40"));	
		System.out.println(evaluator.evaluate("100-5"));		
		System.out.println(evaluator.evaluate("-95/5"));
		
	}
	

}
