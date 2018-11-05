package arrays.problems;

import java.util.Arrays;

public class MaxDiffTwoSubSetOfArrays {

  public static void main(String args[]){
    int[] a = {5, 8, 11, 40, 15};
    Arrays.sort(a);
    System.out.println(maxDiff(a, 2));
  }

  public static int maxDiff(int[] a, int m){
    int set1 =0;
    int set2 =0;
    for(int i = 0; i<m; i++){
      set1 = set1 + a[i];
    }
    for(int i = a.length-1; i>=a.length-m; i--){
      set2 = set2 + a[i];
    }
    return set2-set1;
  }
}
