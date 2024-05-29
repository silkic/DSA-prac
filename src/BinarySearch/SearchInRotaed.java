package BinarySearch;

public class SearchInRotaed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8,9,10,14,25,65,2,4,5,6,7};
        int ans = rotated(arr);
         System.out.println(ans);
        }
	 static int findPivot(int[] nums){
	        int start = 0;
	        int end =  nums.length -1;
			while(start <= end) {
				int mid = start +(end - start)/2;
				if( mid > start && nums[mid] < nums[mid-1]) {
					return mid-1;
				}
				else if(mid < end && nums[mid] > nums[mid + 1]) {
					return mid;
				}
				if(nums[start] <= nums[mid]) {
					start = mid+1;
				}
				else
				{
					end = mid -1;
				}
		}
			return -1;
	    }
	static int rotated(int[] arr) {
		int start = 0 ;
		int end = arr.length -1 ;
		while(start <= end) {
			int mid = start +(end - start)/2;
			if(arr[mid] < arr[mid-1] && mid > start) {
				return arr[mid-1];
			}
			else if(arr[mid] > arr[mid +1] && mid < end) {
				return arr[mid];
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
	}}