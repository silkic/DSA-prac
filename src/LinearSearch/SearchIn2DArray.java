package LinearSearch;

import java.util.Scanner;

public class SearchIn2DArray {

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
        System.out.println("Enter target element : ");
        int target =  sc.nextInt();
        boolean flag = false;
        for(row = 0; row < arr.length;row++) {
        	for(col = 0; col < arr.length;col++) {
        		if(arr[row][col] == target) {
        		    flag = true;
        			break;
        		}
        		}
        	if(flag) {
        		break;
        	}
        	}
        if(flag) {
        	System.out.println("Element found");
        }
        else {
        	System.out.println("Element not found");
        }
        sc.close();
	}
}
