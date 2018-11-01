package StringProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IsAnagrams {

  public static void main(String args[]){
    System.out.println("Testing Anagarams");

    System.out.println(anagramsConvertToArraySort("anagram", "nagaram"));

    System.out.println(anagramsMapsCount("anagram", "nagaram"));
  }

  // Convert String into Arrays and Sort.
  public static boolean anagramsConvertToArraySort(String str1, String str2){

    if(str1 == null || str2 == null || str1.length() != str2.length()){
      return false;
    }
    if(str1.equals(str2)){
      return true;
    }

    char[] str1Array = str1.toCharArray();
    char[] str2Array = str2.toCharArray();
    Arrays.sort(str1Array);
    Arrays.sort(str2Array);
    String s1 = new String(str1Array);
    String s2 = new String(str2Array);
    System.out.println(s1);
    System.out.println(s2);
    return s1.equals(s2);
  }

  // Using hasMap To Store and Check Number of time each Letter from Word 1 to word 2 
  public static boolean anagramsMapsCount(String str1, String str2){

    if(str1 == null || str2 == null || str1.length() != str2.length()){
      return false;
    }
    if(str1.equals(str2)){
      return true;
    }

    Map<Character, Integer> mapString = new HashMap<>();
    for(int i=0; i<str1.length();i++){
      char str1Char = str1.charAt(i);
      char str2Char = str1.charAt(i);
      if(!mapString.containsKey(str1Char)){
        mapString.put(str1Char, 0);
      }
      if(!mapString.containsKey(str2Char)){
        mapString.put(str2Char, 0);
      }
      mapString.put(str1Char, mapString.get(str1Char) +1);
      mapString.put(str2Char, mapString.get(str2Char) -1);
    }

    for(Map.Entry<Character, Integer> m: mapString.entrySet()){
      System.out.println(m.getKey() +":" +m.getValue());
      if(m.getValue() != 0){
        return false;
      }
    }
    return true;
  }

}
