package LinearSearch;
import java.util.*;
public class StringLinearSearch {
  public static void main(String[] args) {
      Scanner sc  =new Scanner(System.in);
      System.out.println("Enter a string : ");
      String str = sc.next();
      System.out.println("Enter your target : ");
      char target = sc.next().charAt(0);
      boolean found = false;
      for(int i = 0; i< str.length();i++){
          if(str.charAt(i) == target){
              found = true;
          }
      }
      System.out.println(found);
      sc.close();
  }
}

