// Write a program to print all even numbers between 1 and a user-given number n using a while loop.

import java.util.Scanner;   
public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your num");
        int num = sc.nextInt();
        int i=1;
        while(i<=num){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
    }
}

