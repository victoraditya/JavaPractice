package V1.Arrays;

import java.util.Arrays;


/*

O(n+m) complexity
 */
public class MergeSortedArrays {


    public static void main(String[] args) {
        int[] array1 = {2, 5, 7, 8};
        int[] array2 = {1, 6, 9, 11};

        Arrays.stream(mergeSortedArray(array1, array2)).forEach(System.out::println);

    }

    private static int[] mergeSortedArray(int[] array1, int[] array2) {
        int a1Length = array1.length;
        int a2Length = array2.length;
        int[] sortedAray = new int[a1Length + a2Length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a1Length && j < a2Length) {
            if (array1[i] < array2[j]) {
                sortedAray[k++] = array1[i++];
            } else {
                sortedAray[k++] = array2[j++];
            }
        }

        while (i < a1Length) sortedAray[k++] = array1[i++];
        while (j < a2Length) sortedAray[k++] = array2[j++];

        return sortedAray;
    }

}
