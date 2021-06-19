package BruteForce;

import java.util.Scanner;

public class Q_2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = search(arr, n, m);
        System.out.println(result);
    }


    // 탐색
    static int search(int[] arr, int n, int m) {
        int result = 0;

        for (int i = 0; i < n - 2; i++) {

            if (arr[i] > m) {
                continue;
            }
            for (int j = i + 1; j < n - 1; j++) {

                if (arr[i] + arr[j] > m) {
                    continue;
                }

                for (int k = j + 1; k < n; k++) {

                    int temp = arr[i] + arr[j] + arr[k];

                    if (m == temp) {
                        return temp;
                    }

                    if (result < temp && temp < m) {
                        result = temp;
                    }
                }
            }
        }
        return result;
    }
}
