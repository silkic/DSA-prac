package LinearSearch;
import java.util.*;
class SimpleLinearSearch {
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
        for (int i = 0; i < arr.length; i++) {
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