package sorter;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws Exception {

        Sorter sorter = (Sorter) MiFactory.getInstance("sorter");

        Object[] arrEnteros = {10, 7, 8, 9, 1, 5};
        Comparator<Integer> c1 = (a, b) -> a - b;

        Object[] arrCadenas = {"a", "hola", "chau", "b", "como estas"};
        Comparator<String> c2 = (a, b) -> a.compareTo(b);

        sorter.sort(arrEnteros, c1);
        sorter.sort(arrCadenas, c2);

        System.out.println(Arrays.toString(arrEnteros));
        System.out.println(Arrays.toString(arrCadenas));

        Object[] arrCienMil = new Object[100000];

        for (int i = 0; i < 100000; i++) arrCienMil[i] = i;

        Time time = new Time();

        time.start();
        sorter.sort(arrCienMil, c1);
        time.stop();

        System.out.println(time.elapsedTime());
    }
}
