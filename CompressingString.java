public class CompressingString {

    public static void main(String args[]) {

        System.out.println("Copmpressing String");
        String inputString = "aabcccccaaa";


        char[] chars = inputString.toCharArray();

        StringBuilder sb = new StringBuilder();
         int count = 1;
         char prev = chars[0];

         for( int i =1; i< chars.length-1; i++){
             char current = chars[i];
             if(current == prev){
                 count++;
             }else {
                 sb.append(prev).append(count);
                 count =1;
             }
             prev = current;
         }
        System.out.println(sb.append(prev).append(count).toString());
    }
}
