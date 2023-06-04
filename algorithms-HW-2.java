/**
 * Реализовать сортировку подсчетом
 * [1 2 3 3 2 3 4 2 1 1 2 3 4 4 2 3 1 4 2 3 4 2 1 2 3 4 2 1 3 4 2 1 2 3 4 4 2 3 3 2 4]
 * Подсчитываем, сколько раз встречается конкретный элемент
 * 1 -> 5 (количество единиц в массиве: число взято с потолка!)
 * 2 -> 7 (количество двоек в массиве)
 * 3 -> 3
 * 4 -> 4
 *        * Вставляем единицу 5 раз
 * Вставляем двойку 7 раз
 * Вставялем тройку 3 раза
 * Вставляем четверку 4 раза
 * */

static void countingSort(int[] array) {

}

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 2, 3, 4, 2, 1, 1, 2, 
            3, 4, 4, 2, 3, 1, 4, 2, 3, 4, 2, 1, 2, 3, 4, 
            2, 1, 3, 4, 2, 1, 2, 3, 4, 4, 2, 3, 3, 2, 4};
        countingSort(array);
    }
    
    static void countingSort(int[] array) {
        int[] count = new int[array.length];
        for (int number : array) {
            count[number]++;            
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                System.out.println(i + " -> " + count[i]);
            }
        }
    }
}


public class CountingSort {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 2, 3, 4, 2, 1, 1, 2, 
            3, 4, 4, 2, 3, 1, 4, 2, 3, 4, 2, 1, 2, 3, 4, 
            2, 1, 3, 4, 2, 1, 2, 3, 4, 4, 2, 3, 3, 2, 4};
        int k = 50;
        countingSort(array, k);
    }
    
    static void countingSort(int[] array, int k) {
        int[] count = new int[k + 1];
        for (int number : array) {
            count[number]++;
            
        }
        int z = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                array[z] = i;
                z++;
                count[i]--;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}