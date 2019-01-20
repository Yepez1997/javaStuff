public class permutationsFrequency {


    public static void main(String args[]) {
        String oneStr = "hdgf";
        String twoStr = "fghd";
    }

    public boolean frequecy(String one, String two){
        // check sizes first
        if (one.length() != two.length()) {
            return false; 
        }
        int[] letters = new int[128];
        // add all initial values 
        for (int i = 0; i < one.size();  ++i) {
            letters[one.charAt(i)]++; 
        }
        // subract all and if less than zero return false 
        for (int j = 0; j < two.size(); ++j) {
            letters[two.charAt(i)]--; 
            if (letters[two.charAt(i)] < 0) {
                return false;
            }
        }
        return true;
    }
}