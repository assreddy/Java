
public class JavaNumaricProblems {
  /**
   * @param args
   */
  public static void main(String[] args) {
    int[] numPrime = {10,2,15,33,31,1,5};
    findPrimeNumbers(numPrime);
    System.out.println("\n"+"------------------------------");
    int givenNum = 16461;    
    checkPalindrome(givenNum);
    System.out.println("------------------------------");

    int factno = 5;
    findFactorialValue(factno);
    System.out.println("------------------------------");
    checkNumberArmstrongNumber();
    System.out.println("\n"+"------------------------------");
  }

  /**
   * Check given number is Armstrong Number or not. 
   */
  private static void checkNumberArmstrongNumber() {
    int amNo = 371;
    System.out.println("Given Number = " +amNo);
    int i,atemp;
    int cum=0;
    atemp = amNo;
    while(amNo>0) {
      i = amNo%10;
      amNo = amNo/10;
      cum = cum+i*i*i;
    }
    if (atemp == cum)
      System.out.println("Armstrong Number");     
    else
      System.out.println("NOT Armstrong Number");
  }
  /**
   * @param factno
   */
  private static void findFactorialValue(int factno) {
    System.out.println("Factorial To Find = "+factno);
    int temp = 0;
    int val = factno - 1;
    temp = factno;
    while(val > 0) {
      temp = temp*val;
      val = val-1;
    }
    System.out.println(temp);
  }
  /**
   * Check Given Number is Palindrome or not.
   * @param givenNum
   */
  private static void checkPalindrome(int givenNum) {
    System.out.println("Number to check Palindrome :" +givenNum);
    int remainder,newNumber = 0, temp;
    temp = givenNum;
    while(givenNum>0) {
      remainder = givenNum%10;
      newNumber = (newNumber*10)+remainder;
      givenNum = givenNum/10;     
    }
    if (temp == newNumber) {
      System.out.println("Given Number is Palindrome.");
    } else
      System.out.println("Given Number NOT Palindrome.");
  }

  /**
   * Find Prime and Non Prime Number in Given Array.
   * @param numPrime
   */
  private static void findPrimeNumbers(int[] numPrime) {
    int prime =0, nonprime = 0;

    printGivenArray(numPrime);
    System.out.print("\n"+"Prime Numbers= ");
    for(int i= 0;i<numPrime.length;i++) {
      if(numPrime[i]%numPrime[i] == 0 && numPrime[i]%2 !=0) {
        prime = numPrime[i];    
        System.out.print(" " +prime);
      }
    }

    System.out.print("\n"+"Non Prime Numbers = ");
    for(int i= 0;i<numPrime.length;i++) {
      if(numPrime[i]%numPrime[i] == 0 && numPrime[i]%2 !=0) {
        nonprime = numPrime[i];
        System.out.print(" " +nonprime);
      }
    }
  }

  /**
   * To Print List of Elements in Given Array.
   */
  private static void printGivenArray(int[] numPrime) {
    System.out.print("Find Prime Number from array:");
    for(int i= 0;i<numPrime.length;i++) {
      System.out.print(" " +numPrime[i]);
    }
  }
}


