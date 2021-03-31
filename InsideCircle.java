//47. Implement a java program to find whether a circle is inside another circle or not. 
import java.lang.Math;

public class InsideCircle{
	boolean checkInside(int x1, int y1, int x2, int y2, int rad1, int rad2){
			double distance = Math.sqrt(Math.pow((x2 -x1), 2) + Math.pow((y2 - y1), 2));
			if((distance + rad2) > rad1){
				return true;
			}
			else{
				return false;
			}
	}
	
	
	public static void main(String args[]){
			InsideCircle obj = new InsideCircle();
			if(obj.checkInside(3, 0, 5, 1, 9, 6)){
				System.out.println("Circle not present inside other circle");
			}
			else{
				System.out.println("Circle present inside other circle");
			}
			
	}
}
