//A. Theatre Square
import java.util.Scanner;

public class task01 {
    static long coverSquare(long n, long m, long a){

       long row =0;
       long col =0;
       if(n%a ==0) {
           row = n / a;
       }
       else {
           row = n/a +1;
        }
       if(m%a==0){
           col = m/a;
       }
       else col = m/a+1;
        return row*col;

    }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         long n = sc.nextInt();
         long m = sc.nextInt();
         long a = sc.nextInt();
         long ans = coverSquare(n,m,a);
         System.out.println(ans);

    }
}
