package arrays.problems;

public class MinMaxInArray {

  public static void main(String args[]){
    int[] a = { 12, 1234, 45, 67, 1 };
    System.out.println(getMax(a));
    System.out.println(getMin(a));
  }

  public static int getMax(int[] a){
    int output = a[0];
    for(int i=1; i< a.length;i++){
      output = Math.max(output, a[i]);
    }
    return output;
  }

  public static int getMin(int[] a){
    int output = a[0];
    for(int i=1; i< a.length;i++){
      output = Math.min(output, a[i]);
    }
    return output;
  }

}
