//41. Implement a Java program to takes the user for a distance (in meters) and the time was taken 
public class Distance{
	public static void main(String args[]){
		double distance = 250; // in meters
		int sec = 40;
		int min = 50;
		int hour = 1;
		
		double totalSec= (double)(sec + (min * 60) + ( hour * 60 * 60));
		double mps = distance/ totalSec;
		double kmph = 3.6 * mps;
		double mph = 2.23694 * mps;
		
		System.out.println("mps : "+mps+"  kmph : "+kmph+"  mph : "+mph); 
		
	}
}