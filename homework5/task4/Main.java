package homework5.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {

            list.add((int) (random() * 10) + 10);
        }
        System.out.println(list);

        int min = list.get(0);
        int max = list.get(0);
        for (Integer i : list) {
            if (i < min) min = i;
            if (i > max)
                max = i;
        }
        System.out.println("минимальное число: " + min);
        System.out.println("максимальное число: " + max);
        System.out.println("index минимальнго число: " + list.indexOf(min));
        System.out.println("index максимальнго число: " + list.indexOf(max));

        ListIterator<Integer> iterator = list.listIterator();
        System.out.println("До увуличение на +1 = " + list);


        while (iterator.hasNext()) {

            iterator.set(iterator.next() + 1);
        }
        System.out.println("После увеличение на +1  = " + list);
    }
}


