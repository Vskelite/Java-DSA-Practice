// Remove duplicates from the array

import java.util.Arrays;

public class removeDupli {
    public static void main(String[] args){
        int[] arr ={1,1,2,3,3,4,5};
        int[] ans = new int[arr.length];
        removeDupli obj = new removeDupli();
        System.out.println(obj.duplicate(arr, ans));
    }
    public String duplicate(int[] arr,int[] ans){
        for(int i = 0;i< arr.length;i++){
            for(int j = i+1; j<arr.length;j++){
                if (arr[i] == arr[j]) {
                    ans = new int[]{arr[i]};
                }
            }
        }
        return Arrays.toString(ans);
    }
}
