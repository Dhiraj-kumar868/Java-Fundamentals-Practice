/*Write a Program to print nth Fibonacci number. 0 1 1 2 3 5 8 13 21…….*/

public class NthFiboNum {
    public static void main(String[] args){
        int n=7;
        int f1=0,f2=1;
        int f=0;
        for(int i=3;i<=n;i++){
         f=f1+f2;
         f1=f2;
         f2=f;
        }
        if(n==1){
            System.out.println(n+"th Fibonacci number is : "+f1);
        }
        else if(n==2){
            System.out.println(n+"th Fibonacci number is : "+f2);
        }else{
            System.out.println(n+"th Fibonacci number is : "+f);
        }
    }
}
