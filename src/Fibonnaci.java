//Write a program to find the Fibonacci series up to n terms.
import java.util.Scanner;

public class Fibonnaci {
    public static void findFibonnaci(int num){
        int n1 = 0;
        int n2 = 1;
        
        for(int i = 0; i < num; i++){
            System.out.print(n1 + " ");
            
            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        System.out.print("Fibonnaci series: ");
        findFibonnaci(num);
    }
}
