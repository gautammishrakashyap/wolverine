// Write a program to find the sum of the digits of a given number using a while loop.

import java.util.Scanner;  
public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter your num");
        int num = sc.nextInt();

        int sum =0;
        while(num>0){
            sum = sum + num%10;
            num = num/10;
        }
        System.out.println(sum);
    }
}