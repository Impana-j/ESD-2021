//10. Implement a JAVA program to implement a Half adder using Bitwise operator. 
class Halfadder{

	int carry(int in1, int in2){
		 int a,b;
		 a = in1;
		 b = in2;
		 int ans;

		 int carry;

		 carry = a&b;
		 return carry;
	}

	int sum(int in1, int in2){
		 int a,b;
		 a = in1;
		 b = in2;
		 int ans;

		 int sumans;
		 if(a==0 && b==1)
		 	sumans = 0;
		 else if(a==1 && b==0)
		 	sumans = 0;
		 else
		 	sumans = 1;

		 return sumans;

	}

	public static void main(String[] args) {
		int a,b;
		for(a=0; a<2; a++){
			for(b=0; b<2; b++){
				Halfadder ha = new Halfadder();
		System.out.print("Sum = "+ha.sum(a,b));
		System.out.println(" Carry = "+ha.carry(a,b));
			}
		}

	}
}
