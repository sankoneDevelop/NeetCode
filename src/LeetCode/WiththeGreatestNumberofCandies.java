package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WiththeGreatestNumberofCandies {

     public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int[] temp = Arrays.copyOf(candies, candies.length);
        Arrays.sort(temp);
        int maximum = temp[temp.length - 1];

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= maximum) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }

}
