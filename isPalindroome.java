package StringProblems;

public class isPalindroome {

  public static void main(String args[]) {
    System.out.println("Testing Palindrome");

    String str1 = "A man, a plan, a canal: Panama";
    String str2 = "race a car";

    String newStr1 = str1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    String newStr2 = str2.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

    System.out.println(newStr1);
    System.out.println(checkPalindrome(newStr1));
    System.out.println(checkPalindrome(newStr2));

    System.out.println("-------------------------------------");
    System.out.println(newStr2);
    System.out.println(palindromeCompareStartEnd(newStr1));
    System.out.println(palindromeCompareStartEnd(newStr2));
  }

  public static boolean checkPalindrome(String str) {
    if (str == null && str.length() <= 1) {
      return true;
    }
    StringBuilder sb = new StringBuilder();
    for (int i = str.length() - 1; i >= 0; i--) {
      sb.append(str.charAt(i));
    }
    return str.equals(sb.toString());
  }

  public static boolean palindromeCompareStartEnd(String str){
    if (str == null && str.length() <= 1) {
      return true;
    }

    int start =0;
    int end = str.length()-1;
    while(start < end) {
      if(str.charAt(start) != str.charAt(end)){
        return false;
      }
      start++;
      end--;
    }
    return true;
  }
}
