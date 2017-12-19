import java.util.*;

public class JavaSimpleIntegerProblems {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter Number to get Fibonacci values");
    int numFib = input.nextInt();
    FibonacciSeries(numFib);
    System.out.println("\n" +"-----------------------------------");

    System.out.println("KeyInput to get list of even and odd numbers");
    findEvenOddNumbers(input);
    System.out.println("\n" +"-----------------------------------");

    int[] numArray = new int[]{5,10,60,50,20,10,5,5,10};
    System.out.print("List of elements in an Array =");
    findRepitativeNumbersAndCount(numArray);
    System.out.println("-----------------------------------");

    int[] diffArray = new int[]{1,6,3,4,5};
    findMaxDifferenceInTwoElements(diffArray);
    input.close();

  }

  /**
   * Find 2 Elements in the Array such that Difference between them is Largest
   */
  private static void findMaxDifferenceInTwoElements(int[] diffArray) {

    int diff_greatest, diff;
    diff_greatest=0;
    int number1 =0, number2 = 0;
    System.out.print("List of Array to find the max differerence:");
    for(int i=0;i<diffArray.length;i++) {
      System.out.print(" " +diffArray[i]);  
      for(int j=0;j<diffArray.length;j++) {
        diff = Math.abs(diffArray[i] - diffArray[j]);
        if(diff > diff_greatest) {
          diff_greatest = diff;
          number1 = diffArray[i];
          number2 = diffArray[j];
        }
      }
    }
    System.out.println("\n" +"Max Difference is : " +diff_greatest);
    System.out.println("The Two values are : " +number1 +" and " +number2);
  }

  /**
   * Find the Number of Non-Repeated Elements in an Array.
   * @param numArray
   */
  private static void findRepitativeNumbersAndCount(int[] numArray) {
    int flag = 0, count = 0; 
    for(int i =0;i<numArray.length;i++) {
      System.out.print(" " +numArray[i]);  
    }
    System.out.println(" ");
    System.out.print("Repeated Array Elemetns = ");
    for (int i=0;i<numArray.length;i++) {
      for(int j=0;j<numArray.length-1;j++) {
        if( i != j) {
          if(numArray[i] == numArray[j]) {
            flag = 0;
          }else {
            flag = 1;
          }          
        }

      }
      if(flag == 1) {
        count++;
        System.out.print(" " +numArray[i]);
      }

    }
    System.out.println("\n"+"Total number of repeated numbers are = " +count);
  }

  /**
   *  Print the Odd & Even Numbers in an Array.
   * @param input
   */
  private static void findEvenOddNumbers(Scanner input) {
    int numOddEven = input.nextInt();
    int[] numArray = new int[numOddEven];
    for(int i=0;i<numOddEven;i++) {
      numArray[i] = i;
    }
    System.out.print("Even Numbers = ");
    for(int i=0; i<numArray.length;i++) {
      if(numArray[i] % 2 == 0) {
        System.out.print(" " +numArray[i]);
      } 
    }
    System.out.println("");
    System.out.print("Odd Numbers=");
    for(int i=0; i<numArray.length;i++) {
      if(numArray[i] % 2 != 0) {
        System.out.print(" " +numArray[i]);
      } 
    }
  }

  /**
   * Fibonacci Series of given number.
   * @param numFib
   */
  private static void FibonacciSeries(int numFib) {
    int first = 0;
    int second = 1;
    System.out.print("Fibonacci Searis =  " +first +" "+second);
    int count = numFib; 
    for(int i = 2; i<numFib; i++) {
      count = first + second;      
      first = second;
      second = count;      
      System.out.print(" " +count);
    }
  }

}

/*
OUTPUT::
Enter Number to get Fibonacci values
10
Fibonacci Searis =  0 1 1 2 3 5 8 13 21 34
-----------------------------------
KeyInput to get list of even and odd numbers
10
Even Numbers =  0 2 4 6 8
Odd Numbers= 1 3 5 7 9
-----------------------------------
List of elements in an Array = 5 10 60 50 20 10 5 5 10 
Repeated Array Elemetns =  10 60 50 20 10 10
Total number of repeated numbers are = 6
-----------------------------------
List of Array to find the max differerence: 1 6 3 4 5
Max Difference is : 5
The Two values are : 1 and 6

 */

