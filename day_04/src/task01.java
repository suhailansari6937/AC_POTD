// Leetcode 1979. Find Greatest Common Divisor of Array
import java.util.Scanner;

public class task01 {

        static int findGCD(int[] nums) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int i=0;i<nums.length;i++){
                if(nums[i]>max) max = nums[i];
                if(nums[i]<min) min = nums[i];
            }
            while(min!=0){
                int rem = max%min;
                max = min;
                min = rem;


            }
            return max;

        }

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter length of array");
         int n = sc.nextInt();
         int arr[]=new int[n];
         System.out.println("Enter elements : ");
         for(int i=0;i<n;i++){
             arr[i] = sc.nextInt();
         }
         System.out.println(findGCD(arr));

    }
}
