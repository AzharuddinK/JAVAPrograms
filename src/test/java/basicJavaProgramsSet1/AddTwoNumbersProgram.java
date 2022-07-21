package basicJavaProgramsSet1;

/**
 * 
 * 
 * @author Azharuddin Khan
 * @Description : Addition of two numbers (Whole positive Integers , decimal positive numbers or float numbers)
 *
 */
public class AddTwoNumbersProgram {
	
	public static int addTwoNumbers(int number1 , int number2){
		return number1+number2;
	}
	
	public static double addTwoNumbers(double number1,double number2){
		
		return number1+number2;
		
	}
	
	
	public static float addTwoNumbers(float number1,float number2){
		return number1+number2;
	}
	
	

	public static void main(String[] args) {
		
		System.out.println(addTwoNumbers(2, 3));
		System.out.println(addTwoNumbers(23, 3.5));
		System.out.println(addTwoNumbers(.05f, .23f));
	}

}
