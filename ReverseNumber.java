public class ReverseNumber {
    public static void main(String args[]){
        int input = -12345;
        System.out.println("Written Integer");
        reverseNumber(input);
    }

    //  Reverse an already initialized number
    public static int reverseNumber(int input){
        boolean isNegative = false;
        if(input < 0){
            isNegative = true;
        }
        int revNumber = 0;
        while(input !=0){
            revNumber = revNumber *10;
            revNumber = revNumber + input%10;
            input = input/10;
            System.out.println(revNumber);
        }
        if(!isNegative){
            revNumber = revNumber*-1;
        }
        return revNumber;
    }
}
