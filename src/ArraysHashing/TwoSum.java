package ArraysHashing;

import java.util.HashMap;

public class TwoSum {

    // Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    //
    // You may assume that each input would have exactly one solution, and you may not use the same element twice.
    //
    // You can return the answer in any order.


    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> result = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            result.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (result.containsKey(diff) && result.get(diff) != i) {
                return new int[]{i, result.get(diff)};
            }
        }
        return new int[]{};
    }
}