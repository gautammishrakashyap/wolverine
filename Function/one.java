// write a program to check whether is a num is prime or not

import java.util.Scanner;
public class one {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int a  = sc.nextInt();

        int flag = 0;
        for(int i = 2; i < a; i++){
            if(a%i == 0){
                flag = 1;
                break;
            }
            
        continue;
    }
    if(flag == 0){
        System.out.println("prime number");

        
    }
    else {
        System.out.println("not a prime number");
    }
}
}