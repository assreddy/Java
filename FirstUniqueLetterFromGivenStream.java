/*
Find the first non-repeating character in a stream of characters?
1. Take a boolean[] ascii=new boolean[256];
        2. For each character in stream,make ascii[ascii value of that character]=true;
        3. if a new character comes, if(ascii[ascii value of that character]==false) return that character;
        else {
        ascii[ascii value of that character]=true;
        go to next character;
        }
        Note:- We don't have to store the characters coming in the stream..its just sufficient to check which character is 1st non repeating character

        Time Complexity: O(n)
        Space Complexity: O(1)*/

import java.util.ArrayList;
import java.util.List;

public class FirstUniqueLetterFromGivenStream {
    public static void main(String args[]){
        String stream = "geeksforgeeksandgeeksquizfor";
        List<Character> listStirng = new ArrayList();
        for(int i =0; i<stream.length(); i++){
            char c = stream.charAt(i);
                if(!listStirng.contains(c)){
                    listStirng.add(c);
                } else{
                    listStirng.remove((Character) c);
                }
            }

        if(listStirng.size() !=0){
            System.out.println(listStirng.get(0));
        }
    }
}
