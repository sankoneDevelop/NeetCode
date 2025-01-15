package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountPairsWhoseSumIsLessThanTarget {
    public static int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int left = 0;
        int right = nums.size() - 1;
        int cnt = 0;
        while (left < right) {
            if (nums.get(left) + nums.get(right) < target) {
                cnt += right - left;
                left++;
            } else {
                right--;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(-1,1,2,3,1));

        int target = 2;


        System.out.println(countPairs(nums, 2));
    }
}
