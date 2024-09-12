//Write a program to find the GCD of two numbers.

import java.util.Scanner;

public class GCD {
     
    public static int findGCD(int num1, int num2){

        if ( num1 == 0) 
            return num2;
        
        if (num2 == 0) 
            return num1;

        if ( num1 == num2)
            return num1;

        if( num1 > num2){
            if ( num1 % num2 == 0) {
                return num2;
            }
            return findGCD(num1 - num2, num2);
        }
        
        if( num2 > num1)
            if (num2 % num1 == 0) {
                return num1;
            }
            return findGCD(num1, num2 - num1);
}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = sc.nextInt();
        
        System.out.println("GCD of " + num1 +" and "+ num2 + " is " + findGCD(num1, num2));
        sc.close();
    }
}
