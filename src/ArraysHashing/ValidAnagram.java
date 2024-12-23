package ArraysHashing;

import java.util.Arrays;

public class ValidAnagram {

    // Given two strings s and t, return true if t is an anagram of s, and false otherwise.

    public boolean isAnagram(String s, String t) {
        char[] first = s.toCharArray();
        char[] second = t.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first, second);
    }


}
