package ArraysHashing;

import java.util.*;

public class GroupAnagrams {

    // Given an array of strings strs, group the anagrams together. You can return the answer in any order.
    //
    // Input: strs = ["eat","tea","tan","ate","nat","bat"]
    //
    // Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] tempCharArr = word.toCharArray();
            Arrays.sort(tempCharArr);
            String sortedWord = new String(tempCharArr);
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values());

    }
}
