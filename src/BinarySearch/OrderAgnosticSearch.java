package BinarySearch;

import java.util.Scanner;

public class OrderAgnosticSearch {

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
	        System.out.println("Enter target element :");
	        int target = sc.nextInt();
	        boolean ascen = arr[0] < arr[n-1];
	       int ans =  orderagnostic(arr,target,ascen);
	       if(ans != -1) {
	    	   System.out.println("Element found in index "+ans);
	       }
	       else {
	    	   System.out.println("Elememt not found");
	       } 
	       sc.close();
	}
   static int orderagnostic(int[] arr, int target,boolean ascen) {
		// TODO Auto-generated method stub
		
		 int end = arr.length-1;
		int start = 0;
		while(start  <= end) {
			 int mid = start + (end - start)/2;
			 if(arr[mid] == target) {
				 return  mid;
			 }
			 if(ascen) {
			 if(arr[mid] < target) {
				 start = mid +1;
			 }
			 else if(arr[mid] > target) {
				 end =  mid-1;
			 }}
			 else {
				 if(arr[mid] > target) {
					 start = mid +1;
				 }
				 else if(arr[mid] < target) {
					 end =  mid-1;
				 }
			 }
		 }
		 return -1;
	}
}
