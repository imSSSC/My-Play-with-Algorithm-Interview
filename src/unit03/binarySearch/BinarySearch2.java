package unit03.binarySearch;

public class BinarySearch2 {

    public static int binarySearch(Integer[] arr, int n, Integer target) {
        int l = 0, r = n; //在[r,n)中查找target
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid].equals(target)) {
                return mid;
            }
            if (arr[mid].compareTo(target) > 0) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = (int)Math.pow(10, 7);
        Integer data[] = Util.generateOrderedArray(n);

        long startTime = System.currentTimeMillis();
        for(int i = 0 ; i < n ; i ++)
            if(i != binarySearch(data, n, i))
                throw new IllegalStateException("find i failed!");
        long endTime = System.currentTimeMillis();

        System.out.println("Binary Search 2 test complete.");
        System.out.println("Time cost: " + (endTime - startTime) + " ms");
    }
}
