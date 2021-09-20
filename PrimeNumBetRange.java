/* WAP to display all prime numbers between 1 and 1000 ?*/

public class PrimeNumBetRange {
    public static void main(String[] args) {
        int start = 1, end = 1000, count;
        for (int j = start; j < end; j++) {
            count=0;
            for (int i = 2; i <= j / 2; i++) {
                if (j % i == 0) {
                    count++;
                }
            }
            if(count==0){
                System.out.print(j+" ");
            }
        }
    }
}
