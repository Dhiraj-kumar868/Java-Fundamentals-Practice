/*Write a Program to convert a number from decimal to binary*/

public class DecToBin {
    public static void main(String[] args) {
        int num = 5, rem, i = 0;
        int arr[] = new int[10];
        while (num > 0) {
            rem = num % 2;
            arr[i] = rem;
            num /= 2;
            i++;
        }
        for (int j = i; j >= 0; j--) {
            System.out.print(arr[j]);
        }
    }
}
