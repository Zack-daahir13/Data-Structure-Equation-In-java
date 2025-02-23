// Java program for implementation of Bubble Sort
class BubbleSort {
    
    // Method to implement Bubble Sort
    void bubbleSort(int arr[]) {
        int n = arr.length;
        
        // Loop through the array multiple times
        for (int i = 0; i < n - 1; i++) {
            // Traverse the unsorted part of the array
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the current element is greater than the next
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to print the array
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Driver method to test the Bubble Sort
    public static void main(String args[]) {
        // Create a BubbleSort object
        BubbleSort ob = new BubbleSort();

        // Input array to be sorted
        int arr[] = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array:");
        ob.printArray(arr); // Print the original array

        // Sort the array
        ob.bubbleSort(arr);

        System.out.println("Sorted Array:");
        ob.printArray(arr); // Print the sorted array
    }
}
