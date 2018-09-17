/*Given an array of sorted integers and find the closest value to the given number. Array may contain duplicate values and negative numbers.
    Example : Array : 2,5,6,7,8,8,9
    Target number : 5
    Output : 5
    Target number : 11
    Output : 9
    Target Number : 4
    Output : 5*/
public class ClosestValueInAGivenArrary {

  public static void main(String args[]) {
    int[] ar = {2, 5, 6, 7, 8, 8, 9};
    int closeValue = 22;
    System.out.println("==> at index " +closetInt(ar, closeValue) );

  }
  private static int closetInt(int[] ar, int target){

    if(ar.length==1) {
     return Math.abs(target);
    } if(ar.length==0){
      throw new RuntimeException("Input size is 0");
    }
    int index = helper(ar, target, 0, ar.length);
    return index-1;

//      return Math.min(Math.abs(target-ar[index]), Math.abs(target-ar[index-1]));

  }

  private static int helper(int[] ar, int target, int start, int end){
    if((end-start) ==1 || end-start ==0){
      return end;
    }
    int mid = (start+end)/2;
    if(ar[mid] > target){
       return helper(ar, target, start, mid);
    }else {
      return helper(ar, target, mid+1, end);
    }
  }
}
