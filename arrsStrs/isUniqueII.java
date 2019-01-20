public class isUniqueII {


    public static void main(String args[]) {
        s = "qwertyuio";
        boolean unique = isUniqueSol(s);

    }

    public boolean isUniqueSol(String s) {

        if (str.length() > 128) return false;
        boolean[] charSet = new boolean[128];
        for (int i = 0; i < s.length(); ++i) {
            int val = s.charAt(i);
            if (charSet[val]) {
                return false;
            }
            charSet[val] = true;
        }
        return true;
    }
    
}