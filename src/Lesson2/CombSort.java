package Lesson2;

import java.util.Arrays;

/*
    Сортировка расчёской. Улучшенная версия сортировки пузырьком.
 */
public class CombSort {
    public static void main(String[] args) {
        int[] arrayToSort = new int[10];
        for (int i = 0; i < arrayToSort.length; i++) {
            arrayToSort[i] = (int)(Math.random()*10);
        }
        System.out.println(Arrays.toString(arrayToSort));
        System.out.println();

        sort(arrayToSort);
        System.out.println();
        System.out.println(Arrays.toString(arrayToSort));




    }

    public static void sort(int[] input) {
        int gap = input.length;
        boolean swapped = true;

        while (gap > 1 || swapped) {

            if (gap > 1) {
                gap /= 1.247330950103979f;
            }

            int i = 0;

            swapped = false;

            while (i + gap < input.length) {
                if (input[i] > input[i + gap]) {
                    int t = input[i];
                    input[i] = input[i + gap];
                    input[i + gap] = t;
                    swapped = true;
                }
                System.out.println(Arrays.toString(input));
                i++;
            }
        }
    }
}
