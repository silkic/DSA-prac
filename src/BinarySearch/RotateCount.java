package BinarySearch;

public class RotateCount {
	 public static void main(String[] args) {
	        int[] arr = {1,2,3};
	        int ans = count(arr);
	        System.out.println("No.of times rotated : " + ans);
	    }
	 private static int count(int[] arr) {
		 int pivot = findPivot(arr);
		 return pivot+1;
		 }
	 static int findPivotwithdup(int[] arr) {
	        int start = 0;
	        int end = arr.length - 1;

	        while (start <= end) {
	            int mid = start + (end - start) / 2;

	            // Check if mid is pivot
	            if (mid < end && arr[mid] > arr[mid + 1]) {
	                return mid;
	            }

	            // Check if mid-1 is pivot
	            if (mid > start && arr[mid] < arr[mid - 1]) {
	                return mid - 1;
	            }

	            // Handle duplicates: shrink range
	            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
	                if (arr[start] > arr[start + 1]) {
	                    return start;
	                }
	                start++;
	                if (arr[end] < arr[end - 1]) {
	                    return end - 1;
	                }
	                end--;
	            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
	                start = mid + 1;
	            } else {
	                end = mid - 1;
	            }
	        }
	        return -1;
	    }
	 static int findPivot(int[] arr){
	        int start = 0;
	        int end =  arr.length -1;
			while(start <= end) {
				int mid = start +(end - start)/2;
				if( mid > start && arr[mid] < arr[mid-1]) {
					return mid-1;
				}
				else if(mid < end && arr[mid] > arr[mid + 1]) {
					return mid;
				}
				if(arr[start] <= arr[mid]) {
					start = mid+1;
				}
				else
				{
					end = mid -1;
				}
		}
			return -1;
	    }
}
