import java.util.*;


public class mergeSortedFiles {

    public mergeSortedFiles() {

    }

    // keep track of the value and the array the value came from 
    private static class ArrayEntry {
        public Integer value;
        public Integer arrayId;

        // constructor 
        public ArrayEntry(Integer value, Integer arrayId) {
            this.value = value;
            this.arrayId = arrayId;
        }
    }

    public static ArrayList<Integer> mergeSortedArray(List<ArrayList<Integer>> sortedArr) {
        // set up an iterator 
        List<Iterator<Integer>> iters = new ArrayList<>(sortedArr.size());
        for (ArrayList<Integer> array : sortedArr) {
            iters.add(array.iterator());
        }
        // set up a priority queue -- min heap property using a comparator 
        PriorityQueue<ArrayEntry> minHeap = new PriorityQueue<>(
            ((int)sortedArr.size()), new Comparator<ArrayEntry>() {
                @Override
                public int compare(ArrayEntry o1, ArrayEntry o2) {
                    return Integer.compare(o1.value, o2.value);
                }
            });
        for (int i = 0; i < iters.size(); ++i) {
            if (iters.get(i).hasNext()) {
                minHeap.add(new ArrayEntry(iters.get(i).next(), i));
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        while(!minHeap.isEmpty()) {
            ArrayEntry headEntry = minHeap.poll();
            result.add(headEntry.value);
            if (iters.get(headEntry.arrayId).hasNext()) {
                minHeap.add(new ArrayEntry(iters.get(headEntry.arrayId).next(),headEntry.arrayId));
            }
        }
        return result;
    }
}