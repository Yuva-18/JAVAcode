package dsa.arrays;

import java.util.HashSet;

class Solution{
    public int removeDuplicate(int[] nums){
        if(nums.length == 0) return 0;

        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
    public int removeDuplicates(int[] nums){
        HashSet<Integer> seen = new HashSet<>();

        int index = 0;
        for(int num : nums){
            if(!seen.contains(num)){
                seen.add(num);
                index++;
            }
        }
        return index;
    }
}

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,2};

        Solution sol = new Solution();
        int k = sol.removeDuplicates(nums);
        int k1 = sol.removeDuplicate(nums);

        System.out.println("k = " + k);
        System.out.println("k1 = " + k1);

    }
}
