package Lesson1;

public class One {
    // возведение числа в степень O(n)

    private static int power(int base, int sign) {
        int result = 1;
        for (int i = 0; i < sign; i++)
            result *= base;

        return result;
    }

    // рекурсивное возведение числа в степень O(n)
    private static int pr(int base, int sign) {
        if (sign == 0) return 1;
        return pr(base,  --sign) * base;
    }

    // рекурсивное возведение числа в степень с использованием четности степени O(log n)
    private static int pre(int base, int sign) {
        if (sign == 0)
            return 1;
        else if (sign % 2 == 0) {
            return pre(base * base, sign / 2);
        } else {
            return base * pre(base, --sign);
        }
    }

    // поиск минимума в массиве O(n)
    private static int arrMin(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < result)
                result = arr[i];

        return result;
    }

    // вычислеие вреднего арифметического O(n)
    private static float arrMean(int[] arr) {
        float result = 0;
        int size = arr.length;
        for (int i = 0; i < size; i++)
            result += arr[i];

        return result / size;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 9));
        System.out.println(pr(2, 10));
        System.out.println(pre(2, 11));

        int[] array = {5, 1, 4, 2, 0, 3};
        System.out.println(arrMin(array));
        System.out.println(arrMean(array));
    }
}
