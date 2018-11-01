package StringProblems;

import java.util.HashMap;
import java.util.Map;

public class convertRomanToInteger {
  public static void main(String args[]){
    System.out.println(convertRomanNumberToIntegerNumber("CI"));
  }

  public static int convertRomanNumberToIntegerNumber(String str){
    if(str == null || str.length() ==0){
      return 0;
    }

    Map<Character, Integer> map = new HashMap<>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);

    int num = map.get(str.charAt(str.length()-1));

    for(int i= str.length()-2; i>=0; i--){
      if(map.get(str.charAt(i)) < map.get(str.charAt(i+1))){
        num = num -map.get(str.charAt(i));
      } else {
        num = num + map.get(str.charAt(i));
      }
    }
    return num;
  }

}
