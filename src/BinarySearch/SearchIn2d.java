package BinarySearch;

import java.util.Scanner;

public class SearchIn2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter rows:  ");
         int row = sc.nextInt();
         System.out.println("Enter columns:  ");
         int col = sc.nextInt();
         int[][] matrix = new int[row][col];
         System.out.println("Enter matrix elements : ");
         for(int i = 0 ; i < row; i++) {
        	 for(int j = 0; j < col; j++) {
        		 matrix[i][j] = sc.nextInt();
        	 }
         }
         System.out.println("Enter target element :");
         int target = sc.nextInt();
       System.out.println(searchMatrix(matrix,target));
       sc.close();
	}

	    public static boolean searchMatrix(int[][] matrix, int target) {
	         if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
	            return false;
	        }
	       int rows = matrix.length;
	        int cols = matrix[0].length;
	        int r = 0;
	        int c = cols - 1;
	        while (r < rows && c >= 0){
	            if(matrix[r][c] == target){
	                return true;
	            }
	            else if(matrix[r][c] < target){
	                r++;
	            }
	            else{
	                c--;
	            } 
	        }
	        return false;
	    }
	}
