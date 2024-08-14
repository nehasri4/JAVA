public class BinarySearch {

    // Method to perform binary search
    public static int binarySearch(int[] sortedArray, int target) {
        int left = 0;
        int right = sortedArray.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is present at mid
            if (sortedArray[mid] == target) {
                return mid; // Target found, return its index
            }

            // If target is greater, ignore the left half
            if (sortedArray[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // Target is not present in the array
        return -1;
    }

    public static void main(String[] args) {
        // Example sorted array
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 7;

        // Perform binary search
        int result = binarySearch(sortedArray, target);

        // Display the result
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
