package basicJavaProgramsSet1;

/**
 * 
 * 
 * @author Azharuddin Khan
 * 
 * Area Of Triangle Formula :      Area = 1/2*Base*Height
 * 
 *
 */
public class AreaOfTriangleProgram {
	
	//This method will give you accurate result and it accept values in float eg: 1f , 1.2f etc
	public static float areaOfTriangle(float base , float height){
		
		float area = (base*height)/2;
		return area;
	}
	
	
	//This method will accurate value if base and height, if defined in decimal values 
	public static double areaOfTriangle(double base , double height){
		
		double area = (base*height)/2;
		return area;
	}
	
	//This method will omitt the decimal part as it cannnot accept decimal values
	public static int areaOfTriangle(int base , int height){
		
		int area = (base*height)/2;
		return area;
	}
	
	public static void main(String[] args) {
		
		System.out.println(AreaOfTriangleProgram.areaOfTriangle(7f, 9f)); 
		System.out.println(AreaOfTriangleProgram.areaOfTriangle(7.0, 9.0));
		System.out.println(areaOfTriangle(7, 9));
	}
	

}
