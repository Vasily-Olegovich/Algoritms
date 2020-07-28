package Lesson2;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        //standardArrays();

        Array arr3;
        arr3 = new Array(5);

        Array arr4 = new Array(5,2,4,3,1,3,3);
        System.out.println(arr4);
        arr4.sortBubble();
        System.out.println(arr4);
        System.out.println(arr4.hasValue(5));
        System.out.println(arr4.find(3));

        arr4.deleteAll(3);
        System.out.println(arr4);
        arr4.deleteAll();
        System.out.println(arr4);
    }

    private static void standardArrays() {
        int[] arr; //int arr[]
        arr = new int[5];

        int[] arr2 = {1,2,3,4,5};

        System.out.println(arr.length);

        System.out.println(arr2[3]);

        System.out.println(arr);

        System.out.println(Arrays.toString(arr2));
    }
}
