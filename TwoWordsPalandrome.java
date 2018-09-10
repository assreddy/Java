import java.util.Arrays;

public class TwoWordsPalandrome {

    public static void main(String args[]){
        String str1 = "DAD1";
        //char[] strArray = str1.toCharArray();
        String rString = "";

        for(int i=str1.length()-1; i>=0; i--){
            rString = rString+ String.valueOf(str1.charAt(i));
        }
        System.out.println(rString);

        if(rString.equals(str1)){
            System.out.println("String Palandrome");

        }else {
            System.out.println("NOT");
        }
    }
}
