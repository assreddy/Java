package arrays.problems;

import java.util.Arrays;

public class MostFrequentElement {
  public static void main(String args[]){
    int[] a = {10, 20, 10, 20, 30, 20, 20};
    Arrays.sort(a);
    System.out.println(maxFrequencyCount(a));
  }

  public static int maxFrequencyCount(int[] a){

    int maxCount = 1;
    int currentCount = 0;
    int res = a[0];

    for(int i=1; i< a.length; i++ ) {

      if (a[i] == a[i - 1]) {
        currentCount++;
      } else {
        if (currentCount > maxCount) {
          maxCount = currentCount;
          res = a[i - 1];
        } else {
          currentCount = 1;
        }
      }
    }
    if(currentCount > maxCount){
      maxCount = currentCount;
      res = a[a.length-1];
    }

    System.out.println("Element = " +res +" and frequency = " + maxCount);
    return  res;
  }

}
