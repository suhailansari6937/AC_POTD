// 1518. Water Bottles -- Leetcode

import java.util.Scanner;

public class task02 {
    static int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while(numBottles>=numExchange){
            int a = numBottles/numExchange;
            int b = numBottles%numExchange;
            ans+=a;
            numBottles = a+b;
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nBottle= sc.nextInt();
        int eBottles = sc.nextInt();
        System.out.println(numWaterBottles(nBottle, eBottles));

    }
}
