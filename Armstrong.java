class Armstrong {

    public static void main(String[] args) {

       int num = 243;
        int temp , remainder, result = 0;

        	temp = num;

        while (temp != 0)
        {
            remainder = temp % 10;
            result += Math.pow(remainder, 3);
            temp /= 10;
        }

        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}