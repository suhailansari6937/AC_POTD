//Leetcode 283. Move Zeroes

public class problem3 {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i=0;
        int j =0;
        while(j<=n-1){
            if(i>j) j=i;
            else if(nums[j]==0) j++;
            else if(nums[i]!=0) i++;
            else{
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
        }
        /*
         int count=0;
        int k =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[k++] = nums[i];

            }
            else count++;

        }
        while(count>0){
            nums[k++] = 0;
            count--;
        }

        } */

    }
}
