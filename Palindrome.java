/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome.prime.number;

import java.util.Scanner;

public class PalindromePrimeNumber {

    public static void main(String[] args) {
        int sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number to check if it's a palindrome Prime number.");
        int number = input.nextInt();
        int num = number;
        int n = number;
        int i,c=0, flag = 1;
        while(flag == 1){
            for ( i = 1; i <= n; i++){
                if ((n % i) == 0)
                    c++;    
            }
            if (c == 2){
                System.out.println("The number is prime, now checking if its palindrome.");
                flag = 0;
                while (number>0){
                    int L = number % 10;
                    sum=(sum * 10) + L;  
                    number /= 10;
            
                    System.out.println("L = " + L);
                    System.out.println("number = "+ number);
            
                    System.out.println("sum = " + sum);
                    System.out.println();
                }
                if (sum == num)
                    System.out.println("The given number is a palindrome prime number.");
            }
            else {
                System.out.println("Sorry the number is not prime, thus it can not be a Palindrome prime number.");
                break;
            }
        } 
    }
}
