public class lowerbound {
    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 6, 6 };
        int x = 5;
        System.out.println(lowerboundfunc(a, x));
    }

    public static int lowerboundfunc(int[] a, int x) {
        int l = 0, r = a.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (a[mid] >= x)
                r = mid;
            else
                l = mid+1;
        }
        return l+1;
    }
}
