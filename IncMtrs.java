//38. Implement a Java program that reads a number in inches, converts it to meters(CLA)
import java.util.Scanner;
public class IncMtrs {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a value for inch: ");
        double inch = input.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters");

    }
}
