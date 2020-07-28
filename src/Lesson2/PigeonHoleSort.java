package Lesson2;

// Сортировка pigeon hole

import java.util.Arrays;

public class PigeonHoleSort {
    public static void main(String[] args) {

        int[] arr = new int[] {-1, 0, -2, -6, -2, 2, 1, 3, -3, 3, 1, 2};
        int[] arr1 = new int[] {-1, 0, -2, -2, 2, 1, 3, -3, 3, 1, 2, -6};
        System.out.println(Arrays.toString(arr));

        sort(arr);

        System.out.println(Arrays.toString(arr));
        
        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr));

    }
    public static void sort(int[] range) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int pigeonHolesRange;

        for (int value : range) {
            if (value > max)
                max = value;
            if (value < min)
                min = value;
        }
        System.out.println("min " + min);
        System.out.println("max " + max);

        pigeonHolesRange = max - min;

        System.out.println("pigeonHolesRange  " + pigeonHolesRange);

        int[] pigeonHolesArray = new int[pigeonHolesRange + 1];

        for (int i = 0; i < range.length; i++) {
            pigeonHolesArray[range[i] - min]++;
        }

        System.out.println("pigeonHolesArray " + Arrays.toString(pigeonHolesArray));

        int k = 0;

        for (int i = 0; i < pigeonHolesArray.length; i++) {
            if (pigeonHolesArray[i] != 0) {
                for (int j = 0; j < pigeonHolesArray[i]; j++) {
                    range[k] = i - min;
                    k++;
                }
            }
        }

    }
}
