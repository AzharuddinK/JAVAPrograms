package basicJavaProgramsSet1;

/**
 * 
 * @author Azharuddin Khan
 * @Description : Multiply of two integer whole numbers
 *
 */
public class MultiplyTwoNumbers {
	
	public static int multiply(int number1 , int number2){
		if(number1==0 || number2==0)
			return 0;
		else
		return number1*number2;	
	}
	
	public static void main(String[] args) {
		System.out.println(multiply(200, 3));
		
	}

}
