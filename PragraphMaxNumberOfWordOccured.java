package StringProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PragraphMaxNumberOfWordOccured {

  static Integer maxCount =0;

  public static void main(String args[]){
    String para = "Given a paragraph of words, give an algorithm for finding the word which\n"
        + "appears the maximum number of times. If the paragraph is scrolled down (some words\n"
        + "disappear from the first frame, some words still appear, and some are new words, give\n"
        + "the maximum occurring word. Thus, it should be dynamic some.";

    System.out.println(para);
    List<String> maxOccuredWords = occurenceWord(para);
    for(String maxWords: maxOccuredWords){
      System.out.print(maxWords +" " +maxCount);
    }
  }

  public static List<String> occurenceWord(String str){
    String[] words = str.split(" ");
    for(int i=0; i<words.length; i++){
      String eachWord = words[i];
      if(eachWord.contains(".") || eachWord.contains(",") || eachWord.contains("!") || eachWord.contains(")")) {
        words[i] = words[i].substring(0, words[i].length()-1);
      } else if(eachWord.contains("(")){
        words[i] = words[i].substring(1, words[i].length());
      }
    }

    HashMap<String, Integer> wordMap = new HashMap<>();
    for(int i=0; i< words.length; i++){
      if(wordMap.containsKey(words[i])){
        wordMap.put(words[i], wordMap.get(words[i]) +1);
      } else {
        wordMap.put(words[i], 1);
      }
    }
    maxCount = (Collections.max(wordMap.values()));
    List<String> listWords = new ArrayList<>();
    for(Map.Entry<String, Integer> entity : wordMap.entrySet()){
      if(maxCount.equals(entity.getValue())){
        listWords.add(entity.getKey());
      }
    }
    return listWords;
  }

}
