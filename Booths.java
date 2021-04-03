//12. Implement a JAVA program to implement a Booth multiplier. 
public class Booths {
	static int size = 4;
	int multiplicand[] = new int[]{0, 0, 1, 1}; // -4 in 2s complement
	int multiplier[] = new int[]{0,1,0,0,1}; // -7 in 2s complement
	int a[]= new int[size];
	int negMultiplicand[] = new int[4];
	
	void rightShiftAQ(){
		int i;
		for(i = 1; i <= size; i++) {
			multiplier[i-1] =multiplier[i];
		}
		multiplier[4] = a[0];
		for(i = 1; i < size; i++) {
			a[i - 1] = a[i];
		}
		if(a[2] == 1) {
			a[3] = 1;
		}
		else {
			a[3] = 0;
		}
	}
	void aPlusM(){
		int i;
		int cin = 0;
		for(i = 0; i < size; i++) {
			a[i] = a[i] + multiplicand[i] + cin;
			
			if(a[i] == 2) {
				a[i] = 0;
				cin = 1;
			}
			else if(a[i] == 3) {
				a[i] = 1;
				cin = 1;
			}
			else if(a[i] == 1) {
				cin = 0;
			}
		}
	}
	void aMinusM(){
		int i = 0 ;
		int cin = 0;
		
		//to find 2s complement of multiplicand
		while(i < size ) {
			negMultiplicand[i] = multiplicand[i];
			if(multiplicand[i] == 1) {
				break;
			}
			i++;
		
			
		}
		i++;
		for(; i < size; i++) {
			if(multiplicand[i] == 1) {
				negMultiplicand[i] = 0;
			}
			else {
				negMultiplicand[i] = 1;
			}
		}
		
		//A = A - M
		for(i = 0; i < size; i++) {
			a[i] = a[i] + negMultiplicand[i] + cin;
			if(a[i] == 2) {
				a[i] = 0;
				cin = 1;
			}
			else if(a[i] == 3) {
				a[i] = 1;
				cin = 1;
			}
			else if(a[i] == 1) {
				cin = 0;
			}
		}
		
	}
	void printAQ() {
		int j;
		for(j = size -1 ; j >= 0; j--) {
			System.out.printf("%d  ",a[j]);
		}
		for(j = size ; j > 0; j--) {
			System.out.printf("%d  ", multiplier[j]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {

		Booths obj = new Booths();
		int i, j;
		
		obj.printAQ();
		for(i = 0; i < size; i++) {
			if(obj.multiplier[1] == 0 && obj.multiplier[0] == 1) {
				System.out.println("A = A + M");
				obj.aPlusM();
			}
			else if(obj.multiplier[1] == 1 && obj.multiplier[0] == 0) {
				System.out.println("A = A - M");
				obj.aMinusM();
			}
			obj.rightShiftAQ();
			System.out.println("After right shift");
			obj.printAQ();
		}
	}
}
