//204. Count Primes

import java.util.*;
public class task01 {
    static int sieveAlgo(int n ){
        int ans [] = new int [n+1];
        int count=0;
        for(int i=2;i<=n;i++){
            ans[i]=1;
        }
        for(int i=2;i*i<=n;i++){
            if(ans[i]==1){
                for(int j=i*i;j<=n;j+=i){
                    ans[j]=0;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(ans[i]==1) count++;
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sieveAlgo(n));


    }
}
