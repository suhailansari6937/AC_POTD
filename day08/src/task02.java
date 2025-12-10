import java.util.Scanner;

// long long code force - https://codeforces.com/problemset/problem/1843/B
public class task02 {
    static void longLong(int [] arr){
        int n = arr.length;
        long sum=0;
        long count=0;
        for(int i=0;i<n;i++){
            if(arr[i]<0) sum+=(-arr[i]);
            else sum+=arr[i];
        }
        int i=0;
       while(i<n){
           if(arr[i]<0){
               count++;

               while(i<n && arr[i]<=0){
                   i++;
               }
           }
           else{
               i++;
           }
       }
        System.out.println(sum+" "+count);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int t = sc.nextInt();
            int arr [] = new int[t];
            for(int i=0;i<t;i++){
                arr[i] = sc.nextInt();
            }
            longLong(arr);
        }

    }
}
