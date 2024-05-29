package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class FirstandLastPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
        System.out.println("Enter no.of elements in an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements :");
        for(int i = 0;i < n;i++)
        {
        	arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter target element :");
        int target = sc.nextInt();
		int[] res = searchinrange(arr,target);
		System.out.println(Arrays.toString(res));
	    sc.close();
        }
	public static int[] searchinrange(int[] arr, int target) {
		int[] ans = new int[2];
		int start = search(arr,target,true);
		int end = search(arr,target,false);
		ans[0] = start;
		ans[1] = end;
		return ans;
		
	}
 private static int search( int[] arr, int target,boolean findStartInd) {
		// TODO Auto-generated method stub
	 int ans = -1;
	 int start = 0;
	 int end = arr.length-1;
	 while(start <= end) {
		 int mid = start + (end - start)/2;
		 if(arr[mid] < target) {
			 start = mid +1;
		 }
		 else if(arr[mid] > target) {
			 end =  mid-1;
		 }
		 //otherwise it will be equal, so return mid
		 else {
			 ans = mid;
			 if(findStartInd) {
				 end =  mid -1;
			 }
			 else {
				 start =  mid  + 1;
			 }
		 }}
		return ans;
 }
}
