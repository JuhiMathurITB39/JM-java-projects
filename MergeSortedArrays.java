import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {
        // Example arrays A and B
        int[] arrayA = {1, 3, 5, 7};
        int[] arrayB = {2, 4, 6, 8, 10};

        // Merge both arrays into a new array C
        int[] arrayC = new int[arrayA.length + arrayB.length];

        // Copy elements of arrayA into arrayC
        System.arraycopy(arrayA, 0, arrayC, 0, arrayA.length);
        // Copy elements of arrayB into arrayC after arrayA
        System.arraycopy(arrayB, 0, arrayC, arrayA.length, arrayB.length);

        // Sort the merged arrayC
        Arrays.sort(arrayC);

        // Display the merged and sorted arrayC
        System.out.println("Merged and sorted array C:");
        System.out.println(Arrays.toString(arrayC));
    }
}
