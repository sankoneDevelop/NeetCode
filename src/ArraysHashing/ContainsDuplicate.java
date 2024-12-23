package ArraysHashing;

import java.util.HashMap;

public class ContainsDuplicate {

    public static boolean hasDuplicate(int[] nums) {

        HashMap<Integer, Integer> numbers = new HashMap<>();
        boolean result = false;
        for (int num : nums) {
            if (numbers.containsKey(num)) {
                int temp = numbers.get(num);
                numbers.put(num, numbers.get(num) + 1);
            } else {
                numbers.put(num, 1);
            }

        }
        for (int value : numbers.values()) {
            if (value > 1) {
                result = true;
                break;
            }
        }

        return result;
    }

}
