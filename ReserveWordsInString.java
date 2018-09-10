/*        How do you reverse the words in a linked list?
        For ex, Convert " H-e-l-l-o- -W-o-r-l-d " (There is a space between the word), into " o-l-l-e-H- -d-l-r-o-W "

        Write a Java code to use as less Space Complexity as possible. (So not too many spaces should be used)
*/

public class ReserveWordsInString {

    public static void main(String args[]){
        String givenString = "Hello World";
        StringBuilder sb = new StringBuilder();
        for(int i=givenString.length()-1; i>=0; i--){
            sb.append(givenString.charAt(i));
        }
        System.out.println(sb);
    }
}
