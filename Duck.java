//26. Implement a Java program to check whether a number is a Duck Number or not
import java.util.Scanner;

public class Duck {

 public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number");
  int num=sc.nextInt();
  int i = 0;
  int r;
  while(num!=0)
  {
   r=num%10;
   if(r==0)
    i++;
   num=num/10;
   
   
  }
  if(i>0)
   System.out.println("It is a duck number");
  else
   System.out.println("It is not a duck number");
}
}