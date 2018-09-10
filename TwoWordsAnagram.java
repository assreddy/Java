/*
Two String are Anagram Or not
 */

import java.util.Arrays;

public class TwoWordsAnagram {

    public static void main (String args[]){
        String str1 = "LISTEN";
        String str2 =  "SILENT";

        char[] str1Array = str1.toCharArray();
        Arrays.sort(str1Array);

        char[] str2Array = str2.toCharArray();
        Arrays.sort(str2Array);
        System.out.println(str1Array);
        System.out.println(str2Array);
        Boolean isAnagram = false;
        for( int i=0 ; i<str1Array.length-1; i++) {

            if (str1Array[i] == str2Array[i]) {
                isAnagram = true;
            } else {
                isAnagram = false;
            }

        }
        System.out.println(isAnagram);

    }
}
