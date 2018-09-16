/*
Merge two Array and remove duplicate and Sort the array.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergingTwoArraysAndSort {

  public static void main(String args[]){
    System.out.println("Two Arrays Merge");
    int[] a = {3,5,6};
    int[] b = {8,2,4,6};
    int[] c = mergeTwoArrays(a, b);
    Arrays.sort(c);
    Set<Integer> setArray = new HashSet<>();

    for(int x=0; x<c.length;x++){
      setArray.add(c[x]);
    }

    System.out.print("Set Values==");
    for(Integer i : setArray){
      System.out.print(i +"  ");
    }
  }

  private static int[] mergeTwoArrays(int[] a , int[] b){
    int[] c = new int[a.length + b.length];
    int counter = 0;
    if(a.length==0 && b.length==0){
      return a;
    }else if(a.length==0){
      return b;
    }else if(b.length==0){
      return a;
    }else{
      for(int i =0; i<a.length;i++){
        c[i] = a[i];
        counter++;
      }
      for(int j=0; j<b.length;j++){
        c[counter++] = b[j];
      }
    }
    return c;
  }

}
