import java.util.Scanner;

public class task01 {
    static int initialCode(int a, int b, String s){
        for(int i=0;i<b;i++){
            if(s.charAt(i)=='D'){
                a++;
                if(a==10) a=0;

            }
            if(s.charAt(i)=='U'){
                a--;
                if(a==-1) a=9;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of test case
        while (n-- > 0) {
            int t = sc.nextInt();

            int [] a = new int[t];
            for(int i=0;i<t;i++){
                a[i] = sc.nextInt();
            }
            for(int i=0;i<t;i++){
                int b = sc.nextInt();
                String s = sc.next();
                System.out.print(initialCode(a[i],b,s) +" ");

            }
            System.out.println();
        }
    }
}