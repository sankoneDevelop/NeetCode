package ArraysHashing;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecodeStrings {

    // Design an algorithm to encode a list of strings to a single string. The encoded string is then decoded back to the original list of strings.

    public static String encode(List<String> strs) {
        if (strs.isEmpty()) return "";
        StringBuilder res = new StringBuilder();
        List<Integer> sizes = new ArrayList<>();
        for (String str : strs) {
            sizes.add(str.length());
        }
        for (int size : sizes) {
            res.append(size).append(',');
        }
        res.append('#');
        for (String str : strs) {
            res.append(str);
        }
        return res.toString();
    }

    public static List<String> decode(String str) {
        if (str.length() == 0) {
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        int i = 0;
        while (str.charAt(i) != '#') {
            StringBuilder cur = new StringBuilder();
            while (str.charAt(i) != ',') {
                cur.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(cur.toString()));
            i++;
        }
        i++;
        for (int sz : sizes) {
            res.add(str.substring(i, i + sz));
            i += sz;
        }
        return res;
    }

    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        strs.add("пуси бой");
        strs.add("киллер");

        String res = encode(strs);
        System.out.println(encode(strs));
        System.out.println(decode(res));
    }
}
