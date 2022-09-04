package homework;

import java.util.Arrays;
import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        reverseArray();
        emptyArray();
        lessThanSixArray();
        twoDimensionalArray();
        lenInitialValueArray();
        minAndMaxArray();
        System.out.println(leftAndRightArray());
    }

    public static void reverseArray() {
        int[] arr = {1, 1, 1, 0, 0, 1, 1, 0, 0};

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    public static void emptyArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    public static void lessThanSixArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    public static void twoDimensionalArray() {
        int[][] arr = new int[7][7];

        for (int i = 0; i < 7; i++) {
            arr[i][i] = 1;
            arr[i][6 - i] = 1;
        }
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++)
                System.out.printf("%2d", arr[i][j]);
            System.out.println();
        }
    }

    public static void lenInitialValueArray() {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int initialValue = sc.nextInt();
        int[] arr = new int[len];

        Arrays.fill(arr, initialValue);

        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    public static void minAndMaxArray() {
        int[] arr = {1, 2, 13, 4, 0, 6, 7, -8, 12};
        int arr_max = arr[0];
        int arr_min = arr[0];

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr_max) {
                arr_max = arr[i];
            } else if (arr[i] < arr_min) {
                arr_min = arr[i];
            }
        }
        System.out.println("Minimum array element is: " + arr_min);
        System.out.println("Maximum array element is: " + arr_max);
        System.out.println();
    }

    public static boolean leftAndRightArray() {
        int[] arr = {5, 2, 3, 1, 2, 3, 3, 1};
        System.out.println(Arrays.toString(arr));

            int left = 0, right = 0;

            for (int i : arr) {
                right += i;
            }
            for (int i = 0; i < arr.length; i++) {
                if (left == right) {
                    return true;
                }
                left += arr[i];
                right -= arr[i];
            }
        return false;
    }
}