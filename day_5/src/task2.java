// 2843. count symmetric integer

import java.util.Scanner;

public class task2 {
    static int countSymmetric(int low, int high){
                int ans =0;
                for(int i= low;i<=high;i++){
                    int num =i;
                    int num2=i;
                    int count=0;
                    while(num>0){
                        count++;
                        num/=10;
                    }
                    int half = count/2;
                    int leftSum=0;
                    int rightSum=0;
                    if(count%2!=0) continue;
                    while(count>half){
                        leftSum+=num2%10;
                        num2/=10;
                        count--;
                    }
                    while(count>0){
                        rightSum+=num2%10;
                        num2/=10;
                        count--;
                    }
                    if(leftSum==rightSum) ans++;

                }
                return ans;
            }


     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int low = sc.nextInt();
         int high = sc.nextInt();
         System.out.println(countSymmetric(low,high));

    }
}
