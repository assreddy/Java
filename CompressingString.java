package StringProblems;

public class CompressedStrings {

  public static void main(String args[]){
    String str ="aabbccccbbaaba";
    System.out.println(compressedString(str));

  }
  public static String compressedString(String str){
    StringBuilder sb = new StringBuilder();

    int count = 1;
    int j = 0;
    String compString = "";
    for(int i=1; i< str.length(); i++){
      char c = str.charAt(i);
      if(str.charAt(j) == c){
        count++;
      } else {
        compString = compString+str.charAt(j)+count;
        count=1;
      }
      j = i;
      System.out.println(c);
    }
    compString=compString+str.charAt(str.length()-1)+count;
    return  compString;
  }
}
