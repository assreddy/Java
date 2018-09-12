/*
Find the first unique occurrence of a word in a file.
The function should return the first unique occurrence of word taking file name as input.

Also what will be the efficient data structure if the first no-repeating word is at the end of file.

Sample text in text file "Careercup is a good site Careercup provides a lot of information"
1st unique occurrences of word.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FirstUniqueOccurenceOfWordInFile {

    public static void main(String args[]) throws IOException {
        String str = "testfile.txt";
        BufferedReader br = new BufferedReader(new FileReader(new File(str)));
        String line;
        String[] wordsArray = null;
        while((line = br.readLine()) != null){
            wordsArray = line.split(" ");
        }
        HashMap<String, Integer> stringMap = new LinkedHashMap<>();
        List<String> singleWordList = new ArrayList<>();
        for(int i=0; i<wordsArray.length-1; i++){
            String word = wordsArray[i];
            if(stringMap.containsKey(word)){
                stringMap.put(word, stringMap.get(word).intValue()+1);
            }else{
                stringMap.put(word, 1);
            }
        }
        for(Map.Entry<String, Integer> wordMap : stringMap.entrySet()){
            System.out.println(wordMap.getKey() +":" +wordMap.getValue());
            if(wordMap.getValue() == 1){
                singleWordList.add(wordMap.getKey());
            }
        }

        System.out.println("singleWordList ==> " +singleWordList.get(0));
    }
}
