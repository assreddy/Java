/*      Write a program to modify the string in following pattern,
        Change odd words to uppercase and Reverse the even words. Make sure that the spaces (multiple) between the words remains as it is.
        E.g.:
        Input : "This is a test String!!"
        Output: "THIS si A tset STRING!!"*/
public class ChangeOddwordsUpperCaseReverseEvenWords {
    public static void main(String args[]){
        String str = "This is a test String!!";
        System.out.println(changeWordUpperAndReverse(str));
    }
    // Main Method to change Even Words to Upper case and Odd words to Reverse.
    public static String changeWordUpperAndReverse(String changeString){

        String[] strArray = changeString.split(" ");
        int index = 1;
        StringBuilder sb = new StringBuilder();
        for(String word : strArray){
            String reverseWord = "";
            if(index%2 == 0 ){
                reverseWord = reverseString(word);
                sb.append(reverseWord).append(" ");
            }else{
                String upperWord = word.toUpperCase();
                sb.append(upperWord).append(" ");
            }
            index++;
        }
        return sb.toString();
    }
    // Reverse any Word
    public static String reverseString(String word){
        String reverseWord = "";
        for(int i =word.length()-1; i>=0; i--){
            reverseWord = reverseWord+word.charAt(i);
        }
        return reverseWord;
    }
    // Time Complexity (O(n2) and Space Complexity =(O(n2)
}
