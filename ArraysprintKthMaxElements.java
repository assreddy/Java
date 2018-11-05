package arrays.problems;

import java.util.Arrays;

public class printKthMaxElements {

  public static void main(String args[]){
    int[] a = {10, 50, 30, 60, 15};
    Arrays.sort(a);
    int kthElemetns = 3;
    for(int i =a.length-1; i>=kthElemetns ; i--){
      System.out.println(a[i]);
    }
  }
}
