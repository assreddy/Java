package StringProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class isUniqueCharacterString {

  public static void main(String args[]){
    System.out.println(charUnequeUsingSet("abcde"));
    System.out.println(charUnequeUsingSet("abcccb"));
    System.out.println("-------------");
    System.out.println(charsUnequeArraySort("abcde"));
    System.out.println(charsUnequeArraySort("abcccb"));

    System.out.println("-------------");
    System.out.println(charUnequeTwoForLoops("abcde"));
    System.out.println(charUnequeTwoForLoops("abcccb"));
  }

  public static boolean charsUnequeArraySort(String str){
    char[] strArray = str.toCharArray();
    Arrays.sort(strArray);
    for(int i=0; i< strArray.length-1;i++){
      if(strArray[i] == strArray[i+1]){
        return false;
      }
    }
    return true;
  }

  public static boolean charUnequeTwoForLoops(String str){

    for(int i=0; i< str.length();i++){
      for(int j=i+1; j<str.length(); j++){
        if(str.charAt(i) == str.charAt(j)){
          return false;
        }
      }
    }
    return true;
  }

  public static boolean charUnequeUsingSet(String str){

    Set<Character> set = new HashSet<>();
    for(int i=0; i<str.length();i++){
      if(!set.contains(str.charAt(i))){
        set.add(str.charAt(i));
      } else{
        return false;
      }
    }
    return true;
  }

}
