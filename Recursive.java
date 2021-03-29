//15. Implement a JAVA program to multiply two numbers using recursive multiplication.
 import java.util.Scanner;

class Recursive
{
	static int product(int x, int y)
	{
		if (x < y)
			return product(y, x);
		else if (y != 0)
			return (x + product(x, y - 1));
	
		else
			return 0;
	}
	public static void main (String[] args)
	{
		int x = 13, y = 12;
		System.out.println(product(x, y));
	}
}