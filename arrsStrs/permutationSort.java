import java.util.*;
import java.lang.*;

class permutationSort {
    public static void main(String args[]) {
        String oneStr = "akpvff";
        String twoStr = "zdnfoas";
        boolean isPerm = isPermutation(oneStr, twoStr);
        System.out.println(isPerm);
    }

    static String sort(String s) {
        char[] content = s.toCharArray(str);
        java.util.Arrays.sort(content);
        return new String(content);
    }

    static boolean isPermutation(String one, String two) {
        if (one.length() != two.length()) {
            return false;
        }
        return sort(one).equals(sort(two));
    }
}




