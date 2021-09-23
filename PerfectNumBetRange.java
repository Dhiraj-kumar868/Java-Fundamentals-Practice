/* WAP to display all perfect numbers between 1 and 1000 ?*/

public class PerfectNumBetRange {
    public static void main(String[] args) {
        int start = 1, end = 1000, sum;
        for (int j = start; j < end; j++) {
            sum=0;
            for (int i = 1; i <= j / 2; i++) {
                if (j % i == 0) {
                    sum += i;
                }
            }
            if(j==sum){
                System.out.print(j+" ");
            }
        }
    }
}
