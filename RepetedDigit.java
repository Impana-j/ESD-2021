//44. Implement a java program to count the repeted occurance of a digit in a n-digit number.
public class RepetedDigit{
	public static void main(String args[]){
		int num = 804818;
		int checkDigit = 8;
		int count = 0;
		int digit;
		while(num > 0){
			digit = num % 10;
			if(checkDigit == digit){
				count++;
			}		
			num = num / 10;
		}
		System.out.println("count of "+checkDigit+" : "+count);
	}
}