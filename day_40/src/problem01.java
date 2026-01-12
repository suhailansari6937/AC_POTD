/// Leetcode 88. Merge Sorted Array


import java.util.Scanner;

public class problem01 {
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0) return;
        int k = m+n-1;
        int j= n-1;
        int i =m-1;
        while(k>=0){
            if(j==-1) return;
            if (i==-1){
                nums1[k--] = nums2[j--];
            }
            else if(nums2[j]>=nums1[i]){
                nums1[k--] = nums2[j];
                j--;
            }
            else{
                nums1[k--] = nums1[i];
                i--;
            }


        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of m : ");
        int m = sc.nextInt();
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();
        System.out.println("Enter values for arr1 : ");
        int arr1[] = new int[m+n];
        for(int i=0;i<m+n;i++){
            arr1[i] = sc.nextInt();

        }
        System.out.println("Enter values for array 2: ");
        int arr2[] = new int[n];
        for(int i=0;i<n;i++){
            arr2[i] = sc.nextInt();
        }
        merge(arr1,m,arr2,n);
        for(int i=0;i<m+n;i++){
            System.out.print(arr1[i] +" ");
        }
        System.out.println();

    }

}
