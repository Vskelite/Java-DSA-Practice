//You are given a program to find count of magical numbers from 1 to N. A magical number is defined as:
//  1. Replace 0 with 1 and 1 with 2 in the binary string.
//  2. Calculate the sum of digit of modified binary string if sum is odd it means its magical number.

import java.util.Scanner;

public class magicNum {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int N =  sc.nextInt();
        sc.close();
        int sum = 0;
        int count = 0;

        for(int i = 1; i< N; i++){

            while(i > 0){
                if ((i & 1) == 1) {
                    sum += 1;
                } else {
                    sum += 2;
                }
                i = i>>1;
            }
            if(sum %2 != 0) count++;
        }

        System.out.println(count);
    }

}
