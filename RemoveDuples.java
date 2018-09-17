import java.util.HashSet;
import java.util.Set;

public class RemoveDuples {

  public static void main(String args[]){
    int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
    int n = arr.length;
    n = duplicatesUsingArray(arr, n);

    for(int i=0; i<n; i++){
      System.out.print(arr[i]+ " ");
    }

    System.out.println( "\n" +"-----------------------");
    duplicatesUsingSet(arr);

  }
  // without Array iterator
  private static int duplicatesUsingArray(int[] arr, int n){
    int[] temp = new int[n];

    int j=0;
    for(int i=0; i<n-1;i++){
      if(arr[i] != arr[i+1]) {
        temp[j++] = arr[i];
      }
    }
    temp[j++] = arr[n-1];

    for(int i=0; i<j;i++){
      arr[i] = temp[i];
    }
    return j;

  }

  private static void duplicatesUsingSet(int[] arr ) {

    Set<Integer> setArray = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      setArray.add(arr[i]);
    }
    for (Integer s : setArray) {
      System.out.print(s + " ");
    }
  }


}
