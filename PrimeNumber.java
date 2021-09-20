/* WAP to check whether given number is prime number or not ?*/

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 7, count = 0;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                count += i;
            }
        }
        if (count== 0) {
            System.out.print(num + " is a prime number.");
        } else {
            System.out.print(num + " is not a prime number.");
        }
    }
}
