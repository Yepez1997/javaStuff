import java.util.*;

// Driver class to mergeSortedFiles.java 
public class Main {
    public static void main(String args[]) {
        List<ArrayList<Integer>> files =  new ArrayList<ArrayList<Integer>>();
        // create the three lists
        ArrayList<Integer> one = new ArrayList<Integer>();
        one.add(3);
        one.add(5);
        one.add(6);

        ArrayList<Integer> two = new ArrayList<Integer>();
        two.add(0);
        two.add(6);

        ArrayList<Integer> three = new ArrayList<Integer>();
        three.add(0);
        three.add(6);
        three.add(28);

        files.add(one);
        files.add(two);
        files.add(three);

        mergeSortedFiles sortedFiles = new mergeSortedFiles();
        ArrayList<Integer> res = sortedFiles.mergeSortedArray(files);

        for (Integer i : res) {
            System.out.println(i);
            // should be in sorted order 
        }

    }
}