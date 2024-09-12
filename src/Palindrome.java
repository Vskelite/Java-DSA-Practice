//Write a program to check if a string is a palindrome.

import java.util.Scanner;

public class Palindrome {
    
    public static boolean checkPalindrome(String str){
        String cleanedString = str.replaceAll("\\s", "").toLowerCase();
        int n = cleanedString.length();

        for(int i = 0; i < n;i++){
            if( cleanedString.charAt(i) != cleanedString.charAt( n - i - 1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check palindrome or not: ");
        String str = sc.nextLine();
        sc.close();
        if(checkPalindrome(str)){
            System.out.println( str + " is a Palindrome");
        }else{
            System.out.println( str  + " is not a Palindrome");
        }
    }
}
