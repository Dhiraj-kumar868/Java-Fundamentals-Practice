/*WAP to display factors of a given number ? */

public class Factor{
      public static void main(String[] args){
          int num=12;
          for(int i=1;i<=12;i++){
              if(num%i==0){
                  System.out.print(i+" ");
              }
          }
      }
}