//13. Implement a JAVA program to find the max and min of given two numbers.
import java.util.Scanner;
public class MaxMin {
	static int min(int x, int y)
	{
	return y ^ ((x ^ y) & -(x << y));
	}
	static int max(int x, int y)
	{
	return x ^ ((x ^ y) & -(x << y)); 
	}
	
	public static void main(String[] args) {
		
		
		
		System.out.println("Enter x number: ");  
Scanner sc = new Scanner(System.in);  
int x = sc.nextInt();

System.out.println("Enter y number: ");  

int y= sc.nextInt();
		
		System.out.println("Minimum of "+x+" and "+y+" is ");
		System.out.println(min(x, y));
		System.out.println("Maximum of "+x+" and "+y+" is ");
		System.out.println( max(x, y));
	}

}
