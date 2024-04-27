import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 20, 25, 30, 35, 40};

        int[] Five = filter(numbers);

        System.out.println("Четные числа из массива, которые делятся на 5 без остатка:");
        System.out.println(Arrays.toString(Five));
    }

    public static int[] filter(int[] arr) {
        int count = 0;

        for (int num : arr) {
            if (num % 2 == 0 && num % 5 == 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int num : arr) {
            if (num % 2 == 0 && num % 5 == 0) {
                result[index] = num;
                index++;
            }
        }

        return result;
    }
}
/* 2 часть
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] x = new int[] {4, 9, 3, 2, 5, 18, 21, 7, 11, 15, 5, 17};

        int[] sortedAsc = sortArr(x);
        int[] sortedDesc = sortRevers(x);

        System.out.println("Отсортированный массив в порядке возрастания:");
        System.out.println(Arrays.toString(sortedAsc));

        System.out.println("Отсортированный массив в порядке убывания:");
        System.out.println(Arrays.toString(sortedDesc));
    }

    public static int[] sortArr(int[] arr) {
        int[] sortedArray = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArray);
        return sortedArray;
    }

    public static int[] sortRevers(int[] arr) {
        int[] sortedArray = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArray);
        int[] reversedArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = sortedArray[arr.length - 1 - i];
        }

        return reversedArray;
    }
}
 */