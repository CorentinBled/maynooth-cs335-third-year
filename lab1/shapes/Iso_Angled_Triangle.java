package Shapes;
import java.util.Scanner;

/**This class uses the user inputed base and perpendicular height lengths to calculate area and circumference
 * It includes 2 methods for calculating area and circumference
 * @author u180301
 * @version 1.0
 * @since 05 Feb 2018
 */

public class Iso_Angled_Triangle {

	/**
	 * Main method asks user to input base & perpendicular height
	 * Displays the area and circumference back to the user
	 * in the console
	 * @param args
	 */
	public static void main(String []args){
		
		Scanner sc = new Scanner( System.in);
		System.out.println("Please enter the triangle base length: ");
		double base = sc.nextDouble(); 
		
		System.out.println("Enter height size: ");
		double height = sc.nextDouble();
		
		System.out.println("The area of the triangle is: " + Iso_Angled_Triangle.area(height, base));
		System.out.println("The circumference of the triangle is: " + Iso_Angled_Triangle.parameter(height, base));
		sc.close();
	}
	
	/**
	 * Calculate triangle area
	 * @param height base
	 * @return area
	 */
	public static double area(double height, double base){
		
		double area = (.5*base)*height;
		return area;
		}
	
	/**
	 * Calculate triangle circumference
	 * @param height base
	 * @return circumference
	 */
	public static double parameter(double height, double base){
			double a = Math.sqrt((base*2 + height*2));
			double parameter = base + a + a;
			return parameter;
		}
}

