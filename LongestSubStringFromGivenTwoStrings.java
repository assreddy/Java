package StringProblems;

public class LongestSubStringFromGivenTwoStrings {

  public static void main(String args[]){

    String a="ABAB";
    String b="BABA";
    System.out.println(getCommonLongestString(a, b));
  }

  public static String getCommonLongestString(String a, String b){
    if(a.length() ==0 || b.length() ==0  || a.length() ==1|| b.length() ==1){
      return outPut;
    }

String outPut = "";
    int al = a.length();
    int bl =  b.length();
    int[][] dp = new int[al][bl];

    for(int i=0; i<al; i++){
      for(int j=0; j<bl; j++){
        if(a.charAt(i) == b.charAt(j)){
          if(i==0 || j ==0){
            dp[i][j] = 1;
          } else {
            dp[i][j] = dp[i-1][j-1]+1;
          }
          if(dp[i][j] > outPut.length()){
            outPut = a.substring(i-dp[i][j]+1, i+1);
          }
        }

      }
    }
    return outPut;
  }
}
