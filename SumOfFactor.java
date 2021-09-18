/*WAP to display sum of the factors of a given number ? */

public class SumOfFactor {
    public static void main(String[] args){
        int num=12,sum=0;
        for(int i=1;i<=12;i++){
            if(num%i==0){
               sum+=i;
            }
        }
        System.out.print("Sum of all the factors of "+num+" : "+sum);
    }
}
    

