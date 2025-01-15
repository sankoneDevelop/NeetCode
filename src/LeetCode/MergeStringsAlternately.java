package LeetCode;

public class MergeStringsAlternately {


    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int fP = 0;
        int sP = 0;
        while (sb.length() != word1.length() + word2.length()) {
            if (fP < word1.length()) {
                sb.append(word1.charAt(fP));
                fP++;
            } else {
                for (int i = sP; i < word2.length(); i++) {
                    sb.append(word2.charAt(i));
                    sP++;
                }
            }
            if (sP < word2.length()) {
                sb.append(word2.charAt(sP));
                sP++;
            } else {
                for (int i = fP; i < word1.length(); i++) {
                    sb.append(word1.charAt(i));
                    fP++;
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String f = "abcd";
        String s = "12";

        System.out.println(mergeAlternately(f, s));
    }

}
