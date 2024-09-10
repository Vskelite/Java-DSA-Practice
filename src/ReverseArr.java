// Reverse the given array

public class ReverseArr {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int[] Reverse = new int[arr.length];
        int i = 0;
        int j = arr.length - 1;

        while( i < arr.length){
            Reverse[i] = arr[j];
            i++;
            j--;
        }
        for(int k = 0; k < Reverse.length; k++){
            System.out.print(Reverse[k] +" ");
        }
    }
}
