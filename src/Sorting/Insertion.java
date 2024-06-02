package Sorting;

public class Insertion {

class Solution {
    // This method inserts an element into its correct position within the sorted portion of the array
    static void insert(int arr[], int i) {
        int key = arr[i];
        int j = i - 1;

        // Move elements of arr[0..i-1], that are greater than key,
        // to one position ahead of their current position
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }

    // Function to sort the array using insertion sort algorithm
    public void insertionSort(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            insert(arr, i);
        }
    }
}
}
