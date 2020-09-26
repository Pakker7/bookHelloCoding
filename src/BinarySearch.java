import org.junit.Test;

public class BinarySearch {
    @Test
    public void dkdk() {
        int[] mylist = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(binarySearch(mylist, 3));
    }

    public int binarySearch(int[] array, int item) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = array[mid];

            if (guess == item) {
                return mid;

            } else if (guess > item) {
                high = mid - 1;

            } else {
                low = mid + 1;
            }

        }
        return 0;
    }
}
