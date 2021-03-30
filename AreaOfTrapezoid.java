//46. Implement a java program to find the area of d) trapezoid
import java.util.Scanner;

public class AreaOfTrapezoid {
	private static Scanner sc;

	public static void main(String[] args) {
		double base1, base2, height, Area; 
		sc = new Scanner(System.in);
		
		System.out.println(" Please Enter First Base of a Trapezoid =  ");
		base1 = sc.nextDouble();
		System.out.println(" Please Enter Second Base of a Trapezoid =  ");
		base2 = sc.nextDouble();
		System.out.println(" Please Enter the Height of a Trapezoid = ");
		height = sc.nextDouble();

		Area = 0.5 * (base1 + base2) * height;

		System.out.format("\n The Area of a Trapezoid = %.2f\n",Area);
	}
}