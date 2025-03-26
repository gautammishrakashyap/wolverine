// Write a program to check whether a number is even or odd.

import java.util.Scanner;

public class four{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();

        if(a%2!=0){
            System.out.println("the number is odd");
        }
        else{
            System.out.println("the number is even");
        }
        }

    }

