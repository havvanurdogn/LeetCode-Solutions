import java.util.Scanner;
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int [] result = new int [2];
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = 0 ; j < nums.length ; j++){
                if(i==j);
                else {
                    if((nums[i]+nums[j])==target){
                        result[0] = i;
                        result[1] = j;
                        return result;
                    }
                }
            }

        }
        return new int[0];

    }
}