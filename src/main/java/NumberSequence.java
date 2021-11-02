import java.util.Arrays;

public class NumberSequence {
    private final int[] arr;

    // The constructor should make an array of a given size
    // The array should then be filled with the values starting at the
    // given startValue and counting up by 1
    // e.g. new NumberSequence(5, 10) should create a NumberSequence whose
    // array arr contains: [5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
    public NumberSequence(int start,int length) {
        int count = 0;
        this.arr = new int[length];
        for(int i = start;i<start+length;i++){
            this.arr[count]=i;
            count++;
        }
    }

    // Calls Arrays.toString for the toString method
    @Override
    public String toString() {
        return "NumberSequence contains: " + Arrays.toString(this.arr);
    }
}
