// Segregate the array

import java.util.Arrays;
public class segreArr {
    public static void main(String[] args){
        int[] arr = {0,1,0,1,0};
        int[] seg = new int[arr.length];
        segreArr obj = new segreArr();
        System.out.println(obj.segArray(arr, seg));
    }
    public String segArray(int[] arr,int[] seg){
        int count =0;
        for (int j : arr) {
            if (j == 0) {
                count++;
            }
        }
        for(int i = 0; i<count; i++){
            seg[i] = 0;
        }
        for(int i = count; i<seg.length;i++){
            seg[i] = 1;
        }
         return Arrays.toString(seg);
    }
}
