public class SortingCodeLab {
    // =========================================
    // BUBBLE SORT DESCENDING
    // =========================================
    static void bubbleSortDescending(int arr[]) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {

                // Swap if left element is smaller
                if (arr[j] < arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // Stop early if already sorted
            if (!swapped) {
                break;
            }
        }
    }

    // =========================================
    // SELECTION SORT DESCENDING
    // =========================================
    static void selectionSortDescending(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            // Assume current index is maximum
            int maxIndex = i;

            // Find the largest element
            for (int j = i + 1; j < n; j++) {

                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Swap elements
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // =========================================
    // PRINT ARRAY
    // =========================================
    static void printArray(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // =========================================
    // MAIN PROGRAM
    // =========================================
    public static void main(String[] args) {

        int[] bubbleData = {5, 1, 4, 2, 8, 3, 7, 6, 9, 0};
        int[] selectionData = {5, 1, 4, 2, 8, 3, 7, 6, 9, 0};

        // Original Array
        System.out.println("Original Array:");
        printArray(bubbleData);

        // Bubble Sort Descending
        bubbleSortDescending(bubbleData);
        System.out.println("\nBubble Sort Descending:");
        printArray(bubbleData);

        // Selection Sort Descending
        selectionSortDescending(selectionData);
        System.out.println("\nSelection Sort Descending:");
        printArray(selectionData);
    }
}
