import java.util.Scanner;
public class one {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your num");
        int num =sc.nextInt();
        
        if(num>0){
            System.out.println("positive");
            
        }
        else if(num<0){
            System.out.println("negative");
            
        }
        else{
            System.out.println("Zerooooooooo");
        }
    }
}
// Write a program to find whether a given number is positive, negative, or zero.