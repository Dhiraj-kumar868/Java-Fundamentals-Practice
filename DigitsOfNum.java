/*WAP to display digits of a given number ?*/

public class DigitsOfNum {
    public static void main(String[] args){
        int num=12345;
        while(num>0){
            int rem=num%10;
            System.out.println(rem);
            num/=10;
        }
    }
}
