// Write a program to swap two numbers without using a third variable.

import java.util.Scanner;
public class three{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();

        System.out.println("enter the second number");
        int b = sc.nextInt();

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("the first num is "+ a + " and the second num is "+ b);


        
    }

}
