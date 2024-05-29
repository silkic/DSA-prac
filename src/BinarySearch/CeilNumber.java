package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class CeilNumber {

	public static void main(String[] args) {
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
        int ans = ceilnumber(arr, target);
        sc.close();
        if(ans != -1) {
        System.out.println("The Ceil number of "+target+" is " +ans);
        }else {
        	System.out.println("Element not found");
        }
        }
 private static int ceilnumber( int[] arr, int target) {
		// TODO Auto-generated method stub
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
			 return mid;
		 }}
		return arr[start];
	}
	}
