import java.util.Scanner;

public class task02 {
    static int checkParity(int [] arr) {
        int n = arr.length;
        int wrongEven =0;
        int wrongOdd =0;
        for(int i=0;i<n;i++){
            if(arr[i]%2!= i%2){
                if(arr[i]%2==0) wrongEven++;
                else wrongOdd++;
            }
        }
        if(wrongEven!=wrongOdd) return -1;
        return wrongEven;
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
             System.out.println(checkParity(arr));
         }
    }
}
