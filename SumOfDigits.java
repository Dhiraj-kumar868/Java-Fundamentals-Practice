/*WAP to display sum of the digits of a given number ?*/

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 12345, sum = 0;
        int temp = num;
        while (num > 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        System.out.println("Sum of the digits of " + temp + " : " + sum);
    }
}
