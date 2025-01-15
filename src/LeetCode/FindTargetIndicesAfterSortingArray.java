package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {

    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int stCnt = -1;
        int fnCnt = -1;

        List<Integer> result = new ArrayList<>();
        if (nums.length == 1 && nums[0] == target) {
            result.add(0);
            return result;
        }
        while (left <= right) {
            if (nums[left] == target) {
                if (nums[right] == target) {
                    stCnt = left;
                    fnCnt = right;
                    break;
                } else {
                    while (nums[right] != target) {
                        right--;
                    }
                }
            } else {
                left++;
            }
        }
        if (stCnt == 0 && fnCnt == 0) {
            return result;
        } else {
            for (int i = stCnt; i <= fnCnt; i++) {
                result.add(i);
            }
        }


        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1};
        int target = 1;

        System.out.println(targetIndices(nums, target));
    }
}
