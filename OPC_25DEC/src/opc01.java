//A. Santa and the Gifts
import java.util.*;

public class opc01 {
    static void possibleGift(int n ) {
      if(n==0 || n==1){
          System.out.println("YES");
          return;
      }
      int sum=1;
      int x = 1;
      for(int i=0;i*i<=n;i++){
          sum*=2;
          x+=sum;
          if(x == n) {
              System.out.println("YES");
              return;
          }
      }
        System.out.println("NO");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        possibleGift(n);
    }
}
