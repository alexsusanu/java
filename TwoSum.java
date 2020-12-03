import java.util.*;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
      
        try {
                for (int i = 0; i <= nums.length; i++){
                    for (int j = 1; j <= nums.length; j++){
                        if (nums[i] + nums[j] == target){
                           a[0] = i;
                           a[1] = j;
                          break;
                        }
                    
                    }
                } 
        }
        catch (Exception e){
            
        }
        return a;
    }

    public static void main(String[] args){
        int[] nums = {3,2,4};
        int target = 6;
        twoSum (nums, target);
    }

   
}
