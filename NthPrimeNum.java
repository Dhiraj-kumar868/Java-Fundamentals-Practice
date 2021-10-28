/*Write a Program to print nth prime number.*/

public class NthPrimeNum {
    public static void main(String[] args) {
        int j = 2, n = 5, count, c1 = 0;
        while (true) {
            count = 0;
            for (int i = 2; i <= j / 2; i++) {
                if (j % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                c1++;
                if (c1 == n) {
                    System.out.print(n+"th prime number is : "+j);
                    break;
                }
            }
            j++;
        }
    }
}
