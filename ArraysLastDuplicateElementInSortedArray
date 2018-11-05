package arrays.problems;

import java.util.Arrays;

public class LastDuplicateElementInSortedArray {

  public static void main(String args[]){

    int[] a = {1, 5, 5, 6, 6, 7};
    Arrays.sort(a);
    System.out.println(a.length);
    System.out.println("-----------");

    int count =1;
    for(int i = a.length-1; i>=1; i--){
      if(a[i] == a[i-1] && count == 1 ){
        System.out.println("value = " +a[i] +"and the position =" +i);
        count++;
      }
    }
  }


}
