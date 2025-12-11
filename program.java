import java.util.*;

public class Main {

    static void quicksort(int[] a, int left, int right) {
        if (left >= right) return;
        int pivot = a[(left + right) / 2];
        int i = left, j = right;

        while (i <= j) {
            while (a[i] < pivot) i++;
            while (a[j] > pivot) j--;
            if (i <= j) {
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                i++; j--;
            }
        }

        quicksort(a, left, j);
        quicksort(a, i, right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        quicksort(a, 0, n - 1);

        for (int x : a)
            System.out.print(x + " ");
    }
}
