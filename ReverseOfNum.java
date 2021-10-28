/*WAP to display reverse of a given number ?*/

public class ReverseOfNum {
    public static void main(String[] args){
        int num=12345,rev=0;
        int temp=num;
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        System.out.println("Reverse of "+temp+" : "+rev);
    }
}
