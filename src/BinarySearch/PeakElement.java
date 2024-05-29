package BinarySearch;


import java.util.Scanner;

public class PeakElement {

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
        int ans = peakelem(arr);
         System.out.println(ans);
         sc.close();
        }
 private static int peakelem( int[] arr) {
		// TODO Auto-generated method stub
	 int start = 0;
	 int end = arr.length-1;
	 while(start < end) {
		 int mid = start + (end - start)/2;
		 if(arr[mid] >  arr[mid+1]) {
			 end = mid ;
		 }
		 else {
			 start =  mid+1;
		 }
		}
		return arr[start];
 }
}
