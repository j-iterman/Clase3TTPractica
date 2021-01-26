package sorter;

import java.util.Comparator;

public class BubbleSortSorterImple implements Sorter{
    @Override
    public void sort(Object[] arr, Comparator c) {

        int largo = arr.length;

        for (int i = 0; i < largo; i++){
            for (int j = 0; j < largo-1; j++){
                if (c.compare(arr[j], arr[j+1]) > 0){
                    Object temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
}
