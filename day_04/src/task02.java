// codeforce - Next round

import java.util.Scanner;

public class task02 {
    static int nextRound(int n, int k, Scanner sc){
        int ans=0;
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();

        }
        for(int i=0;i<n;i++){
            if(arr[i]>=arr[k-1] && arr[i]>0) ans++;
        }
        return ans;

    }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int k = sc.nextInt();
       System.out.println(nextRound(n,k,sc));

    }
}
