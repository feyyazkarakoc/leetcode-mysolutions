package problems;

import java.util.ArrayList;
import java.util.List;

public class P198_HouseRobber {

    public static void main(String[] args) {

        int[] nums = {1,2,3,1};
        System.out.println(rob(nums));

    }


    public static int rob(int[] nums) {
        int x = 0;
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
          x = Math.max(nums[i],x);
          if (x==nums[i]){
              j=i;
          }

        }




        return x;
    }


}
