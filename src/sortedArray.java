// check whether the array is sorted or not

public class sortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int i=0;
        if(isAscending(arr,i) || isDescending(arr,i)){
            System.out.println("Array is sorted in either ascending or descending order" );
        }else{
            System.out.println("Array is not sorted.");
        }
    }
    public static boolean isAscending(int[] arr,int i) {
        for( i  = 0; i< arr.length-1;i++){
            if(arr[i]> arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static boolean isDescending(int[] arr,int i){
        for(i = 0; i < arr.length-1; i++){
            if(arr[i] < arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
