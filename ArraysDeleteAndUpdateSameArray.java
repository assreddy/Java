package arrays.problems;

public class DeleteAndUpdateSameArray {

  public static void main(String args[]){
    int[] a = {3, 1, 2, 5, 90};
    int rNum =  2  ;

    int newSize = getSizeOfNewArrayAfterDeleteElement(a, rNum);
    for(int i=0; i< newSize; i++){
      System.out.print(a[i] + " ");
    }

  }

  public static int getSizeOfNewArrayAfterDeleteElement(int[] a , int rNum){
    int n = a.length;
    int i;
    for(i =0; i< n; i++) {
      if (a[i] == rNum) {
        break;
      }
    }
    if(i< n){
      n = n-1;
      for(int j = i; j< n; j++){
        a[j] = a[j+1];
      }
    }

    return  n;
  }
}
