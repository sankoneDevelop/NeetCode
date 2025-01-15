package ArraysHashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TopKFrequentElements {

    // Given an integer array nums and an integer k, return the k most frequent elements within the array.

    public static int[] topKFrequent(int[] nums, int k) {
        int[] count = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        int[] res = new int[1];
        Arrays.sort(count);
        int j = 0, flag = k;
        for (int i = count.length - 1; i > 1; i--) {
            while (flag > 0) {
                if (count[i] > 0) {
                    res[j] = i;
                    int[] newResult = Arrays.copyOf(res, res.length + 1);
                    j++;
                    res = newResult;
                    flag--;
                }
            }


        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));

    }
}
