package basicJavaProgramsSet1;
import java.util.Scanner;

/**
 * 
 * @author Azharuddin Khan
 * @description : Get Input From user and print based on data type 
 * 
 *
 */
public class ReadInputFromUserProgram {
	
	
	public static void getInputFromUser(){
		Scanner scanner = new Scanner(System.in);
		
		if(scanner.hasNext()){
			
			if(scanner.hasNextInt()){
				System.out.println("Your Input  is Integer "+ scanner.nextInt());
			}if(scanner.hasNextDouble()){
				System.out.println("Your Input  is Double "+ scanner.nextDouble());
			}if(scanner.hasNextFloat()){
				System.out.println("Your Input  is Float "+ scanner.nextFloat());
			}if(scanner.hasNext()&&!scanner.hasNextInt()){
				System.out.println("Your Input is Boolean  "+ scanner.nextBoolean());
			}
			else{
				String text = scanner.next();
				if(text.contains("f"))
					System.out.println("Your Input is Boolean  "+text);
				else 
					System.out.println("Your Input  is "+ text);
			}		
		}
		
		scanner.close();
	}
	
	
	public static void main(String[] args) {
		System.out.println("Please provide me the input.");
		getInputFromUser();
	}
	
	
	
	

}
