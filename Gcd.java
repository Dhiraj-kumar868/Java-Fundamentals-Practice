/*WAP to find the GCD of n numbers.*/

import java.util.Scanner;
public class Gcd{
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the elements one by one: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        int min=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int count;
        for(int i=min;i>=1;i--){
            count=0;
            for(int j=0;j<n;j++){
                  if(arr[j]%i==0){
                      count++;
                  }
            }
            if(count==n){
                System.out.println("HCF of given n numbers : "+i);
                break;
            }
        }
    }
}