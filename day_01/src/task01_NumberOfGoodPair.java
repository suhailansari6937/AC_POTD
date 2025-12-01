import java.util.Scanner;

public class task01_NumberOfGoodPair {

    static int numIdenticalPairs(int[] nums) {
        int ans =0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]) ans++;

            }
        }
        return ans;

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
        int ans =numIdenticalPairs(arr);
        System.out.println(ans);
    }
}
