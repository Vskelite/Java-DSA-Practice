//Write a program to find the factorial of a number.
import java.util.Scanner;
public class factorial{
    public static int findFactorial(int num){
        int fact = 1;
        if(num == 0 || num == 1){
            return 1;
        }

        for(int i = 1; i<=num; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        System.out.println("Factorial is: " + findFactorial(num));
    }
}