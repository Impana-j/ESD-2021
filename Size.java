//48. Implement a java program to find the memory size in bytes given the input as address length. 
public class Size{
	public static void main(String args[]){
		int Start = 41257;
		int End = 86571;
		int bytes = (End - Start)/8;
		System.out.println("Memory size in bytes : "+bytes);
	}
}