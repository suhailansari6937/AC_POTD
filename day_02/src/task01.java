// Shizuku Hoshikawa and Farm Legs

import java.util.Scanner;

public class task01 {
    static void farmLeg(int n, Scanner sc){


        while(n-->0){
            int count=0;
            int a = sc.nextInt();
            if(a%2!=0) {
                System.out.println(0);

            }
            else {
                for (int x = 0; 2 * x <= a; x++) {
                    if ((a - 2 * x) % 4 == 0) count++;

                }
                System.out.println(count);
            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        farmLeg(n,sc);

    }
}
