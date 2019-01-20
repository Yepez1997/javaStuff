import java.awt.List;
import java.util.*;

import com.sun.tools.javac.resources.compiler;

class twosum {
    public static void main(String args[]){
        
    ArrayList<Integer> arr = new ArrayList<Integer>(); 
    arr.add(1);
    arr.add(5);
    arr.add(5);
    arr.add(3);
    arr.add(5);
    HashMap<Integer, Integer> map = new HashMap<Integer,Integer>(); 
    int target = 10;
    ArrayList<Integer> result = twoSum(arr, map, target);
    for(int i : result) {
        System.out.println(i);
    }
}

    public static ArrayList<Integer> twoSum(ArrayList<Integer> arr, HashMap<Integer, Integer> map, int target) {
        // insert to hashmap
        ArrayList<Integer> result = new ArrayList<Integer>(); 
        for (int i = 0; i < arr.size(); ++i) {
            map.put(arr.get(i), i);
        }      
        int complement; 
        for (int j = 0; j < arr.size(); ++j) {
                complement = target - arr.get(j);
                if (map.containsKey(complement)) {
                    result.add(j);
                    result.add(map.get(complement));
                    return result;
            }
        }
        return result;
    }
}



