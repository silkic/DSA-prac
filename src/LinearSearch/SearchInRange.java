package LinearSearch;


import java.util.*;
public class SearchInRange {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter no of elements in the array :");
       int n = sc.nextInt();
       System.out.println("Enter array elements :");
       int[] arr = new int[n];
       for (int i = 0; i < n; i++) {
           arr[i] = sc.nextInt();
       }
       System.out.println("Enter target element : ");
       int target = sc.nextInt();
       if (arr.length == 0) {
           System.out.println("-1");
       }
       boolean found = false;
       System.out.println("Enter first index :");
       int ind1 = sc.nextInt();
       System.out.println("Enter second index :");
       int ind2 = sc.nextInt();
       for (int i = ind1; i < ind2; i++) {
           int ele = arr[i];
           if (ele == target) {
               System.out.println("The target element index is " + i);
               found = true;
               break;
           }
       }
       if (!found) {
           System.out.println("Not Found");
       }
       sc.close();
   }
}
