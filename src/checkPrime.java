//Write a program to check if a number is prime.
import java.util.Scanner;
public class checkPrime{

     public static boolean prime(int num){
        if(num <= 1){
            return false;
        }
        for(int i = 2; i<Math.sqrt(num); i++){
            if( num % i == 0){
                return false;
            }
        }
        return true;
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        if( prime(num)){
            System.out.println(num + " is a prime number.");
        }else{
            System.err.println(num + " is not a prime number.");
        }
    }
}