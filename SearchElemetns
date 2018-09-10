public class SearchAlgorithms {

    public static void main(String args[]){
        System.out.println("Testing");

        int[] givenArray = {10,20,30,40,50,60,70,80,90};

        int position = binarySearch(givenArray,20);

        if(position != Integer.MAX_VALUE){
            System.out.println("Element found in posiotion " +position );
        } else{
            System.out.println("Element not found");
        }

        System.out.println(leanerSearch(givenArray, 56));
    }

    public static int binarySearch(int[] givenArray , int keyValue) {
        int high = givenArray.length - 1;
        int low = 0;
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = (low + high) / 2;
            if(givenArray[mid] < keyValue ){
                low = mid +1;
            } else if (givenArray[mid] > keyValue){
                high = mid -1;
            } else if (givenArray[mid] == keyValue){
                index = mid;
                break;
            }
        }
        return index;
    }

    public static int leanerSearch(int[] givenArray, int keyValue) {
        int indexFound = 0;
        for (int i = 0; i < givenArray.length - 1; i++) {
            if (givenArray[i] == keyValue) {
                indexFound = i;
            }
        }
        return indexFound;
    }
}
