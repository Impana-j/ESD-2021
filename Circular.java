//28. Implement a Java program to check if a given number is circular prime or not.
import java.util.Scanner;
public class Circular  {

       public static void main( String args[] ){ 
        int num; 
        Scanner sc = new Scanner( System.in ); 
        System.out.print("Input a number: "); 
        num = sc.nextInt(); 
        int num_of_digits = 0, divisor=1, circular = num; 
        boolean allPrime = true; 
		//to check circular prime or not
        for( int i = num; i > 0; i /= 10 ){
            num_of_digits++;
            divisor *=10;
        }
        divisor/=10;
		// for next circular permutation
        do{
            circular = circulate_func( circular, divisor );
            if( !Prime( circular ) )
			allPrime=false;
        }
		while( circular!= num );
        if( allPrime )
		System.out.println("It is Circular Prime number." );
        else 
		System.out.println("It is not a Circular Prime number." );
    }


	public static boolean Prime( int n ){
        int Count = 0;
        if( n < 2 ) return false;
        else if( n == 2 ) return true;
        else if( n % 2 == 0 ) return false;
        else{
            int num = (int) Math.sqrt( n );
            for( int i = 3 ; i <= num; i+=2 ){
                if( n %i == 0 ){
                    return false;
                }
            }
        }
        return true;
    }
    public static int circulate_func( int n, int divisor ){
         if( n < 10 ) 
	      return n; 
         else 
	      return ( n % divisor ) * 10 + n / divisor; 
   } 
  
}
