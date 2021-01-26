package sorter;

import java.util.Arrays;
import java.util.Comparator;

public class QuickSortSorterImple implements Sorter{

    /* This function takes last element as pivot,
       places the pivot element at its correct
       position in sorted array, and places all
       smaller (smaller than pivot) to left of
       pivot and all greater elements to right
       of pivot */
    private int partition(Object[] arr, int low, int high, Comparator<Object> c)
    {
        Object pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than the pivot
            if (c.compare(arr[j], pivot) < 0)
            {
                i++;

                // swap arr[i] and arr[j]
                Object temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        Object temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    private void quicksort(Object[] arr, int low, int high, Comparator<Object> c) {

        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high, c);

            // Recursively sort elements before
            // partition and after partition
            quicksort(arr, low, pi-1, c);
            quicksort(arr, pi+1, high, c);
        }
    }

    @Override
    public void sort(Object[] arr, Comparator c) {
        quicksort(arr, 0, arr.length-1, c);
    }
}
