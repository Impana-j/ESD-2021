//42. If the total ages of Iqbal and Shikhar is 12 years more than the total age of Shikhar and Charu. 
//Charu is how many years younger than Iqbal? Generalize this program and provide a JAVA program to get input and find the age
public class Age{

	void age(int a, int b)
	{
		int c = a+b-b-12;
		System.out.println("Charu is 12 years younger than Iqbal");
		System.out.println("Charu age is "+c);
	}

	public static void main(String[] args) {
		
		Age obj = new Age();
		obj.age(14,11);
	}
}