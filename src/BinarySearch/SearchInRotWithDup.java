package BinarySearch;

public class SearchInRotWithDup {
    public static void main(String[] args) {
        int[] arr = {1, 4,7,9, 15 , 9 ,3,15,6};
        int target = 15;
        int ans = search(arr, target);
        System.out.println("Target found at index: " + ans);
    }

    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        if (pivot == -1) {
            // Array is not rotated
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // If target is at the pivot
        if (nums[pivot] == target) {
            return pivot;
        }

        // Determine which side to search
        if (nums[0] <= target) {
            return binarySearch(nums, target, 0, pivot - 1);
        } else {
            return binarySearch(nums, target, pivot + 1, nums.length - 1);
        }
    }

    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid is pivot
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            // Check if mid-1 is pivot
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // Handle duplicates: shrink range
            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
                if (nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;
                if (nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
