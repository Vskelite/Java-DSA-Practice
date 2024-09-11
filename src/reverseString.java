// Write a program to reverse a string in java.
import java.util.Scanner;
public class reverseString{

    public static String reverse(String str){
        String newString = "";
     for( int i = str.length() -1; i>=0; i-- ){
         newString += str.charAt(i);
     }
     return newString;
    }

    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.err.println(reverse(str));
        sc.close();
    }
}