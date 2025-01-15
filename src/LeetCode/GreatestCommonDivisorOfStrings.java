package LeetCode;

public class GreatestCommonDivisorOfStrings {

    public static String gcdOfStrings(String str1, String str2) {
        if (!((str1 + str2).equals(str2 + str1))) return "";

        int f = str1.length();
        int s = str2.length();

        while (f != s) {
            if (f > s) {
                f = f - s;
            } else {
                s = s - f;
            }
        }
        return str1.substring(0, f);
    }

    public static void main(String[] args) {
        String f = "ABABABAB";
        String s = "AB";

        System.out.println(gcdOfStrings(f, s));
    }

}
