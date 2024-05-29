package BinarySearch;

import java.util.Scanner;

public class SmallestLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter no.of characters in an array : ");
        int  c = sc.nextInt();
        char[] arr = new char[c];
        System.out.println("Enter the characters :");
        for(int i = 0;i < c;i++)
        {
        	arr[i] = sc.next().charAt(0);
        }
        System.out.println("Enter target element :");
        char target = sc.next().charAt(0);
        char ans = smalLetter(arr, target);
        System.out.println("Smallest letter is "+ans);
        sc.close();
        }
 private static char smalLetter( char[] arr, char target) {
		// TODO Auto-generated method stub
	 int start = 0;
	 int end = arr.length-1;
	 
	 if (target >= arr[end]) {
         return arr[start];
     }
	 while(start <= end) {
		 int mid = start + (end - start)/2;
		 if(arr[mid] < target) {
			 start = mid +1;
		 }
		 else  {
			 end =  mid-1;
		 }
	}
	 return arr[start];
	}
	}

