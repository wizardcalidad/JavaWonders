/*Write a program that prompts the user to input an integer and then
outputs the number with the digits reversed. For example, if the input is
12345, the output should be 54321.*/

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any five number");
        int num = sc.nextInt();

        if (num !=0){
            int a = num/10000;
            int b = (num%10000) / 1000;
            int c = ((num%10000)%1000)/100;
            int d = (((num%10000)%1000)%100)/10;
            int e = ((((num%10000)%1000)%100)%10)/1;

            System.out.println("The answers are "+ e + d + c + b + a);
        }
    }
}
