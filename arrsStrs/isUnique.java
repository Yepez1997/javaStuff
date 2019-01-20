import java.util.HashMap;
/* Determaine if a string has unique characters */
public class isUnique {

    public static void main(String args[]) {
        String s  = "asdfghwqai";
        boolean unique = Unique(s);
        System.out.println(unique);
    }

    public static boolean Unique(String s) {
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); ++i) {
            if (!(map.containsKey(s.charAt(i)))) {
                map.put(s.charAt(i),i);
            }
            else {
                return false;
            }
        }
        return true; 
    }
}

