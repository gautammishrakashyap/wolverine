import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int a = sc.nextInt();

        int flag =1;

        for(int i = 2; i<= a; i++){
            flag *= i;

        }
        System.out.println(flag);
        // Mistake: The loop should run from 1 to 'a' (inclusive) to calculate the factorial correctly.
        // Also, the initial value of 'flag' should be 1, not multiplied by 'i' in each iteration.

        System.out.println("The factorial of " + a + " is: " + flag);
    
    }
}