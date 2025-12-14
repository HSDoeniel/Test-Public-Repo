import java.util.Scanner;

public class Main {

    // Generic function name as requested
    static int f(int[] a, int x) {
        int l = 0;
        int r = a.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (a[m] == x) {
                return m;
            }
            if (a[m] < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        int res = f(a, x);

        System.out.println(res);
    }
}
