import java.util.Scanner;
public class two {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your num");
        int num = sc.nextInt();
        
        for(int i=1; i<10; i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}
// #Write a program to print the multiplication table of a given number.