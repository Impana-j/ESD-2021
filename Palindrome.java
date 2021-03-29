//22. Check whether the number is a palindrome number or not.
public class Palindrome {

    public static void main(String[] args) {

        int num = 343, reversed = 0, remainder, original;

        original = num;

        // reversed integer is stored in variable 
        while( num != 0 )
        {
            remainder = num % 10;
            reversed= reversed * 10 + remainder;
            num  /= 10;
        }

        // palindrome if orignalInteger and reversedInteger are equal
        if (original == reversed)
            System.out.println(original + " is a palindrome.");
        else
            System.out.println(original + " is not a palindrome.");
    }
}