package basicJavaProgramsSet1;

/**
 * 
 * @author Azharuddin Khan
 *
 */
public class FindASCIIValueOfCharacter {
	
	//get ASCIIValue Using TypeConversion From Char To INT
	public static int getASCIIValue(char c ){
		int asciiValue = (int) c ;
		return asciiValue;
	}
	
	//get ASCIICode Assigning Char To INT
	public static int getASCIICode(char c){
		int asciiCode = c;
		return asciiCode;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(FindASCIIValueOfCharacter.getASCIIValue('A'));
		System.out.println(FindASCIIValueOfCharacter.getASCIICode('A'));
	}
	
	
	
	
	
	
	

}
