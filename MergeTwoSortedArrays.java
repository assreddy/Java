package com.easy;

/*Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4*/

public class MergeTwoSortedArrays {

  public static void main(String args[]) throws Exception {
    System.out.println("Merge Two Sorted Arrays");

    int[] a = {1,2,4,0, 0,0};
    int am = a.length;
    System.out.println(am);
    int[] b = {1,2,4};
    int bm = b.length;
    System.out.println(bm);
    mergeArrays(a, b, am, bm);
    for(int i=0; i< a.length; i++){
      System.out.print(a[i] +" ");
    }

  }


  public static void mergeArrays(int[] a, int[] b, int aLength, int bLength) throws Exception {
    if( aLength + bLength == a.length)
      throw new Exception("tesrfdsdf");
    if( aLength == 0 && bLength ==0)
      throw  new Exception("Invalid Length of two Arrays");

    int aIndex = (aLength-bLength)-1;
    int bIndex = bLength-1;
    int mergeIndex = aLength-1;

    while(aIndex >= 0 && bIndex >= 0){
      if(a[aIndex] > b[bIndex]){
        a[mergeIndex] = a[aIndex];
        aIndex--;
      }else {
        a[mergeIndex] = b[bIndex];
        bIndex--;
      }
      mergeIndex--;
    }

    while (bIndex >= 0){
      a[mergeIndex] = b[bIndex];
      bIndex--;
      mergeIndex--;
    }

  }

}
