//9. Implement a JAVA program to find the number between 0 - 1000 where the sum is 8.
class Sum8{
	static int i,n,a,sum=0;
	public static void main(String[] args) 
	{
		for(i=0;i<1000;i++)
		{
			n=i;
			sum = 0;
			while(n>0)
			{
			a = n%10;
			n = n/10;
			sum = sum +a;
		    }
			if(sum==8)
				System.out.println(" "+i);
	    }
    }
}