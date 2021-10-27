/*Write a Program to check whether a number is a Harshad number or not. Harshad 
Number is an integer that is divisible by the sum of its digits.*/

public class HarshadNumber {
    public static void main(String[] args) {
        int num = 1729;
        int temp = num;
        int rem,sum=0;
        while (temp > 0) {
          rem=temp%10;
          sum=sum+rem;
          temp/=10;
        }
        if(num%sum==0){
            System.out.println(num+" is a Harshad number.");
        }else{
            System.out.println(num+" is not a Harshad number.");
        }
    }
}
