import java.io.*;
import java.nio.file.Watchable;
import java.util.*;

public class MergeSort {

    /**
     * Sorts the given array in ascending order.
     * DO NOT MODIFY THIS METHOD SIGNATURE.
     *
     * @param array The array to be sorted.
     * @return The sorted array.
     */
    public static String[] sort(String[] array) {
        // * * * * * * * *
        // Your Code Here
        mergeSort(array, 0, array.length - 1);
        return array;
        // * * * * * * * *

    }

    public static void merge(String[] array, int beginning, int middle, int end) {
        int indFirstHalf = middle - beginning + 1;
        int indSecondHalf = end - middle;

        String first[] = new String[indFirstHalf];
        String second[] = new String[indSecondHalf];

        for (int i = 0; i < indFirstHalf; i++) {
            first[i] = array[beginning + i];
        }

        for (int i = 0; i < indSecondHalf; i++) {
            second[i] = array[middle + 1 + i];
        }

        int i = 0;
        int j = 0;
        int x = beginning;

        while (i < indFirstHalf && j < indSecondHalf) {
            if (first[i].compareTo(second[j]) < 1) {
                array[x] = first[i];
                i++;
            } else {
                array[x] = second[j];
                j++;
            }
            x++;
        }

        while (i < indFirstHalf) {
            array[x++] = first[i++];
        }
        while (j < indSecondHalf) {
            array[x++] = second[j++];
        }

    }
    public static void mergeSort(String array[], int beginning, int end) {
        if (beginning < end) {
            int middle = beginning + (end - beginning) / 2;
            mergeSort(array, beginning, middle);
            mergeSort(array, middle + 1, end);
            merge(array, beginning, middle, end);

        }
    }
}