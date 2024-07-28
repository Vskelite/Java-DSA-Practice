//FInd the missing number in the array

public class missNum {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,7};
        int N = arr.length;
        missNum obj = new missNum();
        obj.missingNum(arr,N);
    }
    public void missingNum(int[] arr,int N){
         int check = ((N+1) *(N +2))/2;
        for(int i = 0; i<arr.length;i++) {
            check -= arr[i];
        }
        System.out.println(check);

    }
}
