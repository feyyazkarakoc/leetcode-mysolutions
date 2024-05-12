package problems;

import java.util.Arrays;

public class P26_Remove_Duplicates_From_Sorted_Array {
    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println( removeDuplicates(nums));

    }

    public static int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                k++;
                nums[k] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return k+1;
    }
}

