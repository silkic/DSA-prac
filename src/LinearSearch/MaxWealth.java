package LinearSearch;

import java.util.Scanner;

public class MaxWealth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
        System.out.println("Enter no.of rows :");
        int row = sc.nextInt();
        System.out.println("Enter no.of columns :");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("Enter array elements :");
        for(int i = 0; i < row; i++) {
        	for(int j =0 ; j <col; j++)
        	{
        		arr[i][j]= sc.nextInt();
        	}
        }
        	int max = Integer.MIN_VALUE;
        	 for (int k = 0; k < arr.length; k++) {
                 int rowsum = 0;
                 for (int j = 0; j < arr[k].length; j++) {
                     rowsum += arr[k][j];
                 }
        if (rowsum > max) {
        	max = rowsum;
        }
	}
        	 System.out.println(max);
 sc.close();
   }
	}