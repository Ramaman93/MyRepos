package Arrays;

import java.util.HashMap;

public class TwoSum {


    //    public int[] twoSum(int[] nums, int target) {
//        for (int i = 1; i <= nums.length; i++) {
//            int[] a = new int[0];
//            for (int j = i; j <= nums.length; j++) {
//                if (target == (nums[i] + nums[j + 1])) {
//                    a = new int[]{i, j};
//                }
//
//            }
//            return a;
//        }
//    }
    public int[] twoSum(int[] nums, int target) {
        // Map to store the complement of each element and its index
        HashMap<Integer, Integer> complementMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // Check if the complement is already in the map
            if (complementMap.containsKey(complement)) {
                // Return the indices of the two numbers that add up to the target
                return new int[]{complementMap.get(complement), i};
            }
            // If complement is not found, store the current element and its index in the map
            complementMap.put(nums[i], i);
        }
        // If no such indices are found, return an empty array or handle it according to your requirements
        return new int[0];
    }







    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = solution.twoSum(nums, target);

        // Print the result
        for (int index : result) {
            System.out.print(index + " ");
        }
    }
}