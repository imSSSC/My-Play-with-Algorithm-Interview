package unit03.binarySearch;

public class BinarySearch {

    private BinarySearch() {
    }

    public static int binarySearch(Integer[] arr, int n, Integer target) {

        int l = 0, r = n - 1;// 在[l,r]的范围里寻找target
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (target.equals(arr[mid])) {
                return mid;
            }
            if (target.compareTo(arr[mid]) > 0) {
                l = mid + 1;
            } else
                r = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int n = (int) Math.pow(10, 7);
        Integer[] data = Util.generateOrderedArray(n);

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            if (i != binarySearch(data, n, i)) {
                throw new IllegalStateException("find i failed!");
            }
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Binary Search test complete");
        System.out.println("Time cost: " + (endTime - startTime) + " ms");
    }
}
