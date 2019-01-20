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
