/* WAP to check whether given number is perfect number or not ?*/

public class PerfectNumber {
    public static void main(String[] args) {
        int num = 6, sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (num == sum) {
            System.out.print(num + " is a perfect number.");
        } else {
            System.out.print(num + " is not a perfect number.");
        }
    }
}
