//24. Implement a Java program to check whether a number is a Pronic Number or Heteromecic Number or not
import java.util.Scanner;

public class Pronic {

    public static void main(String args[])
       {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number : ");
        int num = sc.nextInt();
        int ans = 0;
    
        for(int i=0; i<num; i++)
        {
            if(i*(i+1) == num)
            {
                ans = 1;
                break;
            }
        }
         
        if(ans == 1)
            System.out.println("Pronic Number.");
        else
            System.out.println("Not a Pronic Number.");      
    }
}
