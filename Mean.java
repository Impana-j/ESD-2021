//14. Implement a JAVA program to find the Mean of given 5 numbers.
public class Mean {
   public static void main(String args[]){
      float mean;
      int sum, i;
      int n = 5;
      int a[] = {7,5,8,1,9};
      sum = 0;

      for(i = 0; i < n; i++) {
         sum+=a[i];
      }
      System.out.println("Mean ::"+ sum/(float)n);
   }
}