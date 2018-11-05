package arrays.problems;

import java.util.Arrays;

public class SumOfNonRepititiveElements {
  public static void main(String args[]) {

    int arr[] = {12, 10, 9, 45, 2, 10, 10, 45, 10};
    //12+10+9+45+2 ==> 78

    Arrays.sort(arr);
    System.out.println(sum(arr));
  }

  public static int sum(int[] a){
    int j =1;
    int sumTotal = 0;
    int count =1;
    for(int i=0; i< a.length-1; i++){
      if(a[i] != a[j]){
        System.out.print(a[i] +" ") ;
        sumTotal = sumTotal+a[i];
        j++;
      } else {
        if(count == 1) {
          sumTotal = sumTotal + a[i];
          count++;
        }
      }
    }
    return  sumTotal;
  }

}
