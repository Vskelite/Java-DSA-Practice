//Find the maximum element in the array

import java.util.Scanner;
public class MaxElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i;
        int max = arr[0];
        sc.close();
        //To accept array input
        System.out.println("Enter elements in the array:");
        for( i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        //To print the array
        for(i = 0; i<arr.length; i++) {
            System.out.printf("arr[%d] =%d", i, arr[i]);
            System.out.println();
        }
        // To find the maximum element in the array
        for(i = 0; i<arr.length;i++){
            if( arr[i] > max){
                max = arr[i];
            }
        }
        System.out.printf("Maximum element in the array:%d",max);
    }
}
